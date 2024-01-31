package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondItemPage extends PageBase{
    public SecondItemPage(WebDriver driver) {
        super(driver);
    }
    By addToChartButton = By.className("add-to-cart");

    public void AddToChart()
    {
        clickOnElement(addToChartButton);
    }
}
