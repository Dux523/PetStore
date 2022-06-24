package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DalamationPage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement maleDalmationButton;



    public DalamationPage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }
    public WebElement getMaleDalmationButton() {
        return driver.findElement(By.linkText("EST-9"));
    }
    public void clickOnDalmationMale(){
        getMaleDalmationButton().click();
    }
}
