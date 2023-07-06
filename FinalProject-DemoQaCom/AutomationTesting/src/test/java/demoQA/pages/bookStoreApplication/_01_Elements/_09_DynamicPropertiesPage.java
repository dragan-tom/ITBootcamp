package demoQA.pages.bookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09_DynamicPropertiesPage extends BaseTest {


    public _09_DynamicPropertiesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "enableAfter")
    public WebElement waitingToBecomingEnabled;


}
