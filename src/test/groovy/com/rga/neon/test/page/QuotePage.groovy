package com.rga.neon.test.page

import geb.Page
import com.rga.neon.test.page.NewQuotePage
import com.rga.neon.test.page.QuoteDetailPage
import com.rga.neon.test.page.QuotePage

import org.openqa.selenium.By

class QuotePage extends Page {

    static content = {

        form { module SpecialClausesPage }
        form_detail { module QuoteDetailPage }
        form_riskQ { module RiskQuestionPage }
        form_holder  { module PolicyHolderPage }
        form_payment { module PaymentPage }
        form_panel { module ReferStory }

        policyRefNo(wait:true) {
            $('#wrapper > div.page-body > div:nth-child(3) > aside > section.details-area > ul > li:nth-child(1) > p').text()
        }
        quoteBuildingAd(wait:true) { $('input[id=building-apply-ad]') }
        // quoteCalculateButton (wait:true){ $('button[type=submit]') }
        quoteCalculateButton (wait:true){ $('#quote').find('button',type:'submit') }

        ctiButton(wait:true) {$('#quote > div > section > div > label')}
        cost (wait:true) {$('#quote > div > section > div > label > strong')}
        //for="optionCTI"
        quoteDetailBuildingAd(wait:true) { $('input[id=building-apply-ad2]') }
        quoteDetailSaveButton(wait:true, required: false) { $('#quote-details > div > form > section > div:nth-child(13) > div > button.btn.btn-primary.btn-hollow') }

        findAddressButton (wait:true){$('#quote > div > section > form > div:nth-child(3) > div:nth-child(1) > div > div > button') }

        quoteaddrmsg(wait:true){ $(By.xpath('//*[@id="quote"]/div/form/section/div[2]/div[1]/div[1]/div/span')).text() }
        quoteCountymsg(wait:true) { $(By.xpath('//*[@id="quote"]/div/form/section/div[2]/div[2]/div[2]/div/span')).text() }
        quotePremise(wait:true) { $('select[ name="premise"]') }

        quoteTown{ $('input[name="riskAddress.town"]').text() }

        //general details
        quoteBedroomNumber(wait:true) { $('#quote').find('select[name="bedroomNumber"]') }
        quoteBuildingyear(wait:true) {$('#quote').find('select[name="buildingYear"]') }
        quoteBuildType(wait:true){$('#quote').find('select[ name="buildingType"]') }
        quoteListedBuilding(wait:true){ $('#quote').find('select[name="listedBuilding"]') }
        quoteFloorConstruction(wait:true){ $('#quote').find('select[name="floorConstruction"]') }

        //Roof & wall
        isFlat(wait:true) { $('#quote > div > section > form > div:nth-child(7) > div.col-lg-6.with-border-left > div > div:nth-child(1) > div > table > tfoot > tr > td:nth-child(3) > select')}
        nonFlatRoofPercent(wait:true) { $('#quote > div > section > form > div:nth-child(7) > div.col-lg-6.with-border-left > div > div:nth-child(1) > div > table > tfoot > tr > td:nth-child(2) > select')}
        //nonFlatRoof(wait:true) { $('#quote').find("select",name:"newConstructionMaterial")}

        //nonFlatRoof(wait:true){ $('#quote').find(' select[name="newRoofConstruction"]') }
        nonFlatRoof(wait:true){ $('#quote').find(' select[name="newRoofConstruction"]') }

        //nonFlatRoofPercent(wait:true) { $('#quote > div > section > form > div:nth-child(7) > div.col-lg-6.with-border-left > div:nth-child(2) > div:nth-child(2) > div > table > tfoot > tr > td:nth-child(2) > select') }
        walltype(wait:true) { $('#quote').find('select[name="newWallConstructionMaterial"]') }
        walltypePercent(wait:true)  { $('#quote').find('select[name="newConstructionPercentage"]') }
        //    nonFlatRoofRMBtn(wait:true) { $('#quote > div > section > form > div:nth-child(7) > div.col-lg-6.with-border-left > div:nth-child(2) > div:nth-child(2) > div > table > tbody > tr > td:nth-child(3) > button') }
        nonFlatRoofRMBtn(wait:true) { $('#quote').find('button[class="btn-link text-grey base"]') }

        //Addr
        postcode(wait:true)  { $('#quote').find('input[name="postcode"]')}

        premise(wait:true){ $('#quote').find('select[name="premise"premise""]')}

        addressLine1(wait:true) { $('#quote').find('input[name="line1"]')  }
        town(wait:true)  { $('#quote').find('input[name="town"]')  }.text()
        county(wait:true) { $('#quote').find('input[name="county"]')  }.text()
        country(wait:true) { $('#quote').find('input[name="country"]')   }.text()

        //lock
        DoorLock(wait:true){$('input[ name="hasDoorLock"]') }
        DoorunLock(wait:true){$('label[ for="hasDoorLockFalse"] ') }

        WinLock(wait:true){$('input[ name="hasWindowLock"]') }
        alarmSystem(wait:true) {$('select[ name="alarmSystem"]') }
        isFirstTimeBuyer(wait:true){$('input[ name="isFirstTimeBuyer"]') }
        mortgageProvider(wait:true){$('select[ name="mortgageProvider"]') }
        DateofBirthBtn(wait:true){ $('#quote > div > section > form > div:nth-child(9) > div:nth-child(5) > div > div > button > span > span')}
        DateofBirth(wait:true){ $('#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(3)')}

        //building_insured
        //buildingSumInsured(wait:true) {$('input[ name="buildingSumInsured"]') }
        Slider(wait:true){$(By.xpath('//*[@id="quote"]/div/form/section/div[3]/div[2]/div[1]/div/div/div/div/div/div[2]')) }

        buildingNoClaimYear(wait:true) { $('#quote').find("select", name:"buildingNoClaimYear")}
        buildingSumInsured(wait:true) { $('#quote').find("input", name:"buildingSumInsured")}
        buildingIsAccidental(wait:true) {$('input[ name="buildingIsAccidentalDamageApplied"]') }
        contentSumInsured(wait:true) { $('#quote').find("input", name:"contentSumInsured")}
        contentNoClaimYear(wait:true){$('#quote').find("select", name:"contentNoClaimYear") }

        totalCost(wait:true){ $('#wrapper > div.page-body > div:nth-child(3) > aside > section.price-area.bg-white.text-black > div.total-cost.clearfix > div > strong').text()}


    }


    void quoteDefaultData(String postcodeinput, int nonFRPercentinput) {

        //addr
        postcode = postcodeinput
        findAddressButton.click()
        waitFor {quotePremise.find('option').findAll().size() > 1 }
        quotePremise.find('option').find{it.value() == '0'}.click();

        //house
        quoteBedroomNumber = 1
        quoteBuildingyear = 2016
        quoteBuildType = 'House (Unspecified)'
        quoteListedBuilding = 'Not Listed'
        quoteFloorConstruction = 'Wood'

        DoorLock.click()
        WinLock.click()
        alarmSystem = "No alarm system"
        isFirstTimeBuyer.click()
        mortgageProvider = "Abbey National Building Society"

        //roof & wall
        // dragAndDropBy(Slider, 150, 0)
        nonFlatRoof = 'Standard Construction' //SIT
        nonFlatRoofPercent = 100
        isFlat = 'Non-flat'


        // nonFlatRoof = 'Asbestos'// localhost
        walltype ='Standard Construction'
        walltypePercent = 100



        DateofBirthBtn.click()
        DateofBirth.click()

        //building
        buildingSumInsured = '50000'

        buildingNoClaimYear  = 0
        contentSumInsured = '10000'
        contentNoClaimYear = 0


    }
    void QuoteunDefault(){
        quoteDefaultData('TW8 9BW',100)

        quoteCalculateButton.click()
        waitFor { cost.text()!='£0.00'}
        ctiButton.click()
        Thread.sleep(3000)

        postcode = 'YO8 8NT'
        quoteCalculateButton.click()
        Thread.sleep(3000)
    }

    void QuoteData_buildType(){

        quoteDefaultData('TW8 9BW',100)

        quoteCalculateButton.click()
        ctiButton.click()
        ctiButton.click()
        Thread.sleep(3000)
        ctiButton.click()

        quoteBuildType = 'Single Self-contained Maisonette Within a Block'
        Thread.sleep(3000)

        quoteCalculateButton.click()
        Thread.sleep(3000)
    }

    void QuoteDefault(){
        quoteDefaultData('TW8 9BW',100)

        quoteCalculateButton.click()
        waitFor { cost.text()!='£0.00'}
        ctiButton.click()

        // waitFor(3) {ctiButton.click()}

    }
}
