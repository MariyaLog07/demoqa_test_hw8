package ru.desnol.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
     static void beforeAll(){
                Configuration.startMaximized=true;
    }
    @Test
    void fillFormTest() {
        String permanentAddress = "another street,1";

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Mariya");
        $("#userEmail").setValue("Mashyly1994@gmail.com");
        $("input#currentAddress").setValue("Lermontova street,1");
        $("#permanentAddress").setValue("another street,1");
        $("#submit").scrollTo().click();

        $("#output #name").shouldHave(text("Mariya"));
        $("#output #email").shouldHave(text("Mashyly1994@gmail.com"));
        $("#output p#currentAddress").shouldHave(text("Lermontova street,1"));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}