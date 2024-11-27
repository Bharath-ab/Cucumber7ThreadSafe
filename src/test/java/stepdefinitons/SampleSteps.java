package stepdefinitons;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;

import static io.qameta.allure.Allure.step;


public class SampleSteps {

    @Given("I launched web browser")

    public void iLaunchedWebBrowser() {
        step("Given I launched web browser");
    }

    @Given("I have dummy given file")
    public void iHaveDummyGivenFile() {
        step("Given I have dummy given file");
    }
}
