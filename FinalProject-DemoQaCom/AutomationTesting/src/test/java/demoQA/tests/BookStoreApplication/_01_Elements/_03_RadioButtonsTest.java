package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _03_RadioButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://demoqa.com/radio-button");
    }

    @Test
    public void verifyPathToWebPage() throws InterruptedException {
        driver.get(homeURL);
        clickASAP(homePage.elementsButton);
        clickASAP(sidebarPage.radioButtonElementsSubMenuButton);
        String expectedWebpage = "https://demoqa.com/radio-button";
        Assert.assertEquals(driver.getCurrentUrl(), expectedWebpage);
    }

    @Test(priority = 10)
    public void checkTitle() {
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }

    @Test(priority = 20)
    public void allElementsAreDisplayed() {
        Assert.assertTrue(isElementDisplayed(homePage.banner));
//        Assert.assertTrue(isElementDisplayed(radioButtonPage.yesRadioButton));
//        Assert.assertTrue(isElementDisplayed(radioButtonPage.impressiveRadioButton));
//        Assert.assertTrue(isElementDisplayed(radioButtonPage.noRadioButton));
        Assert.assertEquals(getTextFrom(radioButtonPage.yesRadioText), "Yes");
        Assert.assertEquals(getTextFrom(radioButtonPage.impressiveRadioText), "Impressive");
        Assert.assertEquals(getTextFrom(radioButtonPage.noRadioText), "No");
        Assert.assertFalse((radioButtonPage.yesRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
    }

    @Test(priority = 40)
    public void checkBannerRedirection() throws InterruptedException {
        bannerRedirectionTest();
    }

    @Test(priority = 50)
    public void clickOnYesRadioButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.yesRadioButton);
        Assert.assertTrue(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Yes";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test(priority = 70)
    public void clickOnImpressiveRadioButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.impressiveRadioButton);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertTrue((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Impressive";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test(priority = 90)
    public void clickOnNoRadioButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.noRadioButton);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertTrue((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "No";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test(priority = 95)
    public void multipleSelectionNotAllowed() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.yesRadioButton);
        Assert.assertTrue(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Yes";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
        js.executeScript("arguments[0].click();", radioButtonPage.impressiveRadioButton);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertTrue((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        expectedMessage = "Impressive";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

}
