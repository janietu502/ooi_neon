package com.rga.neon.test.page
import geb.Module

class PaymentPage extends Module {
    static content = {
        NewPayment(wait:true)  {$('#new-payment-accordion-pane').find('v-pane-header[class="v-pane-header ng-scope ng-isolate-scope"]')}
        //    quoteCalculateButton (wait:true){ $('#new-payment-accordion-pane').find('button',type:'submit') }
        paymentTable(wait:true){ $('#new-payment-accordion-pane').find('v-accordion[role="tablist"]')}
        //Account(wait:true) { $('a[ href="#account"]')}
        Account(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > ul > li.active > a') }
        Cheque(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > div > ul > li:nth-child(2) > a') }
        DirectDebit(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > div > ul > li:nth-child(3) > a') }
        BACS(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > div > ul > li:nth-child(4) > a') }
        PDQCredit(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > div > ul > li:nth-child(5) > a') }
        OnlineCredit(wait:true) { $('#new-payment-accordion-pane > v-pane-content > div > div > div > ul > li:nth-child(6) > a') }
        Account_table(wait:true){ $("div[id='account']")}

        accounttitle (wait:true) {$('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div.clearfix.ng-scope > div > div:nth-child(2) > div > input')}.text()
        accountFirst(wait:true){$('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div.clearfix.ng-scope > div > div:nth-child(3) > div > input')}.text()
        accountLast (wait:true) {$('body').find("input", name: "lastName")}.text()
        // accountTitle = $('#account > form > div.col-lg-6.with-border-right > div:nth-child(2) > div > input')


        //        amount(wait:true){ $('input[name="amount"]') }
        //        title(wait:true){ $('input[name="title"]') }
        //        firstName(wait:true){ $('input[name="firstName"]') }
        //        lastName(wait:true){ $('input[name="lastName"]') }
        //
        //        println rows[3].Cheque_table("input", type:"checkbox").attr('checked')
        //
        //        chequeAmount = Cheque_table.find("input", name:"chequeTitle")
        //        chequeTitle(wait:true){ $('input[name="chequeTitle"]') }
        //        chequeFirstName(wait:true){ $('input[name="chequeFirstName"]') }
        //        chequeLastName(wait:true){ $('input[name="chequeLastName"]') }
        // policyholders(wait:true) { $('#policyholders > div > section > v-accordion > v-pane.accordion-new-pane.ng-scope.ng-isolate-scope > v-pane-header') }
        // title(wait:true) { $('select[name="title"]') }
        // firstName(wait:true){ $('input[name="firstName"]') }
    }
}
