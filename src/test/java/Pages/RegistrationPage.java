package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement saveAccountInformationButton;


    public RegistrationPage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }
    public WebElement getSaveAccountInformationButton() {
        return driver.findElement(By.name("newAccount"));
    }
    //-------------------------------------------
    public void clickOnSaveAccountInformationButton(){
        getSaveAccountInformationButton().click();
    }
}
