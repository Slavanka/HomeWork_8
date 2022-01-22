package quru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://habr.com";
        Configuration.browserSize = "1920x1080";
    }
}
