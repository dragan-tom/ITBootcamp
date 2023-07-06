package domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci17A01HappyPath {

    public static void main(String[] args) {

        String username = "admin";
        String password = "admin";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement basicAuth = driver.findElement(By.linkText("Basic Auth"));
        basicAuth.click();

        String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertEquals(actualURL, expectedURL);

        String actualTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        String expectedTitle = "Basic Auth";
        Assert.assertEquals(actualTitle, expectedTitle);

        String actualMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        String expectedMessage = "Congratulations! You must have the proper credentials.";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
