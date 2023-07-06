package demoQA.pages.bookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage extends BaseTest {

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "submit")
    public WebElement logOutButton;

    @FindBy(id = "login")
    public WebElement logInButton;

    @FindBy(id = "userName-value")
    public WebElement nameOfLoggedInUser;

    @FindBy(className = "main-header")
    public WebElement profilePageTitle;

    @FindBy(id = "delete-record-undefined")
    public WebElement trashButton;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement confirmationOKButton;

    @FindBy(xpath = "//div[@class='rt-tr-group']/descendant::a")
    public List<WebElement> allBookNamesInProfile;

    @FindBy(xpath = "//div[@class='rt-tr-group']/descendant::*[@class='action-buttons'][2]")
    public List<WebElement> allTrashIconsInProfile;

}
