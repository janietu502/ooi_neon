package com.rga.neon.test.page

import geb.Page

import org.openqa.selenium.By

class ReportPage extends Page {

    static url = '/reports'
    static content = {

        underwriter {
            $(By.xpath('//*[@id="main"]/div/div/ui-view/div/div/div/form/div[1]/select')
                    )
        }

        policyType {
            $(By.xpath('//*[@id="main"]/div/div/ui-view/div/div/div/form/div[2]/select')
                    )
        }

        month {
            $(By.xpath('//*[@id="main"]/div/div/ui-view/div/div/div/form/div[3]/select')
                    )
        }

        year {
            $(By.xpath('//*[@id="main"]/div/div/ui-view/div/div/div/form/div[4]/select')
                    )
        }

        generate(wait:true) { $(By.xpath('//*[@id="main"]/div/div/ui-view/div/div/div/form/button'))}
    }
}
