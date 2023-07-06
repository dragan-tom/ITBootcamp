package project01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarPage {

    WebDriver driver;
    private WebElement brokenLinks;
    private WebElement sbElements;
    private WebElement sbBookStoreApplication;
    private WebElement profilePageButton;
    private WebElement bookStoreButton;

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSbElements() {
        return driver.findElements(By.className("group-header")).get(0);
    }

    public WebElement getBrokenLinks() {
        try {
            return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]/span"));
        } catch (Exception e) {
            return null;
        }
    }

    public WebElement getBookStoreButton() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span"));
    }

    public WebElement getProfilePageButton() {
        return driver.findElements(By.id("item-3")).get(4);
    }

    public WebElement getSbBookStoreApplication() {
        return driver.findElements(By.className("group-header")).get(5);
    }


}
