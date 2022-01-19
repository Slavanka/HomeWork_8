package quru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

    @BeforeAll
    static void setUp() {
        com.codeborne.selenide.Configuration.baseUrl = "https://www.petshop.ru/";
        Configuration.browserSize = "1920x1080";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
    }


}
