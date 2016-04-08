package com.rga.neon.test.page

import geb.Page

class MainPage extends Page {

    static url = '/'
    static at = { title == 'In-house' }
    static content = {
        greeting(wait: true) { $('#main-navbar-collapse > ul.nav.navbar-nav.navbar-right > li > a > strong').text() }
        //newQuote { $('#main-navbar-collapse > ul.nav.navbar-nav.navbar-left > li.dropdown.open > ul > li:nth-child(1) > a') }
        newQuote { $("a[ui-sref=main.policies.startQuote]") }
    }
}
