package demoQA.pages.bookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_TextBoxPage extends BaseTest {

    public _01_TextBoxPage() {
        PageFactory.initElements(driver, this);
    }

//    --------------------- input fields -------------------------------
    @FindBy(id = "userName")
    public WebElement fullNameField;

    @FindBy(id = "userEmail")
    public WebElement emailField;

    public WebElement getCurrentAddressField() {
        return currentAddressList.get(0);
    }

    public WebElement getPermanentAddressField() {
        return permanentAddressList.get(0);
    }

//    ------------------------submit button ------------------

    @FindBy(id = "submit")
    public WebElement submitButton;


//    -----------------------message fields-------------------

    @FindBy(id = "name")
    public WebElement nameMessage;

    @FindBy(id = "email")
    public WebElement emailMessage;

    public WebElement getCurrentAddressMessage() {
        return currentAddressList.get(1);
    }

    public WebElement getPermanentAddressMessage() {
        return permanentAddressList.get(1);
    }

//-----------------------------Helpers---------------------------

    @FindBy(id = "currentAddress")
    public List<WebElement> currentAddressList;

    @FindBy(id = "permanentAddress")
    public List<WebElement> permanentAddressList;







}
