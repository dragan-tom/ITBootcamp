package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.get(homeURL);
        clickASAP(homePage.elementsButton);
        clickASAP(sidebarPage.textBoxElementsSubMenuButton);
    }

    @Test
    public void testValidData() throws InterruptedException {
        fieldEntry(textBoxPage.fullNameField, excelReader.getStringData("TextBoxData", 1, 0));
        fieldEntry(textBoxPage.emailField, excelReader.getStringData("TextBoxData", 1, 1));
        fieldEntry(textBoxPage.getCurrentAddressField(), excelReader.getStringData("TextBoxData", 1, 2));
        fieldEntry(textBoxPage.getPermanentAddressField(), excelReader.getStringData("TextBoxData", 1, 3));
        clickASAP(textBoxPage.submitButton);
        Assert.assertEquals(("Name:" + excelReader.getStringData("TextBoxData", 1, 0)),textBoxPage.nameMessage.getText());

    }

}
