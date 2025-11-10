import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;

public class PracticeFormTest {

    @BeforeAll
    static void configuratedBrowse(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 300000;
    }

    @Test
    void enterData() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("asfdfs");
        $("#lastName").setValue("asfdfs");
        $("#userEmail").setValue("sobaka@gmail.com");
        $("#userNumber").setValue("8888888888");

        $("#genterWrapper").$(byText("Male")).click();

        $("[placeholder='Current Address']").setValue("asdasdasdasd");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("April")).click();
        $(".react-datepicker__year-select").$(byText("1997")).click();
        $(".react-datepicker__month").$(byText("31")).click();


        $("#hobbies-checkbox-1").parent().click();

        //uploadPicture
        $("#uploadPicture").uploadFile(new File("D:/qa/a.png"));

        $("#state").click();
        //react-select-3-option-0
        //$("#react-select-3-option-0").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        //city
        $("#city").click();
        //react-select-4-option-2
        $("#react-select-4-option-2").click();
    }
}
