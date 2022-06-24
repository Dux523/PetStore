package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetStoreMainMenu {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement dogsIcon;
    WebElement shopCartButton;
    WebElement signInButton;

    public PetStoreMainMenu(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }
    public WebElement getDogsIcon() {
        return driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]"));
    }
    public WebElement setShopCartButton(){
        return driver.findElement(By.name("img_cart"));
    }
    public WebElement getSignInButton() {
        return driver.findElement(By.linkText("Sign In"));
    }
    //-------------------------------------------
    public void clickOnDogsIcon(){
        this.getDogsIcon().click();
    }
    public void clickOnShopCartButton(){
        setShopCartButton().click();
    }
    public void clickOnSignInButton(){
        getSignInButton().click();
    }

}
