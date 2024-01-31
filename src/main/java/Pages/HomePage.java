package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By HomeLogo= By.className("logo");
    //Locator of the first selected item
    By firstItem = By.xpath( "//img[@src='https://eshop.vodafone.com.eg/ecommerce/api/asset/content/19799%20(4).png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D']");
    //Locator of the second selected item
    By secondItem = By.xpath("//img[@src='https://eshop.vodafone.com.eg/ecommerce/api/asset/content/eCommerce/121127271.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D']");
    //Locator of the search field
    By SearchField = By.id("searchInput");
     //Locator of the third item from the search results of the entered text
    By thirdItem = By.xpath("//img[@src='https://eshop.vodafone.com.eg/ecommerce/api/asset/content/Apple_Watch_Series_9_Cellular_45mm_Midnight_Aluminum_Midnight_Sport_Loop_Pure_Front_Screen__USEN.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D']");

    public void clickOnHomeLogo()
    {
        clickOnElement(HomeLogo);
    }
    public void clickOnFirstItem()
    {
        clickOnElement(firstItem);
    }
    public void clickOnSecondItem()
    {
        clickOnElement(secondItem);
    }
    public void enterNameOfItemInSearchBar(String searchText)
    {
        //Enter the third item's text in the search bar
        enterText(SearchField,searchText);
    }
    public void selectItemFromResults()
    {
        /*there are three elements found for the third item with the same locator,
         so used findElements list and get the first element which appears in the
         search result and should be selected*/
        WebElement element = driver.findElements(thirdItem).get(0);
        forceClick(driver,element);
    }
}
