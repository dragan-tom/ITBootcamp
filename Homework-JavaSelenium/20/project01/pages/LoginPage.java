package project01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private WebElement usernamePlaceholder;
    private WebElement passwordPlaceholder;
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernamePlaceholder() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getPasswordPlaceholder() {
        return driver.findElement(By.id("password"));
    }



    public WebElement getLoginButton() {
        try {
            Thread.sleep(600);
            return driver.findElement(By.id("login"));
        } catch (Exception ignored) {
        }
        return null;
    }
}