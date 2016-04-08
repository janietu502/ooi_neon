package com.rga.neon.test.page
import com.rga.neon.test.page.QuotePage

import geb.Page
import com.rga.neon.test.page.QuotePage


import com.rga.neon.test.page.NewQuotePage
class NewQuotePage extends Page {

    static url = '/policies/start-quote'
    //  static at = { url == '/policies/start-quote' }
    static content = {

        homeInsurance(wait:true, to: QuotePage) { $('.ooi') }
        agentNumber(wait:true) { $('input[name=agentNumber]') }
        //        makeAQuoteButton(wait:true, to: QuotePage) { $('button[type=submit]')}
        //SPclauses  { $('#special-clauses > div > form > section > div.row') }
        searchAgent(wait:true) { $('#main').find('span[class="fake-link"]')}
        agenttype(wait:true) { $('body').find('select[name="agentType"]')}
        searchbtn(wait:true) { $('button[type="submit"]')}
        list(wait:true) { $('body').find('tbody').find('tr').findAll()}

        select7(wait:true) { $('body').find('tbody').find(' tr:nth-child(8)').find('button[]class="btn-sm btn-grey central-block"')}

    }

    void makeAQuote(String number) {
        waitFor { $('#main h2').text() == 'New Quote' }

        agentNumber = number
        homeInsurance.click()
        //     makeAQuoteButton.click()
    }

}
