package com.rga.neon.test.page

import geb.Page

class ListAgentPage extends Page {

    static url = '/agents'
    static content = {

        agentList(wait:true) {$('#main > div > div > ui-view > div > div > div.floatThead-wrapper > table > tbody')}
    }
}
