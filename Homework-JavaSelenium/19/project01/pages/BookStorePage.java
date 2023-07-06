package project01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage {

    public WebDriver driver;
    private WebElement bookSpeakingJavascript;
    private WebElement bookProgrammingJavaScriptApplications;

    public BookStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookSpeakingJavascript() {
        try {
            return driver.findElement(By.linkText("Speaking JavaScript"));
        } catch (Exception e) {
            return null;
        }
    }

    public WebElement getBookProgrammingJavaScriptApplications() {
        try {
            return driver.findElement(By.linkText("Programming JavaScript Applications"));
        } catch (Exception e) {
            return null;
        }
    }

}
