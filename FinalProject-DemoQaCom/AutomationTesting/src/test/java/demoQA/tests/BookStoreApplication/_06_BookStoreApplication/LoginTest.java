package demoQA.tests.BookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        driver.manage().deleteAllCookies();
    }

    @Test
    public void verifyPathToWebPage() throws InterruptedException {
            driver.get(homeURL);
            clickASAP(homePage.bsaButton);
            clickASAP(sidebarPage.loginBsaSubMenuButton);
            String expectedWebpage = "https://demoqa.com/login";
            Assert.assertEquals(driver.getCurrentUrl(), expectedWebpage);
    }

    @Test(priority = 20)
    public void checkTitle() {
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }

    @Test(priority = 30)
    public void allElementsAreDisplayedWhileLoggedOut() {
        Assert.assertTrue(isElementDisplayed(homePage.banner));
        Assert.assertTrue(isElementDisplayed(loginPage.titleOnScreen));
        Assert.assertTrue(isElementDisplayed(loginPage.welcomeGreeting));
        Assert.assertTrue(isElementDisplayed(loginPage.loginToBookstoreMessage));
        Assert.assertTrue(isElementDisplayed(loginPage.usernameLabelWhileLoggedOut));
        Assert.assertTrue(isElementDisplayed(loginPage.usernamePlaceholder));
        Assert.assertTrue(isElementDisplayed(loginPage.passwordLabel));
        Assert.assertTrue(isElementDisplayed(loginPage.passwordPlaceholder));
        Assert.assertTrue(isElementDisplayed(loginPage.loginButton));
        Assert.assertTrue(isElementDisplayed(loginPage.newUser));
    }

    @Test(priority = 5)
    public void checkBannerRedirection() throws InterruptedException {
        bannerRedirectionTest();
    }

    @Test
    public void testLoginWithCookies() throws InterruptedException {
        loginWithCookies();
        driver.get("https://demoqa.com/login");
        Assert.assertTrue(isElementDisplayed(loginPage.logOutButton));
        Assert.assertFalse(isElementDisplayed(loginPage.loginButton));
        Assert.assertEquals(getTextFrom(loginPage.nameOfLoggedInUser), "Petar05");
    }

    @Test
    public void testLoginValidCredentials() throws InterruptedException {
        login(excelReader.getStringData("Login", 1, 0), excelReader.getStringData("Login", 1, 1));
        String expectedWebpage = "https://demoqa.com/profile";
        waitForURL(expectedWebpage);
        Assert.assertEquals(driver.getCurrentUrl(), expectedWebpage);
        Assert.assertTrue(isElementDisplayed(profilePage.logOutButton));
        Assert.assertEquals(getTextFrom(profilePage.nameOfLoggedInUser), excelReader.getStringData("Login", 1, 0));
    }

    @Test
    public void testLoginInvalidCredentials() throws InterruptedException {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++) {
            login(excelReaderData("Login", i, 2), excelReaderData("Login", i, 3));
            String expectedWebpage = "https://demoqa.com/login";
            Assert.assertEquals(driver.getCurrentUrl(), expectedWebpage);
            Assert.assertTrue(isElementDisplayed(loginPage.loginButton));
            Assert.assertFalse(isElementDisplayed(loginPage.nameOfLoggedInUser));
        }
    }

    @Test(priority = 30)
    public void allElementsAreDisplayedWhileLoggedIn() throws InterruptedException {
        loginWithCookies();
        driver.get("https://demoqa.com/login");
        Assert.assertTrue(isElementDisplayed(homePage.banner));
        Assert.assertTrue(isElementDisplayed(loginPage.titleOnScreen));
        Assert.assertTrue(isElementDisplayed(loginPage.usernameLabelWhileLoggedIn));
        Assert.assertTrue(isElementDisplayed(loginPage.nameOfLoggedInUser));
        Assert.assertTrue(isElementDisplayed(loginPage.logOutButton));
        Assert.assertTrue(isElementDisplayed(loginPage.youAreLoggedInText));
        Assert.assertTrue(isElementDisplayed(loginPage.profileLink));
    }

    @Test
    public void testLogOut() throws InterruptedException {
        loginWithCookies();
        logOut();
        driver.navigate().refresh();
        goFromBSAToProfilePage();
        Assert.assertFalse(logOutButtonIsDisplayed());
    }

}
