package project01.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    private WebDriver driver;
    private WebElement logOutButton;
    private WebElement trashButton;
    private WebElement confirmationOKButton;
    private WebElement profileHeaderText;
    private WebElement addToYourCollectionButton;
    private WebElement backToBookstoreButton;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogOutButton() {
        try {
            WebElement element = driver.findElement(By.id("submit"));
            if (element.getText().equalsIgnoreCase("Log out"))
                return driver.findElement(By.id("submit"));
        } catch (Exception ignored) {
        }
        return null;
    }

    public WebElement getTrashButton() throws InterruptedException {
        try {
            return driver.findElement(By.id("delete-record-undefined"));
        } catch (Exception e) {
            return null;
        }
    }

    public WebElement getConfirmationOKButton() {
        return driver.findElement(By.id("closeSmallModal-ok"));
    }

    public WebElement getProfileHeaderText() {
        try {
            return driver.findElement(By.className("main-header"));
        } catch (Exception e) {
            return null;
        }
    }

    public WebElement getAddToYourCollectionButton() {
        return driver.findElement(By.cssSelector(".text-right.fullButton"));
    }

    public WebElement getBackToBookstoreButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }


}
