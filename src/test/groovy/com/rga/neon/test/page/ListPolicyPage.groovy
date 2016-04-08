package com.rga.neon.test.page
import com.rga.neon.test.page.LoadingPage
import com.rga.neon.test.page.QuotePage
import com.rga.neon.test.page.QuoteDetailPage
import geb.Page

class ListPolicyPage extends Page {

    static url = '/policies'
    //   static at = { title.text() == "Retrieve Policies"}
    static content = {
        form_detail { module QuoteDetailPage }

        title(wait:true)  {$('h2[class="primary-title size-h1"]')}
        policyRefNo { $('input[ng-model=search.prn]') }
        postcode { $('#main > div > div > ui-view > div > div > div.well.p-t-25.p-b-25 > form > div:nth-child(1) > input') }
        insuredName { $('#main > div > div > ui-view > div > div > div.well.p-t-25.p-b-25 > form > div:nth-child(2) > input') }
        agentNumber { $('#main > div > div > ui-view > div > div > div.well.p-t-25.p-b-25 > form > div:nth-child(3) > input') }
        policyType(wait:true) { $('#main > div > div > ui-view > div > div > div.well.p-t-25.p-b-25 > form > div:nth-child(5) > select') }
        status(wait:true) { $("select[ng-model='search.ps']") }
        searchButton {
            $('#main ').find("button", type:"submit")
        }

        clearButton { $('button[type=reset]') }
        moreButton(required:false) { $('#main > div > div > ui-view > div > div > div.form-group.text-center.ng-scope > button') }

        menubutton(wait:true) { $(' #main > div > div > ui-view > div > div > div.floatThead-wrapper > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > button') }
        cancellation(wait:true, to: CancellationPage) { $('#main > div > div > ui-view > div > div > div.floatThead-wrapper > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > ul > li:nth-child(2) > a') }
        editquote(wait:true, to: QuotePage) { $('#main').find('tbody td:nth-child(1)  li:nth-child(1)  ')}

        //=======
        ListCanxReason(wait:true) { $("select[name='cancellationReason']")}
        quoteBuildingyear(wait:true) {$('#quote').find('select[name="buildingYear"]') }
        quoteCalculateButton (wait:true){ $('#quote').find('button',type:'submit') }

        // ListCanxReason (wait:true){ $('#canx').find("select", name:"cancellationReason")}

    }
}
