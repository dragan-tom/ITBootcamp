package demoQA.pages.bookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    public WebElement usernamePlaceholder;

    @FindBy(id = "password")
    public WebElement passwordPlaceholder;

    @FindBy(id = "login")
    public WebElement loginButton;

}