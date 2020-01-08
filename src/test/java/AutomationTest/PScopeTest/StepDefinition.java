package AutomationTest.PScopeTest;

import cucumber.api.java.en.Given;

import static AutomationTest.PScopeTest.HomePage.homePage;

public class StepDefinition {

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        homePage();
    }
}
