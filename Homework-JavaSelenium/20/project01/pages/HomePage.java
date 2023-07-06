package project01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private WebElement bsaButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBsaButton() {
        return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
    }
}
