package quru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HabrTests extends TestBase {

    @DisplayName("Проверка наличия разделов Новые/Лучшие")
    @ValueSource(strings = {"Новые", "Лучшие", "Все", "100"})
    @ParameterizedTest
    void SearchTest(String testData) {
        open("https://habr.com");
        $(".tm-navigation-filters__button").click();
        $(".tm-navigation-filters__options").shouldHave(text(testData));

    }
}
