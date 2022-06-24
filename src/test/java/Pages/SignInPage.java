package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    WebDriver driver;
    WebDriverWait wdw;
    WebElement registerNowButton;
    WebElement usernameTextbox;
    WebElement passwordTextbox;
    WebElement messageSignInFailed;
    WebElement LoginButton;



    public SignInPage(WebDriver driver, WebDriverWait wdw) {
        this.driver = driver;
        this.wdw = wdw;
    }
    public WebElement getRegisterNowButton() {
        return driver.findElement(By.linkText("Register Now!"));
    }

    public WebElement getUsernameTextbox() {
        return driver.findElement(By.name("username"));
    }

    public WebElement getPasswordTextbox() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.name("signon"));
    }

    public WebElement getMessageSignInFailed() {
        return driver.findElement(By.className("messages"));
    }

    //-------------------------------------------------
    public void clickOnTheRegisterNowButton(){
        getRegisterNowButton().click();
    }
    public void insertUsernameInTheTextbox(String username){
        getUsernameTextbox().clear();
        getUsernameTextbox().sendKeys(username);
    }
    public void insertPasswordInTheTextbox(String password){
        getPasswordTextbox().clear();
        getPasswordTextbox().sendKeys(password);
    }
    public void clickOnLoginButton(){
        getLoginButton().click();
    }
    public void textMassageSignInFailed(){
        getMessageSignInFailed().getText();
    }
}
