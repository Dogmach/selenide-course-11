package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    @Test
    void shouldFindSelenideInGithub(){
        //открыть страницу
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        //нажимаем на линк
        $$("ul.repo-list li").first().$("a").click();
        //check: в заголовке встречаются selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }
}
