package com.rga.neon.test.page

import geb.Module

class QuoteDetailPage extends Module {
    static content = {
        titel(wait:true) { $('#quote-details > div > form > section > h2') }

        agentCommissionPercentage(wait:true) { $('input[name=agentCommissionPercentage]') }
        buildingUnderwriterExcess(wait:true) { $('select[name=buildingUnderwriterExcess]') }
        buildingVoluntaryExcess(wait:true) { $('select[name=buildingVoluntaryExcess]') }
        contentUnderwriterExcess(wait:true) { $('select[name=contentUnderwriterExcess]') }
        contentVoluntaryExcess(wait:true) { $('select[name=contentVoluntaryExcess]') }
        expiryDate(wait:true) { $('input[name=expiryDate]') }
        DetailSave(wait:true) { $('#quote-details > div > form > section > div:nth-child(13) > div > button.btn.btn-primary.btn-hollow') }
        openLoadingsModalBuilding(wait:true,to: LoadingPage) { $('#quote-details button[ng-click="openLoadingsModal(\'BUILDING\', $event)"]') }
        openLoadingsModalContent(wait:true, to: LoadingPage) { $('#quote-details > div > form > section > div:nth-child(9) > div:nth-child(6) > div > button') }
    }

    void quoteDetailInfo() {
        buildingUnderwriterExcess = 250
        buildingVoluntaryExcess = 500

        //  contentUnderwriterExcess = 100
        //  contentVoluntaryExcess = 250
    }
    void QuoteDetailDefault(){
        waitFor { $("#quote-details").displayed }

        DetailSave.click()
    }
}
