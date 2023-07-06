package demoQA.tests.BookStoreApplication._06_BookStoreApplication;

import demoQA.base.BaseTest;
import demoQA.pages.HomePage;
import demoQA.pages.bookStoreApplication._06_BookStoreApplication.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    public String validUsername() {
        return excelReader.getStringData("Login", 1, 0);
    }

    public String validPassword() {
        return excelReader.getStringData("Login", 1, 1);
    }

    @BeforeMethod
    public void pageSetUp() {
        driver.get(homeURL);
        homePage = new HomePage();
        loginPage = new LoginPage();
    }


    @Test
    public void testLoginWithCookies() throws InterruptedException {
        loginWithCookies();
        goFromBSAToProfilePage();
        Assert.assertTrue(getTextFrom(getWebElement(profilePage.profilePageTitle)).equalsIgnoreCase("Profile"));
        Assert.assertTrue(isElementDisplayed(profilePage.logOutButton));
        Assert.assertTrue(logOutButtonIsDisplayed());
        Assert.assertFalse(logInButtonIsDisplayed());
        Assert.assertEquals(usernameOnScreen(), "Petar05");
    }

    @Test
    public void testValidCredentialsLogin() throws InterruptedException {
        goToLoginPage();
        login(validUsername(), validPassword());
        Assert.assertTrue(logOutButtonIsDisplayed());
        Assert.assertFalse(logInButtonIsDisplayed());
        Assert.assertEquals(usernameOnScreen(), validUsername());
        String expectedWebpage = "https://demoqa.com/profile";
        Assert.assertEquals(currentWebPage(), expectedWebpage);
        String expectedPageTitle = "Profile";
        Assert.assertEquals(pageTitle(), expectedPageTitle);
    }

    @Test
    public void testInvalidCredentialsLogin() throws InterruptedException {
        goToLoginPage();
        for (int i = 1; i < excelReader.getLastRow("Login"); i++) {
            login(excelReader.getStringData("Login", i, 2), excelReader.getStringData("Login", i, 3));
            Assert.assertTrue(logInButtonIsDisplayed());
            Assert.assertFalse(logOutButtonIsDisplayed());
            String expectedWebpage = "https://demoqa.com/login";
            Assert.assertEquals(currentWebPage(), expectedWebpage);
        }
    }

    @Test
    public void testLogOut() throws InterruptedException {
        testValidCredentialsLogin();
        logOut();
        driver.navigate().refresh();
        goFromBSAToProfilePage();
        Assert.assertFalse(logOutButtonIsDisplayed());
    }

}
