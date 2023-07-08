package steps;

import cucumber.api.java.en.Given;
import util.TestRule;

public class CommonSteps {

    @Given("I am on the Ryanair website")
    public void acessWebsite(){
        String websiteURL = "https://www.ryanair.com/gb/en";
        TestRule.openNavegator(websiteURL);
    }

}
