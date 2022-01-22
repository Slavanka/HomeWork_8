package quru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HabrTests extends TestBase {

    //@ValueSource
    @DisplayName("Проверка наличия разделов Новые/Лучшие")
    @ValueSource(strings = {"Новые", "Лучшие", "Все", "100"})
    @ParameterizedTest
    void SearchTest_1(String testData) {
        open("https://habr.com");
        $(".tm-navigation-filters__button").click();
        $(".tm-navigation-filters__options").shouldHave(text(testData));

    }


    //@CsvSource
    @DisplayName("Проверка наличия разделов Новые/Лучшие")
    @CsvSource(value = {
            "Новые, Лучшие,Все",
            "100, 10, 50"})
    @ParameterizedTest
    void SearchTest_2(String expectedResult) {
        open("https://habr.com");
        $(".tm-navigation-filters__button").click();
        $(".tm-navigation-filters__options").shouldHave(text(expectedResult));

    }



    //@MethodSource
    static Stream<Arguments> SearchTest_3_DataProvider() {
        return Stream.of(
                Arguments.of("Новые", "Лучшие","Все"),
                Arguments.of("10","50")
        );
    }

    @DisplayName("Проверка наличия разделов Новые/Лучшие")
    @MethodSource("SearchTest_3_DataProvider")
    @ParameterizedTest
    void SearchTest_3(String expectedResult) {
        open("https://habr.com");
        $(".tm-navigation-filters__button").click();
        $(".tm-navigation-filters__options").shouldHave(text(expectedResult));

    }
}
