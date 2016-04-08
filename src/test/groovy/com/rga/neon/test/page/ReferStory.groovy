package com.rga.neon.test.page

import geb.Module;
import geb.Page
import com.rga.neon.test.page.NewQuotePage
import com.rga.neon.test.page.QuoteDetailPage
import com.rga.neon.test.page.QuotePage

import org.openqa.selenium.By



class ReferStory  extends Module {
    static content = {
        agentno_rightside(wait:true) {
            $(' #wrapper > div.page-body > div:nth-child(3) > aside > section.details-area > ul > li:nth-child(6) > p').text()
        }
        status_rightside(wait:true) {
            $('#wrapper > div.page-body > div:nth-child(3) > aside > section.details-area > ul > li:nth-child(2) > p').text()
        }
        //        referbtn(wait:true) {
        //            $('ng-click="openReferralModal()"')
        //       }
        //   referbtn (wait:true){ $('#wrapper ').findAll('button',type:'button') }
        password(wait:true) {
            $('body').find('input', type:'password')
        }
        referbtn(wait:true){ $(By.xpath('//*[@id="wrapper"]/div[2]/div[2]/aside/section[4]/div/div[1]/button')) }

        authorise(wait:true) { $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > table > tbody > tr > td:nth-child(1) > div > input') }
        remark(wait:true) { $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > table > tbody > tr > td:nth-child(5) > input') }
        approve(wait:true) { $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-footer > div > button') }

        authorisedDate(wait:true) { $('body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-body > table > tbody > tr > td:nth-child(4)').text() }

        closewin(wait:true) { $(' body > div.modal.fade.ng-isolate-scope.in > div > div > form > div.modal-header > button > i') }


    }
}
