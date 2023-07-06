package project01.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project01.base.BaseTest;

public class AllTests extends BaseTest {

    @BeforeMethod
    public void beforeEveryTest() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    public void addCookies() {
        driver.manage().deleteAllCookies();
        Cookie loginCookie1 = new Cookie("userName", "Petar1");
        Cookie loginCookie2 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlBldGFyMSIsInBhc3N3b3JkIjoicUEmOVIhOXNES1UlUXlQbSIsImlhdCI6MTY4Njc1MzI5OX0.ad3S4qBJuhmJaDW6uZfip30HrMVFCs2HJFHZOjDGfc0");
        Cookie loginCookie3 = new Cookie("expires", "2023-06-21T14%3A34%3A59.807Z");
        Cookie loginCookie4 = new Cookie("userID", "1f11e04d-bffc-4c53-9e47-675b2b9496e3");
        Cookie loginCookie5 = new Cookie("_gid", "GA1.2.1709944281.1686149125");
        driver.manage().addCookie(loginCookie1);
        driver.manage().addCookie(loginCookie2);
        driver.manage().addCookie(loginCookie3);
        driver.manage().addCookie(loginCookie4);
        driver.manage().addCookie(loginCookie5);
//        driver.navigate().refresh();
    }

    public void login() throws InterruptedException {
        goToHomePage();
        addCookies();
        goFromHomepageToBSA();
        colapseAllSidebarMenus();
    }

    public void goToHomePage() throws InterruptedException {
        driver.get("https://demoqa.com/");
        waitForLoad(driver);
    }

    public void goFromHomepageToBSA() throws InterruptedException {
        clickASAP(homePage.getBsaButton());
        waitForLoad(driver);
        ifBottomBannerDisplayedShutIt();
        colapseAllSidebarMenus();
    }

    public void goFromBSAToProfilePage() throws InterruptedException {
        colapseAllSidebarMenus();
        clickASAP(sidebarPage.getSbBookStoreApplication());
        clickASAP(sidebarPage.getProfilePageButton());
        waitForLoad(driver);
        colapseAllSidebarMenus();
    }

    public void goFromBSAToBookStore() throws InterruptedException {
        clickASAP(sidebarPage.getSbBookStoreApplication());
        clickASAP(sidebarPage.getBookStoreButton());
        colapseAllSidebarMenus();
    }

    public void ifBottomBannerDisplayedShutIt() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].parentNode.removeChild(arguments[0])", driver.findElement(By.id("fixedban")));
        } catch (Exception ignored) {
        }
    }


    public void colapseAllSidebarMenus() {
        waitForLoad(driver);
        try {
            if ((sidebarPage.getBrokenLinks().isDisplayed()))
                sidebarPage.getSbElements().click();
            else {
                clickASAP(sidebarPage.getSbElements());
                clickASAP(sidebarPage.getSbElements());
            }
        } catch (Exception ignored) {
        }
    }

    public void emptyCollection() throws InterruptedException {
        goFromBSAToProfilePage();
        while (profilePage.getTrashButton() != null){
            clickASAP(profilePage.getTrashButton());
            clickASAP(profilePage.getConfirmationOKButton());
            driver.navigate().refresh();
        }
        colapseAllSidebarMenus();
    }

    public void addBook(WebElement element) throws InterruptedException {
        clickASAP(element);
        clickASAP(profilePage.getAddToYourCollectionButton());
        Thread.sleep(300);
        driver.switchTo().alert().accept();
        clickASAP(profilePage.getBackToBookstoreButton());
    }

    public void addTwoBooks() throws InterruptedException {
        goFromBSAToBookStore();
        addBook(bookStorePage.getBookSpeakingJavascript());
        addBook(bookStorePage.getBookProgrammingJavaScriptApplications());
        colapseAllSidebarMenus();
    }

    public void logOut() throws InterruptedException {
        goFromBSAToProfilePage();
        clickASAP(profilePage.getLogOutButton());
        colapseAllSidebarMenus();
    }

    public void loginAndEmptyCollection() throws InterruptedException {
        login();
        emptyCollection();
    }

    @Test
    public void testLogin() throws InterruptedException {
        login();
        goFromBSAToProfilePage();
        Assert.assertTrue(getTextFrom(profilePage.getProfileHeaderText()).equalsIgnoreCase("Profile"));
        Assert.assertTrue(isElementDisplayed(profilePage.getLogOutButton()));
    }

    @Test
    public void testLogOut() throws InterruptedException {
        login();
        logOut();
        driver.navigate().refresh();
        goFromBSAToProfilePage();
        Assert.assertTrue(getTextFrom(profilePage.getProfileHeaderText()).equalsIgnoreCase("Profile"));
        Assert.assertFalse(isElementDisplayed(profilePage.getLogOutButton()));
    }

    @Test
    public void testIfBooksAreRemoved() throws InterruptedException {
        loginAndEmptyCollection();
        addTwoBooks();
        emptyCollection();
        Assert.assertTrue(getTextFrom(profilePage.getProfileHeaderText()).equalsIgnoreCase("Profile"));
        Assert.assertFalse(isElementDisplayed(profilePage.getTrashButton()));
    }

    @Test
    public void testIfAddedBooksExist() throws InterruptedException {
        loginAndEmptyCollection();
        addTwoBooks();
        logOut();
        login();
        goFromBSAToProfilePage();
        Assert.assertEquals(getTextFrom(bookStorePage.getBookSpeakingJavascript()), "Speaking JavaScript");
        Assert.assertEquals(getTextFrom(bookStorePage.getBookProgrammingJavaScriptApplications()), "Programming JavaScript Applications");
    }


}
