import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void configurateBrowse(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 300000;
    }

    @Test
    void enterData() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output").shouldHave(text("Alex Egorov"), text("alex@egorov.com"),
                text("Some address 1"), text("Another address 1"));

  }
}
