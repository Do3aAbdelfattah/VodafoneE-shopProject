package steps;

import Pages.FirstItemsPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static base.TestBase.driver;

public class FirstItemsPageSteps {

    FirstItemsPage FirstItemPageObject = new FirstItemsPage(driver);
    HomePage HomePageObject = new HomePage(driver);

    @Then("user is redirected to the first item's page")
    public void userIsRedirectedToTheFirstItemSPage() {}

    @And("user adds first item to chart")
    public void userAddsFirstItemToChart() {
        FirstItemPageObject.AddToChart();
    }

    @Then("back to home page")
    public void backToHomePage() {
        HomePageObject.clickOnHomeLogo();
    }



}
