package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PetStoreTest extends BaseTest {

    String invalidUsername;
    String invalidPassword;

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to(String.valueOf(excelReader.getStringData("URLs",1,0)));
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        petStoreMainMenu.clickOnDogsIcon();
        dogsPage.clickOnTheDalmation();
        dalamationPage.clickOnDalmationMale();
        dalmationMalePage.clickOnAddToCartButton();
        shopingCartPage.clickOnReturnToMainMenuButton();
        petStoreMainMenu.clickOnShopCartButton();
        Assert.assertEquals(shopingCartPage.getAttributeFromTextbox(),"1");
        Assert.assertTrue(shopingCartPage.getDescriptionNameMaleDalmation().isDisplayed());
        Assert.assertEquals(shopingCartPage.getDescriptionNameMaleDalmation().getText(),"Spotless Male Puppy Dalmation");
    }
    @Test
    public void testRegistration() throws InterruptedException {
        petStoreMainMenu.clickOnSignInButton();
        signInPage.clickOnTheRegisterNowButton();
        registrationPage.clickOnSaveAccountInformationButton();

    }
    @Test
    public void testSignIn() throws InterruptedException {
        petStoreMainMenu.clickOnSignInButton();
        Thread.sleep(2000);
        //invalidUsername = excelReader.getStringData("SignIn",1,0);
        invalidUsername = String.valueOf(excelReader.getIntegerData("SignIn",1,0));
        signInPage.insertUsernameInTheTextbox(invalidUsername);
        //invalidPassword = excelReader.getStringData("SignIn",1,1);
        invalidPassword = String.valueOf(excelReader.getIntegerData("SignIn",1,1));
        signInPage.insertPasswordInTheTextbox(invalidPassword);
        boolean check = false;
        //prvo moramo da kreiramo neki boolean koji cemo koristiti za assert
        //podesili smo vrednost na false i kasnije pri assertu trazimo da taj boolean bude false

        try {
            check = signInPage.getMessageSignInFailed().isDisplayed();
            //ako je element ipak pronadjen onda ce boolean postati TRUE i assert na kraju ce pasti
        } catch (Exception elkwjgjpft) {
            //U parametre catch moramo da prosledimo Exception i neki random string naziv
            //Najcesce se u parametar salje Exception e
        }
    }
    @Test
    public void unsuccesfullSignInWithInvalidUsername() throws InterruptedException {
        petStoreMainMenu.clickOnSignInButton();
        for (int i = 1; i <= excelReader.getLastRow("SignIn");i++){
            Thread.sleep(2000);

            invalidUsername = String.valueOf(excelReader.getIntegerData("SignIn",i,0));
            signInPage.insertUsernameInTheTextbox(invalidUsername);

            invalidPassword = String.valueOf(excelReader.getIntegerData("SignIn",1,1));
            signInPage.insertPasswordInTheTextbox(invalidPassword);
            signInPage.clickOnLoginButton();


        }


    }

    @AfterMethod
    public void testDeleteCoockie(){

    }
}
