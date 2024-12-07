package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

import static io.qameta.allure.Allure.step;


public class SampleSteps {

    @Given("I launched web browser")

    public void iLaunchedWebBrowser() {
        step("Given I launched web browser");
    }

    @Given("I have dummy given file")
    public void iHaveDummyGivenFile() {
        step("Given I have dummy given file");
//        Assertions.fail("Test Fail Intentional");
    }
}
