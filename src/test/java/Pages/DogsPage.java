package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DogsPage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement dalmationButton;

    public DogsPage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }

    public WebElement getDalmationButton() {
        return driver.findElement(By.linkText("K9-DL-01"));
    }
    //--------------------------------------------

    public void clickOnTheDalmation(){
        getDalmationButton().click();
    }
}
