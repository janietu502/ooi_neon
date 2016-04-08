package com.rga.neon.test.page

import geb.Page

import org.openqa.selenium.By
class CreateAgent extends Page {

    static url = '/agents/new'
    static content = {
        //        agentNumber(wait:true) { $("input[name='agentNumber']") }
        // companyName(wait:true) { $("input[name='companyName']") }

        agentNumber(wait:true) { $("input[name=\"agentNumber\"]")}
        companyName(wait:true) { $("input[name='companyName']")}



        DateBtn{ $(By.xpath('//*[@id="basic-information"]/div/div[3]/div/div/button/span'))}
        DateofBirth{ $(By.xpath('//*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[5]/a'))}

        savebtn(wait:true) { $("button[type='submit']") }

        //  savebtn(wait: true) { $('#basicInformation').find("button",type:"submit") }
        AgentnumberErrorMessage(wait: true) {
            $('#basic-information > div > div:nth-child(1) > div > span:nth-child(2)').text()
        }
        CompanyErrorMessage(wait: true) {
            $('#basic-information > div > div:nth-child(2) > div > span').text()
        }
        AgreeDateErrorMessage(wait: true) {
            $('#basic-information > div > div:nth-child(3) > div > div > span').text()
        }
        AccountErrorMessage(wait: true) {
            $('#basic-information > div > form > section > div.row > div:nth-child(8) > div > span').text()
        }
        FCAregulatedErrorMessage(wait: true) {
            $('#basic-information > div > form > section > div.row > div:nth-child(4) > div > span').text()
        }
        FCARefnoErrorMessage {
            $('#basic-Information > div > form > section > div.row > div:nth-child(5) > div > span').text()
        }


        agentStatus(wait:true) { $("select[name='agentStatus']") }
        ISFCA(wait:true) { $("input[id=\"isFcaTrue\"]") }
        ISNonFCA(wait:true) { $("input[id=\"isFcaFalse\"]") }

        RefNo_text (wait:true) { $("input[name='fcaReferenceNumber']") }

        // agentType(wait:true){ $("select[name='agentType']") }
        agentType(wait:true)  { $("select[name='agentType']") }
        accountManager(wait:true) { $("select[name='accountManager']") }

        //commission-----------
        //  commission (wait: true) { $('input[name="commissionRate"]') }
        commission (wait: true) { $('#commission > div > div:nth-child(1) > div > div > input') }


        //contact----
        AddBtn(wait:true) { $(By.xpath('//*[@id="contactDetails"]/div/section/v-accordion/v-pane/v-pane-header/div/div'))}
        agenttitle(wait:true) { $("select[name='title']") }
        firstName(wait:true) { $("input[name='firstName']") }
        lastName(wait:true) { $("input[name='lastName']") }
        number(wait:true) { $("input[name='contactNumber']") }
        email(wait:true) { $("input[name='email']") }

        postcode(wait:true) { $("input[name='postcode']") }
        line1(wait:true) { $("input[name='line1']") }
        line1county(wait:true) { $("input[name='county']") }
        country(wait:true) { $("input[name='country']") }

        savecontact (wait: true) { $('#contactDetails > div > section > v-accordion > v-pane > v-pane-content > div > div > form > div.action-btns.text-center.m-t-10.m-b-10 > div > button.btn.btn-primary.btn-hollow') }


    }
    void AgentData(String number) {
        agentNumber = number
        companyName = 'RGA'
        //    agentType ='FCA Broker'
        ISNonFCA.click()
        DateBtn.click()
        DateofBirth.click()
        accountManager = 'Rocky Chen'

    }
    void AgentContact(){
        agenttitle = 'Mr'
        firstName = 'Rocky'
        lastName = 'Chen'
        number = '0987654321'
        email = 'test@rentguard.co.uk'

        postcode = 'TW7 4DS'
        line1 = 'my home'
        line1county = 'london'
        country ='uk'

        //      savecontact.click()
    }
}
