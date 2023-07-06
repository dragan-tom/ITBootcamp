package demoQA.pages.bookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage  extends BaseTest {


    public BookStorePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Speaking JavaScript")
    public WebElement bookSpeakingJavascript;

    @FindBy(linkText = "Programming JavaScript Applications")
    public WebElement bookProgrammingJavaScriptApplications;

    @FindBy(css = ".text-right.fullButton")
    public WebElement addToYourCollectionButton;

    @FindBy(id = "addNewRecordButton")
    public WebElement backToBookstoreButton;

}
