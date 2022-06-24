package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

   public WebDriver driver;
   public WebDriverWait wdw;
   public PetStoreMainMenu petStoreMainMenu;
   public DogsPage dogsPage;
   public DalamationPage dalamationPage;
   public DalmationMalePage dalmationMalePage;
   public ShopingCartPage shopingCartPage;
   public SignInPage signInPage;
   public RegistrationPage registrationPage;
   public ExcelReader excelReader;
    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        petStoreMainMenu = new PetStoreMainMenu(driver,wdw);
        dogsPage = new DogsPage(driver,wdw);
        dalamationPage = new DalamationPage(driver,wdw);
        dalmationMalePage = new DalmationMalePage(driver,wdw);
        shopingCartPage = new ShopingCartPage(driver,wdw);
        signInPage = new SignInPage(driver,wdw);
        registrationPage = new RegistrationPage(driver,wdw);
        excelReader = new ExcelReader("C:\\Users\\Ryzen\\Desktop\\PetShopExcel.xlsx");
    }
    @AfterClass
    public void tesrDown(){
//        driver.close();
//        driver.quit();
    }
}
