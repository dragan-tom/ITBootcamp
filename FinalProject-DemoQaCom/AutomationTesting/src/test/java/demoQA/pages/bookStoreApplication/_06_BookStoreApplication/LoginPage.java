package demoQA.pages.bookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[contains(@class, 'main-header')][contains(.,'Login')]/..")
    public WebElement titleOnScreen;

    @FindBy(xpath = "//*[contains(@id,'userForm')]//descendant::h2[contains(.,'Welcome,')]/..")
    public WebElement welcomeGreeting;

    @FindBy(xpath = "//*[contains(@id,'userForm')]//descendant::h5[contains(.,'Login in Book Store')]/..")
    public WebElement loginToBookstoreMessage;

    @FindBy(xpath = "//*[contains(@id,'userName-label')][contains(.,'UserName : ')]")
    public WebElement usernameLabelWhileLoggedOut;

    @FindBy(id = "userName")
    public WebElement usernamePlaceholder;

    @FindBy(id = "password-label")
    public WebElement passwordLabel;

    @FindBy(id = "password")
    public WebElement passwordPlaceholder;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "newUser")
    public WebElement newUser;

    @FindBy(xpath = "//*[contains(@id,'userName-label')][contains(.,'User Name : ')]")
    public WebElement usernameLabelWhileLoggedIn;

    @FindBy(xpath = "//*[contains(@id,'userName-value')]")
    public WebElement nameOfLoggedInUser;

    @FindBy(xpath = "//*[contains(@id,'submit')][contains(.,'Log out')]")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[contains(@class,'form-label')][contains(.,'You are already logged in. View your ')]")
    public WebElement youAreLoggedInText;

    @FindBy(xpath = "//*[@href='/profile'][contains(.,'profile')]")
    public WebElement profileLink;

    public String getValidUsername() {
        return excelReader.getStringData("Login", 1, 0);
    }

    public String getValidPassword() {
        return excelReader.getStringData("Login", 1, 1);
    }

}