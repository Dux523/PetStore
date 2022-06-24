package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingCartPage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement returnToMainMenuButton;
    WebElement quantityTextbox;
    WebElement descriptionNameMaleDalmation;



    public ShopingCartPage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }

    public WebElement getReturnToMainMenuButton() {
        return driver.findElement(By.linkText("Return to Main Menu"));
    }

    public WebElement getQuantityTextbox() {
        return driver.findElement(By.name("EST-9"));
    }
    public WebElement getDescriptionNameMaleDalmation() {
        return driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[3]"));
    }
    //---------------------------------------------------
    public void clickOnReturnToMainMenuButton(){
        getReturnToMainMenuButton().click();
    }
    public String getAttributeFromTextbox(){
       return getQuantityTextbox().getAttribute("Value");
    }
}
