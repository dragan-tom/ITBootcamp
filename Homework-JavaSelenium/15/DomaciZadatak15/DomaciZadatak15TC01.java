package selenium.DomaciZadatak15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciZadatak15TC01 {

    public static void main(String[] args) throws InterruptedException {

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

//        WebElement usernameFieldBox = driver.findElement(By.id("username"));
//        usernameFieldBox.sendKeys("student");

        WebElement passwordFieldBox = driver.findElement(By.id("password"));
        passwordFieldBox.sendKeys("Password123");

//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();

        //ovaj test nisam zavrsio do kraja jer ne znam kako da assertujem da text pretvara u zvezdicu


    }
}
