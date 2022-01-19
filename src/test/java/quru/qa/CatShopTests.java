package quru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CatShopTests extends TestBase {

    static String URL_CAT = "https://www.petshop.ru/";

    @DisplayName("Проверка поиска вкладки игрушки")

    @ValueSource(strings = {"Selenide", "Allure"})
    @ParameterizedTest
    void SearchTest() {
        open(URL_CAT);
        $(".NavBar_container__2TPcZ").$(byText("Кошки")).click();
        $(".submenu-list").$("#main-menu-194").hover();
        $("#main-menu-194-sub").shouldHave(text("Дразнилка"));

    }


}
