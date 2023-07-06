package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    public TextBoxTest() {
        PageFactory.initElements(driver, this);
    }


    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        goToHomePage();
        clickASAP(homePage.getElementsButton());
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
