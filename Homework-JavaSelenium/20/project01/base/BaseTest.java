package project01.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project01.pages.*;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;




//    private WebElement brokenLinks;
//    private WebElement sbElements;
//    private WebElement sbBookStoreApplication;
//    private WebElement profilePageButton;
//    private WebElement bookStoreButton;

//    private WebElement bookSpeakingJavascript;
//    private WebElement bookProgrammingJavaScriptApplications;

//    private WebElement logOutButton;
//    private WebElement trashButton;
//    private WebElement confirmationOKButton;
//    private WebElement profileHeaderText;
//    private WebElement addToYourCollectionButton;
//    private WebElement backToBookstoreButton;

    public HomePage homePage;
    public SidebarPage sidebarPage;
    public BookStorePage bookStorePage;
    public ProfilePage profilePage;
    public LoginPage loginPage;
    public ExcelReader excelReader;
    public String homeURL;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePage = new HomePage(driver);
        sidebarPage = new SidebarPage(driver);
        bookStorePage = new BookStorePage(driver);
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        excelReader = new ExcelReader("src/test/java/project01/TestData.xlsx");
        homeURL = excelReader.getStringData("URL", 2, 0);
    }

//    @BeforeMethod
//    public void beforeEveryTest() throws InterruptedException {
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//    }

    public void waitForLoad(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForURL(String URL) {
        wait.until(ExpectedConditions.urlToBe(URL));
    }

    public void waitForVisibility(WebElement element) throws InterruptedException {

        try{
        for (int i = 0; i < 5; i++) {
            if (element != null)
                break;
            else Thread.sleep(200);
        }
//
//
//
//        try {
//            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception ignored){}
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickASAP(WebElement element) throws InterruptedException {
        waitForVisibility(element);
        scrollIntoView(element);
        waitForClickability(element);
        element.click();
    }

    public String getTextFrom(WebElement element) {
        return (element == null) ? "" : element.getText();
    }

    public boolean isElementDisplayed(WebElement element){
        return element != null;
    }



//    public WebElement getSbElements() {
//        return driver.findElements(By.className("group-header")).get(0);
//    }
//
//    public WebElement getBrokenLinks() {
//        try {
//            return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]/span"));
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public WebElement getBookStoreButton() {
//        return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span"));
//    }
//
//    public WebElement getProfilePageButton() {
//        return driver.findElements(By.id("item-3")).get(4);
//    }
//
//
//    public WebElement getSbBookStoreApplication() {
//        return driver.findElements(By.className("group-header")).get(5);
//    }






//    public WebElement getBookSpeakingJavascript() {
//        try {
//            return driver.findElement(By.linkText("Speaking JavaScript"));
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public WebElement getBookProgrammingJavaScriptApplications() {
//        try {
//            return driver.findElement(By.linkText("Programming JavaScript Applications"));
//        } catch (Exception e) {
//            return null;
//        }
//    }

//    public WebElement getLogOutButton() {
//        try {
//            WebElement element = driver.findElement(By.id("submit"));
//            if (element.getText().equalsIgnoreCase("Log out"))
//                return driver.findElement(By.id("submit"));
//        } catch (Exception ignored) {
//        }
//        return null;
//    }
//
//    public WebElement getTrashButton() throws InterruptedException {
//        try {
//            return driver.findElement(By.id("delete-record-undefined"));
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public WebElement getConfirmationOKButton() {
//        return driver.findElement(By.id("closeSmallModal-ok"));
//    }
//
//    public WebElement getProfileHeaderText() {
//        try {
//            return driver.findElement(By.className("main-header"));
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public WebElement getAddToYourCollectionButton() {
//        return driver.findElement(By.cssSelector(".text-right.fullButton"));
//    }
//
//    public WebElement getBackToBookstoreButton() {
//        return driver.findElement(By.id("addNewRecordButton"));
//    }

//    public void addCookies() {
//        driver.manage().deleteAllCookies();
//        Cookie loginCookie1 = new Cookie("userName", "Petar1");
//        Cookie loginCookie2 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlBldGFyMSIsInBhc3N3b3JkIjoicUEmOVIhOXNES1UlUXlQbSIsImlhdCI6MTY4Njc1MzI5OX0.ad3S4qBJuhmJaDW6uZfip30HrMVFCs2HJFHZOjDGfc0");
//        Cookie loginCookie3 = new Cookie("expires", "2023-06-21T14%3A34%3A59.807Z");
//        Cookie loginCookie4 = new Cookie("userID", "1f11e04d-bffc-4c53-9e47-675b2b9496e3");
//        Cookie loginCookie5 = new Cookie("_gid", "GA1.2.1709944281.1686149125");
//        driver.manage().addCookie(loginCookie1);
//        driver.manage().addCookie(loginCookie2);
//        driver.manage().addCookie(loginCookie3);
//        driver.manage().addCookie(loginCookie4);
//        driver.manage().addCookie(loginCookie5);
////        driver.navigate().refresh();
//    }
//
//    public void login() throws InterruptedException {
//        goToHomePage();
//        addCookies();
//        goFromHomepageToBSA();
//        colapseAllSidebarMenus();
//    }
//
//    public void goToHomePage() throws InterruptedException {
//        driver.get("https://demoqa.com/");
//        waitForLoad(driver);
//    }
//
//    public void goFromHomepageToBSA() throws InterruptedException {
//        clickASAP(getBsaButton());
//        waitForLoad(driver);
//        ifBottomBannerDisplayedShutIt();
//        colapseAllSidebarMenus();
//    }
//
//    public void goFromBSAToProfilePage() throws InterruptedException {
//        colapseAllSidebarMenus();
//        clickASAP(getSbBookStoreApplication());
//        clickASAP(getProfilePageButton());
//        waitForLoad(driver);
//        colapseAllSidebarMenus();
//    }
//
//    public void goFromBSAToBookStore() throws InterruptedException {
//        clickASAP(getSbBookStoreApplication());
//        clickASAP(getBookStoreButton());
//        colapseAllSidebarMenus();
//    }
//
//    public void ifBottomBannerDisplayedShutIt() {
//        try {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].parentNode.removeChild(arguments[0])", driver.findElement(By.id("fixedban")));
//        } catch (Exception ignored) {
//        }
//    }
//
//
//    public void colapseAllSidebarMenus() {
//        waitForLoad(driver);
//        try {
//            if ((getBrokenLinks().isDisplayed()))
//                getSbElements().click();
//            else {
//                clickASAP(getSbElements());
//                clickASAP(getSbElements());
//            }
//        } catch (Exception ignored) {
//        }
//    }
//
//    public void emptyCollection() throws InterruptedException {
//        goFromBSAToProfilePage();
//        while (getTrashButton() != null){
//            clickASAP(getTrashButton());
//            clickASAP(getConfirmationOKButton());
//            driver.navigate().refresh();
//        }
//        colapseAllSidebarMenus();
//    }
//
//    public void addBook(WebElement element) throws InterruptedException {
//        clickASAP(element);
//        clickASAP(getAddToYourCollectionButton());
//        Thread.sleep(300);
//        driver.switchTo().alert().accept();
//        clickASAP(getBackToBookstoreButton());
//    }
//
//    public void addTwoBooks() throws InterruptedException {
//        goFromBSAToBookStore();
//        addBook(getBookSpeakingJavascript());
//        addBook(getBookProgrammingJavaScriptApplications());
//        colapseAllSidebarMenus();
//    }
//
//    public void logOut() throws InterruptedException {
//        goFromBSAToProfilePage();
//        clickASAP(getLogOutButton());
//        colapseAllSidebarMenus();
//    }
//
//    public void loginAndEmptyCollection() throws InterruptedException {
//        login();
//        emptyCollection();
//    }
//
//    @Test
//    public void testLogin() throws InterruptedException {
//        login();
//        goFromBSAToProfilePage();
//        Assert.assertTrue(getTextFrom(getProfileHeaderText()).equalsIgnoreCase("Profile"));
//        Assert.assertTrue(isElementDisplayed(getLogOutButton()));
//    }
//
//    @Test
//    public void testLogOut() throws InterruptedException {
//        login();
//        logOut();
//        driver.navigate().refresh();
//        goFromBSAToProfilePage();
//        Assert.assertTrue(getTextFrom(getProfileHeaderText()).equalsIgnoreCase("Profile"));
//        Assert.assertFalse(isElementDisplayed(getLogOutButton()));
//    }
//
//    @Test
//    public void testIfBooksAreRemoved() throws InterruptedException {
//        loginAndEmptyCollection();
//        addTwoBooks();
//        emptyCollection();
//        Assert.assertTrue(getTextFrom(getProfileHeaderText()).equalsIgnoreCase("Profile"));
//        Assert.assertFalse(isElementDisplayed(getTrashButton()));
//    }
//
//    @Test
//    public void testIfAddedBooksExist() throws InterruptedException {
//        loginAndEmptyCollection();
//        addTwoBooks();
//        logOut();
//        login();
//        goFromBSAToProfilePage();
//        Assert.assertEquals(getTextFrom(getBookSpeakingJavascript()), "Speaking JavaScript");
//        Assert.assertEquals(getTextFrom(getBookProgrammingJavaScriptApplications()), "Programming JavaScript Applications");
//    }

    @AfterMethod
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.quit();
    }







}
