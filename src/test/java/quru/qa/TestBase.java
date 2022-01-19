package quru.qa;

import com.codeborne.selenide.Configuration;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    @BeforeAll
    static void setUp() {
        com.codeborne.selenide.Configuration.baseUrl = "https://www.petshop.ru/";
        Configuration.browserSize = "1920x1080";
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",
                Arrays.asList("disable-popup-blocking"));
    }
}
