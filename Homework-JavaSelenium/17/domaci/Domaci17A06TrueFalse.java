package domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci17A06TrueFalse {

    public static void main(String[] args) throws InterruptedException {

        String username = "admin";
        String password = "false";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement basicAuth = driver.findElement(By.linkText("Basic Auth"));
        basicAuth.click();

        String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://admin:false@the-internet.herokuapp.com/basic_auth";
        Assert.assertEquals(actualURL, expectedURL);

        String actualTitle = "";
        String expectedTitle = "Basic Auth";
        boolean basicAuthElementIsDisplayed = false;
        try {
            basicAuthElementIsDisplayed = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed();
            actualTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        } catch (Exception e) {
        }
        if (basicAuthElementIsDisplayed)
            Assert.assertNotEquals(actualTitle, expectedTitle);

        String actualMessage = "";
        String expectedMessage = "Congratulations! You must have the proper credentials.";
        boolean congratulationsElementIsDisplayed = false;
        try {
            congratulationsElementIsDisplayed = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).isDisplayed();
            actualMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        } catch (Exception e) {
        }
        if (congratulationsElementIsDisplayed)
            Assert.assertNotEquals(actualMessage, expectedMessage);
    }
}
