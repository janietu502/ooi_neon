package com.rga.neon.test.page

import geb.Module

class SpecialClausesPage extends Module {

    static content = {
        SPclauses  { $('#special-clauses') }
        //SPclauses1 (wait: true) { $('#special-clauses > div > form > section > div.row > div:nth-child(1)') }
        // SPCLcheckbox (wait:true) { $('#special-clauses > div > form > section > div.row > div:nth-child(1) > div > label') }
        CheckBox  (wait:true) {$('#special-clauses').find("div", class:"checkbox").findAll()}

        SaveBtn (wait:true) { $('#special-clauses > div > form > section > div:nth-child(3) > div > button.btn.btn-primary.btn-hollow') }

        ExcessAmount  { $('#excesses') }
        EACheckBox(wait:true) {$('#excesses').find("div", class:"checkbox").findAll()}
        //      EACheckBox  (wait:true) {$('#excesses > div > form > section > div.row').find("div", class:"checkbox").findAll()}
        EASaveBtn (wait:true) {$('#excesses').find("button", type:"submit")}


        Amount{ $('#excesses').find('input[ng-model="excess.amount"]').findAll() }
        FloodAmount { $('#excesses').find("input", name:"excessAmount4759") }

        //payments
        NewPayment(wait:true){ $('#new-payment-accordion-pane').find('v-pane-header')}

        Account(wait:true){ $('#new-payment-accordion-pane').find('li:nth-child(1)')}
        Acc_fname(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"firstName").value()}
        Acc_lname(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"lastName").value()}
        Acc_amount(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"amount")}
        Payment_submit(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('button',type:"submit")}
        Cheque(wait:true){ $('#new-payment-accordion-pane').find('li:nth-child(2)')}
        Cheque_fname(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"chequeFirstName").value()}
        Cheque_lname(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"chequeLastName").value()}
        chequeAmount(wait:true){ $('input[name="chequeAmount"]')}
        chequeNumber(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form').find('input',name:"chequeNumber")}
        DirectDebit(wait:true){ $('#new-payment-accordion-pane').find('li:nth-child(3)')}
        Bth_btn(wait:true){ $('body').find('input[name:"dateOfBirth"]')}
        Bth_day(wait:true){ $('#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today')}
        SortCode(wait:true){ $('body').find('input', name:"sortCode")}
        AccNum(wait:true){ $('body').find('input', name:"accountNumber")}


        BACS(wait:true){ $('#new-payment-accordion-pane').find('li:nth-child(4)')}

        PDQ(wait:true){ $('#new-payment-accordion-pane').find('li:nth-child(5)')}
        cardNumber(wait:true){ $('input[name="cardNumber"]')}
        cardType(wait:true){ $('select[name="cardType"]')}

        expiresEndMonth(wait:true){ $('select[name="expiresEndMonth"]')}
        expiresEndYear(wait:true){ $('select[name="expiresEndYear"]')}
        validFromMonth(wait:true){ $('select[name="validFromMonth"]')}
        validFromYear(wait:true){ $('select[name="validFromYear"]')}
        securityCode(wait:true){ $('input[name="securityCode"]')}
        OnlineCredit(wait:true){ $('#new-payment-accordion-pane').find('a[href="#online-credit-card"]')}

        PayList(wait:true){ $('#payments').find('v-pane[ng-repeat="payment in payments"]').findAll()}
        // PayList(wait:true){ $('#payments .vAccordion--default v-pane-header:nth-of-type(1)')}
        PayAmount(wait:true){ $('#payments > div > section > v-accordion > v-pane:nth-child(4) > v-pane-header > div > div > div:nth-child(2)')}
        totalcost(wait:true){ $('#wrapper > div.page-body > div:nth-child(3) > aside > section.price-area.bg-white.text-black > div.total-cost.clearfix > div > strong')}

        payment(wait:true){ $(By.xpath('//button[@name=\'cardselected\'])[2]'))}

        Visa(wait:true){ $('#main').find('button[value="VISA"]')}

        VisaDebit_number(wait:true){ $('#main').find('input[name="cardnumber"]')}
        CertifyPolicy(wait:true){ $('button[ng-click="certifyPolicy()"]')}
        Regenerate (wait:true){ $('#payments > div > section > div:nth-child(4) > div > button')}


        DocumentDate (wait:true){$('#documents').find('css=label.col-sm-2.ng-binding').text()}
    }
}
