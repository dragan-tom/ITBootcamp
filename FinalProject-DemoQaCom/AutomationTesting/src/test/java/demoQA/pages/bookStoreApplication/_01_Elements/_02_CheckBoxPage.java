package demoQA.pages.bookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_CheckBoxPage extends BaseTest {

    public _02_CheckBoxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tree-node-home")
    public WebElement checkBox;
}
