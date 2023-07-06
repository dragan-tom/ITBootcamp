package selenium.domaciZadatak16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DomaciZadatak16 {

    public static void main(String[] args) throws InterruptedException {

        //TC02
        String username = "student";
        String password = "Pass word123";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);

        WebElement bookStoreApplicationButton = driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
        bookStoreApplicationButton.click();
        Thread.sleep(3000);


        Cookie loginCookie1 = new Cookie("userName", "superuser99");
        Cookie loginCookie2 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InN1cGVydXNlcjk5IiwicGFzc3dvcmQiOiJQYXNzd29yZDEyMyoiLCJpYXQiOjE2ODYxNDYyODV9.tTu_l3ZkV27v9wBkUygAS_NQ4LkFirR0WMOwM7SccF8");
        Cookie loginCookie3 = new Cookie("expires", "2023-06-14T13%3A58%3A05.287Z");
        Cookie loginCookie4 = new Cookie("userID", "a71b815a-b056-4352-8c0d-c3e5ab5adca6");
        Cookie loginCookie5 = new Cookie("_gid", "GA1.2.1709944281.1686149125");
        driver.manage().addCookie(loginCookie1);
        driver.manage().addCookie(loginCookie2);
        driver.manage().addCookie(loginCookie3);
        driver.manage().addCookie(loginCookie4);
        driver.manage().addCookie(loginCookie5);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.get("https://demoqa.com/books");
        Thread.sleep(3000);

        WebElement book04 = driver.findElement(By.linkText("Speaking JavaScript"));
        book04.click();
        Thread.sleep(3000);

        WebElement addToYourCollectionButton = driver.findElement(By.cssSelector(".text-right.fullButton"));
        addToYourCollectionButton.click();
        Thread.sleep(3000);

        //sada mi se pojavi pop-up prozor potvrdjujuci da je knjiga dodata.
        // Ali ne znam kako da kliknem na OK dugme, jer mi ne da desni klik, kako bih pronasao element.
        // Probao sam na addToYourCollectionButton element da uradim sendKeys Enter, sklonio mi je pop-up prozor ali je test pukao.







//        WebElement bookStoreApplicationExpand = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]/span/svg/path"));
//        bookStoreApplicationExpand.click();



//        WebElement testLoginPageLink = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
//        testLoginPageLink.click();
//        Thread.sleep(3000);
//
//        WebElement usernameFieldBox = driver.findElement(By.id("username"));
//        usernameFieldBox.sendKeys(username);
//
//        WebElement passwordFieldBox = driver.findElement(By.id("password"));
//        passwordFieldBox.sendKeys(password);
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();
//        Thread.sleep(1000);
//
//        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");
//
//        WebElement loginFailedMessage = driver.findElement(By.id("error"));
//        Assert.assertTrue(loginFailedMessage.isDisplayed());
    }
}
