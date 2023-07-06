package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import demoQA.pages.bookStoreApplication._01_Elements._02_CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    private _02_CheckBoxPage checkBoxPage;

    @Test
    public void isCheckboxNotSelectedByDefault() {
        checkBoxPage = new _02_CheckBoxPage();
        driver.get("https://demoqa.com/checkbox");
        Assert.assertFalse(checkBoxPage.checkBox.isSelected());

    }

}
