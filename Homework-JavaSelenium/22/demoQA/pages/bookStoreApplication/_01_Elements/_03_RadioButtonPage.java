package demoQA.pages.bookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_RadioButtonPage extends BaseTest {

    public _03_RadioButtonPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "yesRadio")
    public WebElement yesRadioButton;

    @FindBy(xpath = "//input[@id='yesRadio']/following::*")
    public WebElement yesRadioText;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadioButton;

    @FindBy(xpath = "//input[@id='impressiveRadio']/following::*")
    public WebElement impressiveRadioText;

    @FindBy(id = "noRadio")
    public WebElement noRadioButton;

    @FindBy(xpath = "//input[@id='noRadio']/following::*")
    public WebElement noRadioText;

    @FindBy(className = "text-success")
    public WebElement actionMessage;

}
