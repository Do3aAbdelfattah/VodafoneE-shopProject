package steps;

import Pages.ThirdItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static base.TestBase.driver;

public class ThirdItemSteps {

    ThirdItemPage ThirdItemPageObject = new ThirdItemPage(driver);
    @Then("user is redirected to the third item's page")
    public void userIsRedirectedToTheThirdItemSPage() {}

    @And("user adds third item to chart")
    public void userAddsThirdItemToChart() {
        ThirdItemPageObject.AddToChart();
    }
}
