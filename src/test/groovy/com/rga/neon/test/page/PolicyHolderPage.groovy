package com.rga.neon.test.page

import geb.Module

class PolicyHolderPage extends Module {

    static url = '/policies/ooi/N1509000001/new'
    //static at = { title == 'In-house' }
    static at = { url == '/policies/ooi/N1509000001/new' }
    static content = {
        //holder info

        AddNewHolder(wait:true){ $('#policyholders > div > section > v-accordion > div > div') }


        primaryholder(wait:true) {$('#policyholders').find('v-pane[ng-repeat="policyholder in policyholders"]').findAll().get(0)}
        EditPrimary (wait:true){ $('#policyholders > div > section > v-accordion > v-pane.ng-scope.ng-isolate-scope.is-expanded > v-pane-content > div > div.v-pane-content-btns.ng-scope > button.btn-sm.btn-grey.text-right') }
        //primaryholder(wait:true){ $('#policyholders > div > section > v-accordion > v-pane > v-pane-header > div > div') }
        policyholders(wait:true) { $('#policyholders > div > section > v-accordion > v-pane.accofind(rdion-new-pane.ng-scope.ng-isolate-scope > v-pane-header') }
        title(wait:true){ $('body').find("select",name:"title") }
        firstName(wait:true){ $('input[name=firstName]') }
        lastName(wait:true){ $('body ').find("input", name:"lastName") }
        //lastName(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(8) > div > input') }

        contactNumber(wait:true){ $('body ').find("input", name:"contactNumber") }
        email(wait:true){ $('body ').find("input", name:"email") }
        // Occupation
        Occupation(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(9) > div > div > ul > li > input') }
        Occupation1(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(9) > div > div > div > ul > li:nth-child(2)') }

        Birthday(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(13) > div > div > button > span > span ') }
        Birthday1(wait:true){ $('#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(3) > a') }

        //address
        postcode(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in').find("input", name:"postcode") }

        line1(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in').find("input", name:"line1") }
        county(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(8) > div > input') }
        country(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in ').find("input", name:"country") }
        savepolicyholder(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-footer > div > button.btn.btn-primary.btn-hollow') }
        cancelpolicyholder(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-footer > div > button.btn.btn-grey.btn-hollow') }
        thesameaddr(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(3) > div > button') }
        findaddr(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(2) > button') }

        premise(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(4) > div > select') }
        //(wait:true) { $('button[type=\"submit\"]') }//
        //errmsg
        titlemsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(6) > div > div.col-sm-12.p-l-0.p-r-0.has-error > span') }
        firstmsg (wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(7) > div > span:nth-child(2)') }
        lastmsg (wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(8) > div > span:nth-child(2)') }
        occupationmsg (wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(9) > div > span') }
        contactnummsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(10) > div > span:nth-child(2)') }
        emailmsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(12) > div > span:nth-child(2)') }
        birthmsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div.col-lg-6.with-border-right > div:nth-child(13) > div > span') }

        postcodemsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(2) > div > span:nth-child(2)') }
        addressmsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(5) > div > span') }
        countymsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(8) > div > span') }
        countrymsg(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(2) > div:nth-child(9) > div > span') }

        nextbutton(wait:true) { $('#policyholders > div > section > div > button') }
    }
    void HolderInfo(){//(String f_name, String l_name) {
        //  AddNewHolder.click()

        firstName = 'Hello'//f_name
        lastName = 'World'//l_name
        title = 'Mr'
        //        Occupation
        Occupation.click()
        Occupation1.click()

        postcode ='NW7 4PE'
        contactNumber = '123456789'
        email = 'hello@rentguard.co.uk'
        line1 = 'my street'
        county ='mycounty'
        country = ' my country'
        Birthday.click()
        Birthday1.click()
        savepolicyholder.click()

    }

}
