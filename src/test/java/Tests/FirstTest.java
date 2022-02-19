package Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    void TestTest(){
        open("http://google.com");
    }
}
