package com.rga.neon.test.page

import geb.Module

class RiskQuestionPage  extends Module {



    static content = {
        Risk(wait:true){ $('#risk-questions > div > form > section > div:nth-child(5)') }
        RiskSave(wait:true) { $('#risk-questions > div > form > section > div:nth-child(5) > div > button.btn.btn-primary.btn-hollow') }
        allOk(wait:true) { $('#allOk') }
    }
    //
    void RiskQuestion() {
        allOk.click()
        // RisRiskSave.click()
    }
    void RiskDefault(){
        RiskQuestion()
        RiskSave.click()
    }
}
