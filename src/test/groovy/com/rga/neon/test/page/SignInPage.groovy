package com.rga.neon.test.page

import geb.Page

import org.openqa.selenium.By

class SignInPage extends Page {


    static url = '/login'
    //static at = { title == 'In-house' }
    // static at = { url == '/login' }

    static content = {

        username(wait: true) { $('#main > div > div > div > div > div > div > form > div:nth-child(1) > input') }
        //password { $('input[name=password]')}
        password(wait: true) { $(By.xpath('/html/body/div/section/div/div/div/div/div/div/form/div[2]/input')) }
        signInButton(wait: true) { $('button[type=submit]')}
        emailErrorMessage { $('#main > div > div > div > div > div > div > form > div:nth-child(1) > span.help-block').text() }
        passwordErrorMessage { $(By.xpath('//*[@id="main"]/div/div/div/div/div/div/form/div[2]/span[2]')).text() }
        LoginName(wait:true){$('.dropdown a strong[class="ng-binding"]').text()}


    }

    void signIn(String u, String p) {
        username = u
        password = p
        signInButton.click()
    }
}
