package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DalmationMalePage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement addToCartButton;



    public DalmationMalePage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }
    public WebElement getAddToCartButton() {
        return driver.findElement(By.className("Button"));
    }
    //---------------------------------
    public void clickOnAddToCartButton(){
        getAddToCartButton().click();
    }
}
