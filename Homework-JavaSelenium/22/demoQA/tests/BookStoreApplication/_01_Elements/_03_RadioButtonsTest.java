package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _03_RadioButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        goToHomePage();
        clickASAP(homePage.getElementsButton());
        clickASAP(sidebarPage.radioButtonElementsSubMenuButton);
    }

    @Test(priority = 5)
    public void checkBanner() throws InterruptedException {
        bannerRedirectionTest();
    }

    @Test(priority = 10)
    public void checkURL() {
        String expectedWebpage = "https://demoqa.com/radio-button";
        Assert.assertEquals(currentWebPage(), expectedWebpage);
    }

    @Test(priority = 20)
    public void checkTitle() {
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }

    @Test(priority = 30)
    public void allElementsAreDisplayed(){
        Assert.assertTrue(isElementDisplayed(radioButtonPage.yesRadioButton));
        Assert.assertTrue(isElementDisplayed(radioButtonPage.impressiveRadioButton));
        Assert.assertTrue(isElementDisplayed(radioButtonPage.noRadioButton));
        Assert.assertEquals(getTextFrom(radioButtonPage.yesRadioText), "Yes");
        Assert.assertEquals(getTextFrom(radioButtonPage.impressiveRadioText), "Impressive");
        Assert.assertEquals(getTextFrom(radioButtonPage.noRadioText), "No");
        System.out.println(radioButtonPage.yesRadioButton);
    }

    @Test(priority = 40)
    public void defaultStateOfButtons() {
        Assert.assertFalse((radioButtonPage.yesRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
    }

    @Test
    public void clickOnYesRadioButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.yesRadioButton);
        Assert.assertTrue(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Yes";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test
    public void clickOnYesRadioText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.yesRadioText);
        Assert.assertTrue(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Yes";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test
    public void clickOnImpressiveRadioButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.impressiveRadioButton);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertTrue((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Impressive";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test
    public void clickOnImpressiveRadioText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.impressiveRadioText);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertTrue((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        String expectedMessage = "Impressive";
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), expectedMessage);
    }

    @Test
    public void clickOnNoRadio() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButtonPage.noRadioButton);
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse((radioButtonPage.impressiveRadioButton).isSelected());
        Assert.assertFalse((radioButtonPage.noRadioButton).isSelected());
        Assert.assertEquals(getTextFrom(radioButtonPage.actionMessage), "");
    }


    @Test
    public void test06() throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'header-text') and text() = 'Elements']/..")).getLocation());
        System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'header-text') and text() = 'Elements']/..")).getLocation().getX());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class, 'header-text')][contains(., 'Elements')]/..")).click();
    }


    @Test
    public void testHashCode(){
        String a = "a";
        String b = "b";
        int hash01 = 0;
        hash01 = a.hashCode();
        hash01 = hash01* b.hashCode();
        System.out.println(hash01);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println();

        String c = "asdsadeqdeadeadeadeadeadaedasecaseceas";
        System.out.println("c:" + c.hashCode());
        System.out.println(("1").hashCode());
        System.out.println(("12").hashCode());
        System.out.println(("123").hashCode());
        System.out.println(("1234").hashCode());
        System.out.println(("12345").hashCode());
        System.out.println(("123456").hashCode());
        System.out.println(("1234567").hashCode());
        System.out.println(("12345678").hashCode());
        System.out.println(("123456789").hashCode());
        System.out.println(("1234567890").hashCode());
        System.out.println(("1234567890").hashCode());
        System.out.println(("12345678901234567890").hashCode());
        System.out.println(("123456789012345678901234567890").hashCode());
        System.out.println("sta ce ovde biti? " + ("").hashCode());


    }
}
