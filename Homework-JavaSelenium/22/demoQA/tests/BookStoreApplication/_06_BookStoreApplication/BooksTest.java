package demoQA.tests.BookStoreApplication._06_BookStoreApplication;

import demoQA.tests.BookStoreApplication._06_BookStoreApplication.LoginTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTest extends LoginTest {

    @Test
    public void loginAndEmptyCollection() throws InterruptedException {
        loginWithCookies();
        goFromBSAToProfilePage();
        emptyCollection();
        String expectedWebpage = "https://demoqa.com/profile";
        Assert.assertEquals(currentWebPage(), expectedWebpage);
        Assert.assertFalse(isTrashButtonDisplayed());
    }

    @Test
    public void testIfBooksAreRemoved() throws InterruptedException {
        loginAndEmptyCollection();
        goFromBSAToBookStore();
        addTwoBooks();
        goFromBSAToProfilePage();
        emptyCollection();
        Assert.assertTrue(getTextFrom(profilePage.profilePageTitle).equalsIgnoreCase("Profile"));
        Assert.assertFalse(isElementDisplayed(getWebElement(profilePage.trashButton)));
    }

    @Test
    public void testIfAddedBooksExist() throws InterruptedException {
        loginAndEmptyCollection();
        goFromBSAToBookStore();
        addTwoBooks();
        logOut();
        loginWithCookies();
        goFromBSAToProfilePage();
        String expectedBook1 = "Speaking JavaScript";
        String expectedBook2 = "Programming JavaScript Applications";
        Assert.assertEquals(getTextFrom(getWebElement(bookStorePage.bookSpeakingJavascript)), expectedBook1);
        Assert.assertEquals(getTextFrom(getWebElement(bookStorePage.bookProgrammingJavaScriptApplications)), expectedBook2);
    }
}
