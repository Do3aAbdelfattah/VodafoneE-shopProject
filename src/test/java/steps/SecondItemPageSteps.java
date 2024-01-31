package steps;

import Pages.SecondItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static base.TestBase.driver;

public class SecondItemPageSteps {

    SecondItemPage SecondItemPageObject = new SecondItemPage(driver);
    
    @Then("user is redirected to the second item's page")
    public void userIsRedirectedToTheSecondItemSPage() {}

    @And("user adds second item to chart")
    public void userAddsSecondItemToChart() {
        SecondItemPageObject.AddToChart();
    }
}
