import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

baseUrl = "https://sit-neon.raamsys.co.uk"
//baseUrl = "http://localhost:8000"
//baseUrl = "https://cntaiping-in-house.raamsys.co.uk"
reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true

//driver = { new FirefoxDriver(); }
driver = {

    System.setProperty('webdriver.chrome.driver', '/home/janie.tu/dev/lib/chromedriver')
    new ChromeDriver()

}

waiting {
    timeout = 10
    retryInterval = 1.0
}

environments {

    'test-ie' {
        driver = {
            new RemoteWebDriver(new URL("http://test.yourdomain.com"), DesiredCapabilities.internetExplorer())
        }
    }

    'test-firefox' {
        driver = { new FirefoxDriver() }
    }

    'test-chrome' {
        driver = {
            System.setProperty('webdriver.chrome.driver', '/home/rocky/dev/lib/chromedriver')
            new ChromeDriver() 
        }
    }
}