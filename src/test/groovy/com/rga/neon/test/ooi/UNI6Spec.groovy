package com.rga.neon.test.ooi

import com.rga.neon.test.page.ReportPage
import com.rga.neon.test.page.SignInPage
import com.rga.neon.test.util.ExcelBuilder
import com.rga.neon.test.util.PolicyBuilder
/******
 * test step 
 * 1. change file name to today
 * 2. change the month
 * 3. remove the file 
 ******/

class UNI6Spec extends DbSpec {

    def "There should be 6 policies in the March underwriter report"() {

        given: 'I have signed in'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'

        and: 'I am on the report page'
        to ReportPage

        Thread.sleep(1000)

        when: 'I fill in the form for OOI underwriter report of CTI for Feb 2016'
        underwriter.find('option').find{
            it.value() == 'CTI'
        }.click()
        policyType.find('option').find{
            it.value() == 'OWNER_OCCUPIER'
        }.click()
        month.find('option').find{
            it.value() == 'number:3'  // change
        }.click()
        year.find('option').find{
            it.value() == 'number:2016'
        }.click()

        and: 'I click generate'
        generate.click()
        Thread.sleep(3000)
        def filePath = '/home/janie.tu/Downloads/CTI_OWNER_OCCUPIER_01042016.xlsx' //change name
        def excelBuilder = new ExcelBuilder(filePath)
        def sheet = excelBuilder.getSheet(0)
        def rowCount = excelBuilder.getRowCount(sheet)
        then: 'There are 6 policies should be in the excel file'
        def countRows = db.firstRow("select count(*) as count from policies where inception_date like '%2016-03%' and status ='CERTIFIED' ")//
        println countRows.count
        println rowCount

        assert rowCount == countRows.count + 1

    }

    def "Should not have duplicate policy"() {

        when: 'I fill in the form for OOI underwriter report of CTI for Feb 2016'
        Thread.sleep(5000)

        then: 'There are 6 policies should be in the excel file'
        def filePath = '/home/janie.tu/Downloads/CTI_OWNER_OCCUPIER_01042016.xlsx'  //change name
        def excelBuilder = new ExcelBuilder(filePath)
        def sheet = excelBuilder.getSheet(0)
        def checkPolicyList = []
        sheet.each {
            def currentPolicy = it[4]
            assert !checkPolicyList.contains(currentPolicy)
            checkPolicyList.add(currentPolicy)
            //  println currentPolicy
        }
    }

    def "Should have correct content"() {

        when: 'I fill in the form for OOI underwriter report of CTI for Feb 2016'
        Thread.sleep(5000)

        then: 'There are 6 policies should be in the excel file'
        def filePath = '/home/janie.tu/Downloads/CTI_OWNER_OCCUPIER_01042016.xlsx' //change name
        def excelBuilder = new ExcelBuilder(filePath)
        def sheet = excelBuilder.getSheet(0)
        def k =0
        def checkPolicyList = []
        sheet.each {

            def currentPolicy = it[4]
            checkPolicyList.add(currentPolicy)
            def Holder = it[5]
            if(k==1){
                assert it[0] == '01HA'
                //  assert it[1] == 'February'  //change
                assert it[2] == 'W496'
                assert it[8] == 'GBP'

                db.eachRow('select * from policies p left join policy_holders ph on ph.policy_id = p.id left join customers c on c.id = ph.customer_id where  ph.is_primary_holder = true and p.reference_number =\'' +currentPolicy + '\'' ) {
                    assert Holder == "${it.title}" +" "+"${it.first_name}"+" "+"${it.last_name}"
                    //                    println "Holder: ${it.first_name}, ${it.last_name}, ${it.title}"
                    //                    println Holder
                }
            }
            k=1
        }

        def i=0
        db.eachRow('select * from policies where inception_date like \'%2016-03%\' and status =\'CERTIFIED\'  ') {
            //change
            // change
            // and status ='CERTIFIED'
            //      println "${it.reference_number}"
            i++
            //       println checkPolicyList[i]
            assert checkPolicyList[i] == "${it.reference_number}"
        }
    }
    def "Create certified policy demo"() {

        given: 'There is a test policy list and a policy builder'
        def testPolicyList = []
        def policyBuilder = new PolicyBuilder(db)


        when: 'Create two policies'
        testPolicyList.add(policyBuilder.createCertifiedPolicy())
        testPolicyList.add(policyBuilder.createCertifiedPolicy())

        then: 'I should create two policies in db'
        testPolicyList.each {

            def found = db.firstRow("select count(id) as cnt from policies where id = ?", it)
            assert found.cnt > 0
        }

        //        cleanup: 'Rollback'
        //        testPolicyList.each {
        //            println it
        //            policyBuilder.cleanTestPolicy(it)
        //        }
    }
}
