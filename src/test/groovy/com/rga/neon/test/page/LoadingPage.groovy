package com.rga.neon.test.page
import geb.Page
class LoadingPage extends Page{

    static content = {

        product (wait:true){
            $('body').find(' select[name="product"]')
        }
        type (wait:true){
            $('body').find(' select[name="type"]')
        }
        reason (wait:true){
            $('body').find(' select[name="reason"]')
        }
        rate (wait:true){
            $('body').find(' select[name="rate"]')
        }

        otherReason (wait:true){
            $('body').find(' input[name="otherReason"]')
        }
        addbutton (wait:true){
            $('body').find('form[class="form-inline ng-pristine ng-invalid ng-invalid-required ng-submitted"]').find('button[class="btn-sm btn-success"]')
        }

        addbtn(wait:true){ $('body').find(' button[class="btn-sm btn-success"]') }

        manualloadingList(wait:true) {
            $('body table[class="table table-striped table-hover table-grey-head"]').find('tbody').text()
        }
        manualTable(wait:true) {
            $('body table[class="table table-striped table-hover table-grey-head"]').find('tbody')
        }

        confirm_ok (wait:true){ $('body  button[class="confirm"]') }
        confirm (wait:true){
            $('body').find(' button[class="confirm"]')
        }
        autoloadingList(wait:true) {
            $('.loadings-table-container table').eq(1).find('tbody').text()
        }
        close (wait:true){
            $('body').find(' button[class="close"]')
        }
        //  AllBtn(wait:true){ $('body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div.loadings-filters.clearfix > div > button.btn.btn-sm.btn-round.btn-theme')}

        //   AllBtn(wait:true){ $('body').find('div[class="loadings-filters clearfix"] button[class="btn btn-sm btn-round btn-theme"]')}
        // RemoveBtn(wait:true) {  $('body').find('span[class="glyphicon glyphicon-remove"]') }
        RemoveBtn(wait:true) {  $('body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div:nth-child(6) > table > tbody > tr:nth-child(1) > td:nth-child(7) > button') }
    }
}
