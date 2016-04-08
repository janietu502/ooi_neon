package com.rga.neon.test.ooi


import com.rga.neon.test.page.ListPolicyPage
import com.rga.neon.test.page.SignInPage
import com.rga.neon.test.page.LoadingPage
import com.rga.neon.test.page.QuotePage

import com.rga.neon.test.page.QuoteDetailPage



class UNI99Loading  extends DbSpec{
    def "[case 1] add a building loading, it should display in the manual loading table and DB"() {

        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()
        waitFor { $('#quote-details').displayed }
        form_detail.openLoadingsModalBuilding.click()

        when: 'I add a loading for building'
        waitFor { $('h4.modal-title.text-center').text() == "Loadings"}

        product = 'Building'
        type = 'Internal'
        reason = 'Load applied by RGA'
        rate = '5%'
        addbtn.click()

        //---Today

        def currenttime =  new Date()
        Calendar cal = Calendar.getInstance()
        def currentDate

        if(cal.get(cal.DAY_OF_MONTH) > 9){
            if(cal.get(cal.MONTH) > 9)
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }else{
            if(cal.get(cal.MONTH) > 9)
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }


        then: 'the cloumn should show up and created date is today.' // we can find this loading in database
        assert manualloadingList.contains("Building Internal Load applied by RGA")
        assert manualloadingList.contains(currentDate)
        close.click()
    }



    def "[case 2] Building Age is in 200-300 years old, so the auto loading should include  35% rate"() {

        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()


        waitFor { $('#quote').displayed }
        quoteBuildingyear = 1800
        quoteBuildingyear = 1801
        quoteBuildingyear = 1800

        quoteCalculateButton.click()


        when:

        waitFor { $('#quote-details').displayed }

        form_detail.openLoadingsModalBuilding.click()

        then: 'the cloumn should show up and created date is today.' // we can find this loading in database

        println autoloadingList
        assert autoloadingList.contains("35%")

    }
    def "[case 3] No claim with previous insure is 3+ years, so the auto loading should include  -10% rate"() {

        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()



        waitFor { $('#quote').displayed }
        buildingNoClaimYear  = '5'
        buildingNoClaimYear  = '4'
        buildingNoClaimYear  = '3'

        quoteCalculateButton.click()
        waitFor { $('#quote-details').displayed }

        form_detail.openLoadingsModalBuilding.click()

        when:

        //---Today

        def currenttime =  new Date()
        Calendar cal = Calendar.getInstance()
        def currentDate

        if(cal.get(cal.DAY_OF_MONTH) > 9){
            if(cal.get(cal.MONTH) > 9)
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }else{
            if(cal.get(cal.MONTH) > 9)
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }

        //---

        then: 'the cloumn should include -10%' // we can find this loading in database
        //  println manualloadingList
        //  assert autoloadingList.contains('-10%')


        println autoloadingList
        assert autoloadingList.contains("-10%")
    }


    def "[case 4] add a content loading, it should display in the manual loading table and DB"() {

        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()
        waitFor { $('#quote').displayed }
        form_detail.openLoadingsModalContent.click()

        when: 'I add a loading for building'
        product = 'Contents'
        type = 'Internal'
        reason = 'Load applied by RGA'
        rate = '5%'
        addbtn.click()

        //---Today

        def currenttime =  new Date()
        Calendar cal = Calendar.getInstance()
        def currentDate

        if(cal.get(cal.DAY_OF_MONTH) > 9){
            if(cal.get(cal.MONTH) > 9)
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = (cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }else{
            if(cal.get(cal.MONTH) > 9)
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
            else
                currentDate = "0" +(cal.get(cal.DAY_OF_MONTH)) + "/0" + (cal.get(cal.MONTH) + 1) + "/" +   cal.getWeekYear();
        }

        //---

        then: 'the cloumn should show up and created date is today.' // we can find this loading in database
        println manualloadingList
        println currentDate
        assert manualloadingList.contains("Internal Load applied by RGA")
        assert manualloadingList.contains(currentDate)
    }
    def "[case 5] No claim with previous insure is 3+ years, so the auto loading should include  -10% rate"() {

        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()


        waitFor { $('#quote').displayed }
        buildingNoClaimYear  = '5'
        buildingNoClaimYear  = '4'
        buildingNoClaimYear  = '5'
        quoteCalculateButton.click()

        when:

        waitFor { $('#quote-details').displayed }

        form_detail.openLoadingsModalBuilding.click()

        //---

        then: 'the cloumn should show up and created date is today.' // we can find this loading in database
        println autoloadingList
        assert autoloadingList.contains('-10%')


    }
    def "Remove function is working"() {


        given: 'I go to the loading page via edit quote'
        to SignInPage
        signIn 'rocky.chen', 'abcd1234'
        waitFor { LoginName == 'Rocky Chen' }

        to ListPolicyPage
        status = 'Certified'
        searchButton.click()
        menubutton.click()
        editquote[0].click()
        waitFor { $('#quote').displayed }
        form_detail.openLoadingsModalBuilding.click()

        when: 'I add a loading for building'
        def orig = manualTable.find('tr[ng-repeat="loading in manualLoadings"]').size()
        println  orig

        //      AllBtn.click()
        RemoveBtn[0].click()
        Thread.sleep(1000)

        confirm.click()
        Thread.sleep(1000)
        //---
        confirm_ok.click()
        Thread.sleep(1000)


        then: 'the cloumn should show up and created date is today.' // we can find this loading in database
        println  orig
        println  manualTable.find('tr[ng-repeat="loading in manualLoadings"]').findAll().size
        assert    manualTable.find('tr[ng-repeat="loading in manualLoadings"]').findAll().size == orig -1

    }
}
