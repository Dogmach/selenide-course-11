package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTextToGithub {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void searchToGithub() {


        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("#wiki-pages-box").$(withText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }
}