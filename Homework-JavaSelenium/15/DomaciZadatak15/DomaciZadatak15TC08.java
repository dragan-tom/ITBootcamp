package selenium.DomaciZadatak15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DomaciZadatak15TC08 {

    public static void main(String[] args) throws InterruptedException {

        //TC02
        String username = "student";
        String password = "123456789012345678901";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");
        Thread.sleep(3000);
        WebElement practiceMenuOption = driver.findElement(By.id("menu-item-20"));
        practiceMenuOption.click();
        Thread.sleep(3000);
        WebElement testLoginPageLink = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
        testLoginPageLink.click();
        Thread.sleep(3000);

        WebElement usernameFieldBox = driver.findElement(By.id("username"));
        usernameFieldBox.sendKeys(username);

        WebElement passwordFieldBox = driver.findElement(By.id("password"));
        passwordFieldBox.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");

        WebElement loginFailedMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(loginFailedMessage.isDisplayed());
    }
}
