package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _05_ButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        goToHomePage();
        clickASAP(homePage.getElementsButton());
        clickASAP(sidebarPage.buttonsElementsSubMenuButton);
    }

    @Test(priority = 5)
    public void checkBanner() throws InterruptedException {
        bannerRedirectionTest();
    }

    @Test(priority = 10)
    public void checkURL() {
        String expectedWebpage = "https://demoqa.com/buttons";
        Assert.assertEquals(currentWebPage(), expectedWebpage);
    }

    @Test(priority = 20)
    public void checkTitle() {
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }

    @Test(priority = 30)
    public void allElementsAreDisplayed(){
        Assert.assertTrue(isElementDisplayed(buttonsPage.doubleClickButton));
        Assert.assertTrue(isElementDisplayed(buttonsPage.rightClickButton));
        Assert.assertTrue(isElementDisplayed(buttonsPage.leftClickButton));
    }

    @Test
    public void testDoubleClickButton() {
        doubleClick(buttonsPage.doubleClickButton);
        String expectedMessage = "You have done a double click";
        Assert.assertEquals(getTextFrom(buttonsPage.doubleClickMessage), expectedMessage);
    }

    @Test
    public void rightClickOnButton() {
        rightClick(buttonsPage.rightClickButton);
        String expectedMessage = "You have done a right click";
        Assert.assertEquals(getTextFrom(buttonsPage.rightClickMessage), expectedMessage);
    }

    @Test
    public void leftClickOnClickButton() throws InterruptedException {
        clickASAP(buttonsPage.leftClickButton);
        String expectedMessage = "You have done a dynamic click";
        Assert.assertEquals(getTextFrom(buttonsPage.leftClickMessage), expectedMessage);
    }

}
