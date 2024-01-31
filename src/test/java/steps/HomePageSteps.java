package steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static base.TestBase.driver;

public class HomePageSteps {

    HomePage HomePageObject = new HomePage(driver);

    @Given("user is in home page")
    public void user_is_in_home_page() {
        //Assert that the displayed page is the home page
        Assert.assertEquals(driver.getTitle(),"Vodafone Egypt E-Shop | Online Shopping");
    }

    @When("user clicks on first item")
    public void userClicksOnFirstItem() {
        HomePageObject.clickOnFirstItem();
    }

    @And("user clicks on second item")
    public void userClicksOnSecondItem() {
        HomePageObject.clickOnSecondItem();
    }

    @And("user enters the third item's name in the search bar {string}")
    public void userEntersTheThirdItemSNameInTheSearchBar(String arg0) {
        //pass the search item name from feature file to enter it on the search bar
        HomePageObject.enterNameOfItemInSearchBar(arg0);
        //select the required item from search results list
        HomePageObject.selectItemFromResults();
    }
}
