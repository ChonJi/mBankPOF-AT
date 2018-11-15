package core;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MBankMainPage;

import static dataproviders.AppUrl.MBANK_URL;

public class SetUp {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public MBankMainPage openMBankMainPage() {
        driver.get(MBANK_URL);
        Assertions.assertThat(driver.getCurrentUrl()).isEqualTo(MBANK_URL);
        return new MBankMainPage();
    }

    @AfterSuite
    public void quit() {
        driver.quit();
    }
}
