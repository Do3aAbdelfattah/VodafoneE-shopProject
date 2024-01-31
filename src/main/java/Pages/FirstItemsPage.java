package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstItemsPage extends PageBase{

    public FirstItemsPage(WebDriver driver) {
        super(driver);
    }
    //Locator of "Add to chart" button
    By addToChartButton = By.className("add-to-cart");

    public void AddToChart()
    {
        clickOnElement(addToChartButton);
    }
}
