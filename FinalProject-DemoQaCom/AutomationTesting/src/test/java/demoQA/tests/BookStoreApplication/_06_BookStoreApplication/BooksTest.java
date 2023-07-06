package demoQA.tests.BookStoreApplication._06_BookStoreApplication;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BooksTest extends LoginTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.get(homeURL);
        loginWithCookies();
        emptyCollection();
    }

    @Test
    public void addOneBook() throws InterruptedException {
        addBook(bookStorePage.bookSpeakingJavascript);
        goFromBSAToProfilePage();
        boolean match = false;
        waitForElementsVisibility(profilePage.allBookNamesInProfile);
        for (int i = 0; i < profilePage.allBookNamesInProfile.size(); i++) {
            if (profilePage.allBookNamesInProfile.get(i).getText().equalsIgnoreCase(bookStorePage.bookSpeakingJavascript.getText())) {
                match = true;
                break;
            }
        }
        Assert.assertTrue(match);
    }

    @Test
    public void removeOneBook() throws InterruptedException {
        addBook(bookStorePage.bookSpeakingJavascript);
        goFromBSAToProfilePage();
        for (int i = 0; i < profilePage.allBookNamesInProfile.size(); i++) {
            if (profilePage.allBookNamesInProfile.get(i).getText().equalsIgnoreCase(bookStorePage.bookSpeakingJavascript.getText())) {
                profilePage.allTrashIconsInProfile.get(i).click();
            }
        }
        boolean match = true;
        for (int i = 0; i < profilePage.allBookNamesInProfile.size(); i++) {
            if (profilePage.allBookNamesInProfile.get(i).getText().equalsIgnoreCase(bookStorePage.bookSpeakingJavascript.getText())) {
                match = false;
                break;
            }
        }
        Assert.assertTrue(match);
    }


    @Test
    public void testEmptyCollection() throws InterruptedException {
        goFromBSAToBookStore();
        addTwoBooks();
        goFromBSAToProfilePage();
        emptyCollection();
        String expectedWebpage = "https://demoqa.com/profile";
        Assert.assertEquals(driver.getCurrentUrl(), expectedWebpage);
        Assert.assertTrue(getTextFrom(profilePage.profilePageTitle).equalsIgnoreCase("Profile"));
        Assert.assertFalse(isElementDisplayed(getWebElement(profilePage.trashButton)));
    }

    @Test
    public void testIfBookIsSavedAfterRelogging() throws InterruptedException {
        addBook(bookStorePage.bookSpeakingJavascript);
        logOut();
        loginWithCookies();
        goFromBSAToProfilePage();
        boolean match = true;
        for (int i = 0; i < profilePage.allBookNamesInProfile.size(); i++) {
            if (profilePage.allBookNamesInProfile.get(i).getText().equalsIgnoreCase(bookStorePage.bookSpeakingJavascript.getText())) {
                match = false;
                break;
            }
        }
        Assert.assertTrue(match);
    }
}
