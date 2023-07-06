package demoQA.base;

import demoQA.pages.bookStoreApplication.SidebarPage;
import demoQA.pages.bookStoreApplication._01_Elements._05_ButtonsPage;
import demoQA.pages.bookStoreApplication._01_Elements._03_RadioButtonPage;
import demoQA.pages.bookStoreApplication._01_Elements._01_TextBoxPage;
import demoQA.pages.bookStoreApplication._06_BookStoreApplication.BookStorePage;
import demoQA.pages.bookStoreApplication._06_BookStoreApplication.LoginPage;
import demoQA.pages.bookStoreApplication._06_BookStoreApplication.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import demoQA.pages.*;
import org.testng.annotations.BeforeMethod;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public BookStorePage bookStorePage;
    public ProfilePage profilePage;
    public LoginPage loginPage;
    public _03_RadioButtonPage radioButtonPage;
    public _05_ButtonsPage buttonsPage;
    public static Actions actions;
    public _01_TextBoxPage textBoxPage;

    public String collapsedState = "element-list collapse";
    public String expandedState = "element-list collapse show";


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        excelReader = new ExcelReader("src/test/java/demoQA/TestData.xlsx");
        homeURL = excelReader.getStringData("URL", 2, 0);

        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        bookStorePage = new BookStorePage();
        profilePage = new ProfilePage();
        loginPage = new LoginPage();
        radioButtonPage = new _03_RadioButtonPage();
        buttonsPage = new _05_ButtonsPage();
        textBoxPage = new _01_TextBoxPage();
        actions = new Actions(driver);


    }


    @BeforeMethod
    public void beforeEveryTest() {
        driver.manage().window().maximize();
    }


    public String elementStatus(WebElement element) {
        return element.getAttribute("class");
    }


    public void bannerRedirectionTest() throws InterruptedException {
        clickASAP(homePage.banner);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }


    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    public WebElement getWebElement(WebElement element) {
        try {
            waitForVisibility(element);
            if (element.isDisplayed())
                return element;
        } catch (Exception ignored) {
        }
        return null;
    }

    public void waitForURL(String URL) {
        wait.until(ExpectedConditions.urlToBe(URL));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable((element)));
    }


    public void clickASAP(WebElement element) throws InterruptedException {
        waitForVisibility(element);
        scrollIntoView(element);
        waitForClickability(element);
        element.click();
    }

    public String getTextFrom(WebElement element) {
        return (getWebElement(element) == null) ? "" : element.getText();
    }

    public boolean isElementDisplayed(WebElement element) {
        if (element == null)
            return false;
        else return element.isDisplayed();
    }

    public boolean isElementSelected(WebElement element) {
        return element.isSelected();
    }


    public String currentWebPage() {
        return driver.getCurrentUrl();
    }

    public void openNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
    }

    public void saveImage(WebElement element) throws IOException {
        wait.until(ExpectedConditions.attributeContains(element, "src", "imgflip.com"));
        String link = element.getAttribute("src");
        URL imageURL = new URL(link);
        BufferedImage saveImage = ImageIO.read(imageURL);
        String location = "D:\\Temp\\";
        ImageIO.write(saveImage, "png", new File(location + System.currentTimeMillis() + ".png"));
    }

    public void goToHomePage() throws InterruptedException {
        driver.get(homeURL);
    }

    public void goFromHomepageToBSA() throws InterruptedException {
        clickASAP(homePage.bsaButton);
        ifBottomBannerDisplayedShutIt();
    }

    public void goFromBSAToProfilePage() throws InterruptedException {
        colapseAllSidebarMenus();
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        clickASAP(sidebarPage.profileBsaSubMenuButton);
    }

    public void goFromBSAToBookStore() throws InterruptedException {
        colapseAllSidebarMenus();
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        clickASAP(sidebarPage.bookStoreBsaSubMenuButton);
    }

    public void ifBottomBannerDisplayedShutIt() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].parentNode.removeChild(arguments[0])", driver.findElement(By.id("fixedban")));
        } catch (Exception ignored) {
        }
    }

    public void colapseAllSidebarMenus2() {
        try {
//            System.out.println(isElementDisplayed(getWebElement(sidebarPage.brokenLinksSidebarButton)));
//            System.out.println("ovo" + driver.findElement(By.xpath("//*[text()='Broken Links - Images']")).getText());
            if (isElementDisplayed(getWebElement(sidebarPage.brokenLinksElementsSubMenuButton))) {
                Thread.sleep(5000);
                clickASAP(sidebarPage.elementsMainMenuSidebarButton);
//                System.out.println(sidebarPage.elementsSidebarButton.getText());
//                System.out.println("1");
            } else {
//                System.out.println("2");
                clickASAP(sidebarPage.elementsMainMenuSidebarButton);
//                System.out.println("3");
                clickASAP(sidebarPage.elementsMainMenuSidebarButton);
//                System.out.println("4");
            }
        } catch (Exception ignored) {
        }
    }

    public void colapseAllSidebarMenus() throws InterruptedException {
        waitForVisibility(sidebarPage.elementsMainMenuSidebarButton);
        if (sidebarPage.elementsMainMenuSidebarButtonStatus.getAttribute("Class").equals(expandedState)) {
            clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        } else {
            clickASAP(sidebarPage.elementsMainMenuSidebarButton);
            clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        }
    }

    public List<WebElement> missingWebElements(List<WebElement> elements) {
        List<WebElement> nonDisplayedElements = new ArrayList<>();
        for (WebElement element : elements)
            if (!element.isDisplayed())
                nonDisplayedElements.add(element);
        return nonDisplayedElements;
    }

    public void goToLoginPage() throws InterruptedException {
        clickASAP(homePage.getBSAHomepageButton());
        colapseAllSidebarMenus();
        ifBottomBannerDisplayedShutIt();
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        clickASAP(sidebarPage.loginBsaSubMenuButton);
    }

    public boolean logOutButtonIsDisplayed() {
        return getTextFrom((getWebElement(profilePage.logOutButton))).equalsIgnoreCase("Log out");
    }

    public boolean logInButtonIsDisplayed() {
        return getTextFrom((getWebElement(profilePage.logInButton))).equalsIgnoreCase("Login");
    }

    public String usernameOnScreen() {
        return profilePage.usernameOSD.getText();
    }

    public void fieldEntry(WebElement element, String s) {
        element.clear();
        element.sendKeys(s);
    }

    public void login(String username, String password) throws InterruptedException {
        fieldEntry(loginPage.usernamePlaceholder, username);
        fieldEntry(loginPage.passwordPlaceholder, password);
        clickLogin();
    }

    public void clickLogin() throws InterruptedException {
        clickASAP(loginPage.loginButton);
    }

    public String pageTitle() {
        return getTextFrom((getWebElement(profilePage.profilePageTitle)));
    }

    public void addCookies() {
        driver.manage().deleteAllCookies();
        Cookie loginCookie1 = new Cookie("userName", "Petar05");
        Cookie loginCookie2 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlBldGFyMDUiLCJwYXNzd29yZCI6Im4kU2N5UFpZZmY3YWF1V1giLCJpYXQiOjE2ODc0ODQzNzV9.LDFBEeNTlC0EvCzdDdsmld7swSDKCZzhK-3y_fn0Mlc");
        Cookie loginCookie3 = new Cookie("expires", "2023-06-30T01%3A39%3A35.359Z");
        Cookie loginCookie4 = new Cookie("userID", "382c2a6f-03a3-4dcb-ad50-8271e6e3ab4f");
        Cookie loginCookie5 = new Cookie("_gid", "GA1.2.1709944281.1686149125");
        driver.manage().addCookie(loginCookie1);
        driver.manage().addCookie(loginCookie2);
        driver.manage().addCookie(loginCookie3);
        driver.manage().addCookie(loginCookie4);
        driver.manage().addCookie(loginCookie5);
//        driver.navigate().refresh();
        //Petar05
        //n$ScyPZYff7aauWX
    }

    public void loginWithCookies() throws InterruptedException {
        goToHomePage();
        addCookies();
        goFromHomepageToBSA();
    }

    public void logOut() throws InterruptedException {
        goFromBSAToProfilePage();
        clickASAP(profilePage.logOutButton);
    }

    public void emptyCollection() throws InterruptedException {
        while (getWebElement(profilePage.trashButton) != null) {
            clickASAP(getWebElement(profilePage.trashButton));
            clickASAP(profilePage.confirmationOKButton);
            driver.navigate().refresh();
        }
    }

    public boolean isTrashButtonDisplayed() {
        return isElementDisplayed(getWebElement(profilePage.trashButton));
    }

    public void addBook(WebElement element) throws InterruptedException {
        clickASAP(element);
        clickASAP(bookStorePage.addToYourCollectionButton);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        clickASAP(bookStorePage.backToBookstoreButton);
    }

    public void addTwoBooks() throws InterruptedException {
        addBook(bookStorePage.bookSpeakingJavascript);
        addBook(bookStorePage.bookProgrammingJavaScriptApplications);
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof BaseTest baseTest)) return false;
//        return Objects.equals(homeURL, baseTest.homeURL) && Objects.equals(collapsedState, baseTest.collapsedState) && Objects.equals(expandedState, baseTest.expandedState);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(homeURL, collapsedState, expandedState);
//    }


    public int hashCodeWebElements(List<WebElement> elements) {
        int hashCode = 1;
        for (WebElement e : elements) {
            if (e == null)
                return 0;
            hashCode = hashCode + Integer.toString(e.getLocation().getX()).hashCode();
            hashCode = hashCode + Integer.toString((e.getLocation().getY()) * 1009).hashCode();
            hashCode = hashCode + (e.getText().hashCode());
        }
        return hashCode;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof BaseTest baseTest)) return false;
//        return Objects.equals(wait, baseTest.wait) && Objects.equals(excelReader, baseTest.excelReader) && Objects.equals(homeURL, baseTest.homeURL) && Objects.equals(homePage, baseTest.homePage) && Objects.equals(sidebarPage, baseTest.sidebarPage) && Objects.equals(bookStorePage, baseTest.bookStorePage) && Objects.equals(profilePage, baseTest.profilePage) && Objects.equals(loginPage, baseTest.loginPage) && Objects.equals(radioButtonPage, baseTest.radioButtonPage) && Objects.equals(buttonsPage, baseTest.buttonsPage) && Objects.equals(textBoxPage, baseTest.textBoxPage) && Objects.equals(collapsedState, baseTest.collapsedState) && Objects.equals(expandedState, baseTest.expandedState);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(wait, excelReader, homeURL, homePage, sidebarPage, bookStorePage, profilePage, loginPage, radioButtonPage, buttonsPage, textBoxPage, collapsedState, expandedState);
//    }

    @AfterMethod
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.quit();
    }


}
