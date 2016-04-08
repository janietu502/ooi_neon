package com.rga.neon.test.page

import geb.Page

class CancellationPage extends Page {
    //  static url = '/policies/ooi/N1511000102/canx'

    static content = {

        canxPolicyRefNum(wait:true) {$('#wrapper section[class="details-area bg-grey darken-2"] li:nth-of-type(1) p').text() }
        canxReason(wait:true) { $("select[name='cancellationReason']")}
        canxinceptiondate(wait:true){ $('#canx div[class="date date-start inception-date ng-scope"] div[class="date-label bg-theme darken-1 ng-binding"]').text()}

        canxexpireddate (wait:true){ $('#canx div[class="date date-end expiry-date ng-scope"]  div[class="date-label bg-theme darken-1 ng-binding"] ').text()}
        canxriskAddr(wait:true){$('#canx').find('section').find( 'div[class="col-lg-6"]').find( 'div:nth-of-type(2)').text()}

        canxcontents(wait:true){$('#canx > div > form > section > div.timeline-wrapper > div > div:nth-child(2) > div.title.ng-binding').text()}
        canxbuilding(wait:true){$('#canx > div > form > section > div.timeline-wrapper > div > div:nth-child(1) > div.title.ng-binding').text()}
        canxagentno (wait:true){$('#canx').find(' div:nth-child(6) div.col-lg-6.with-border-left div:nth-child(1) div').text()}
        canxagentname (wait:true){$('#canx').find(' div:nth-child(6) div.col-lg-6.with-border-left div:nth-child(2) div').text()}
        canxagenttype (wait:true){$('#canx').find(' div:nth-child(6) div.col-lg-6.with-border-left div:nth-child(3) div').text()}
        canxpolicytype  (wait:true){$('#wrapper > div.page-body > div:nth-child(3) > aside > section.title-area > h3').text()}

        canxInsuredname  (wait:true){$('#wrapper > div.page-body > div:nth-child(3) > aside > section.details-area.bg-grey.darken-2 > ul > li:nth-child(9) > p').text()}

        canxpreview(wait:true){$('#canx').find('button[class="btn btn-primary btn-hollow"]')}
        canxtotaldue (wait:true){$('#wrapper strong[class="size-h2 ng-binding text-danger"]').text()}

        canxpaidAmount (wait:true){$('#canx').find("input[name=\"paidAmount\"]")}

        canxnetrefund(wait:true){$('#wrapper').find('div[class="m-t-5 clearfix"] div[class="col-6 p-r-10"]').find('strong[class="size-h4 ng-binding text-danger"]').text()}
        canxComrefund (wait:true){$('#wrapper').find('div[class="m-t-5 clearfix"] div[class="col-6 p-l-10 with-border-left"]').find('strong[class="size-h4 ng-binding text-danger"]').text()}
        canxcanceldate  (wait:true){ $('#canx').find("input", name:"cancellationDate").value()}
        canxdatebtn (wait:true){ $('#canx > div > form > section > div:nth-child(9) > div.col-lg-6.with-border-right > div:nth-child(2) > div > div > button > span')}

        canxfurtherDetails(wait:true){ $('#canx > div > form > section > div:nth-child(9) > div.col-lg-6.with-border-right > div:nth-child(4) > div > textarea')}
        canxduplicateRefno(wait:true){ $('#canx').("input[name='duplicateReferenceNumber']")}

        dualday_start(wait:true){ $('#canx').('button[class="ui-datepicker-trigger"]')}
        start_day(wait:true){ $('#ui-datepicker-div').find('tr:nth-child(4) td:nth-child(3)  a')}
        dualday_end(wait:true){ $('#canx').('button[class="glyphicon-calendar glyphicon"]')}
        end_day(wait:true){ $('#ui-datepicker-div').find('tr:nth-child(4) td:nth-child(3)  a')}
        dualDay (wait:true){ $('#canx').('input[ class="form-control bg-warning base text-white ng-scope"]')}

        timeline (wait:true){ $('div[class="timelines"]')}
        side_prorata(wait:true){ $('#wrapper').find('aside').find( 'div:nth-child(7)' ).text()}
        side_amount(wait:true){ $('#wrapper').find('aside').find( 'div:nth-child(6)' ).text()}
        side_premium(wait:true){ $('#wrapper').find('aside').find( 'div:nth-child(5)' ).text()}
        side_Fee(wait:true){ $('#wrapper > div.page-body > div:nth-child(3) > aside > section.price-area.bg-white.text-black > div:nth-child(4)' ).text()}

    }
}
