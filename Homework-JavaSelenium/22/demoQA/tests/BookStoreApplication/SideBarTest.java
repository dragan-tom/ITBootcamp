package demoQA.tests.BookStoreApplication;

import demoQA.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        goToHomePage();
        clickASAP(homePage.getElementsButton());
        colapseAllSidebarMenus();
    }

    @Test
    public void allSidebarMainMenuButtonsAreDisplayed() throws InterruptedException {
        Assert.assertEquals(hashCodeWebElements(sidebarPage.sidebarMainMenuButtons()), -1202086214);
    }

    @Test
    public void sidebarMainMenuButtonsAreExpandable() throws InterruptedException {
        Assert.assertFalse(isElementDisplayed(sidebarPage.brokenLinksElementsSubMenuButton));
        clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.brokenLinksElementsSubMenuButton));
        clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.brokenLinksElementsSubMenuButton));

        Assert.assertFalse(isElementDisplayed(sidebarPage.practiceFormFormsSubMenuButton));
        clickASAP(sidebarPage.formsMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.practiceFormFormsSubMenuButton));
        clickASAP(sidebarPage.formsMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.practiceFormFormsSubMenuButton));

        Assert.assertFalse(isElementDisplayed(sidebarPage.browserWindowsAlertSubMenuButton));
        clickASAP(sidebarPage.alertsFrameAndWindowsMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.browserWindowsAlertSubMenuButton));
        clickASAP(sidebarPage.alertsFrameAndWindowsMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.browserWindowsAlertSubMenuButton));

        Assert.assertFalse(isElementDisplayed(sidebarPage.accordianWidgetsSubMenuButton));
        clickASAP(sidebarPage.widgetsMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.accordianWidgetsSubMenuButton));
        clickASAP(sidebarPage.widgetsMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.accordianWidgetsSubMenuButton));

        Assert.assertFalse(isElementDisplayed(sidebarPage.sortableInteractionsSubMenuButton));
        clickASAP(sidebarPage.interactionsMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.sortableInteractionsSubMenuButton));
        clickASAP(sidebarPage.interactionsMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.sortableInteractionsSubMenuButton));

        Assert.assertFalse(isElementDisplayed(sidebarPage.loginBsaSubMenuButton));
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        Assert.assertTrue(isElementDisplayed(sidebarPage.loginBsaSubMenuButton));
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        Assert.assertFalse(isElementDisplayed(sidebarPage.loginBsaSubMenuButton));
    }

    @Test
    public void allSidebarSubMenuButtonsAreDisplayed() throws InterruptedException {
        clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.elementsSubMenuButtons()), 785200088);

        clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        clickASAP(sidebarPage.formsMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.formsSubMenuButtons()), 578779938);

        clickASAP(sidebarPage.formsMainMenuSidebarButton);
        clickASAP(sidebarPage.alertsFrameAndWindowsMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.alertsSubMenuButtons()), 438576167);

        clickASAP(sidebarPage.alertsFrameAndWindowsMainMenuSidebarButton);
        clickASAP(sidebarPage.widgetsMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.widgetsSubMenuuButtons()), -2047499914);

        clickASAP(sidebarPage.widgetsMainMenuSidebarButton);
        clickASAP(sidebarPage.interactionsMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.interactionsSubMenuButtons()), 475102202);

        clickASAP(sidebarPage.interactionsMainMenuSidebarButton);
        clickASAP(sidebarPage.bsaMainMenuSidebarButton);
        Assert.assertEquals(hashCodeWebElements(sidebarPage.bsaSubMenuButtons()), 647737257);
    }

    @Test
    public void allSidebarSubMenuButtonLinksAreWorking() throws InterruptedException {
        clickASAP(sidebarPage.elementsMainMenuSidebarButton);
        clickASAP(sidebarPage.textBoxElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");

        clickASAP(sidebarPage.checkBoxElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");

        clickASAP(sidebarPage.radioButtonElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");

        clickASAP(sidebarPage.webTablesElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");

        clickASAP(sidebarPage.buttonsElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");

        clickASAP(sidebarPage.linksElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");

        clickASAP(sidebarPage.brokenLinksElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");

        clickASAP(sidebarPage.uploadAndDownloadElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/upload-download");

        clickASAP(sidebarPage.dynamicPropertiesElementsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");

        driver.get("https://demoqa.com/forms");
        clickASAP(sidebarPage.practiceFormFormsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");

        driver.get("https://demoqa.com/alertsWindows");
        clickASAP(sidebarPage.browserWindowsAlertSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");

        clickASAP(sidebarPage.alertsAlertSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alerts");

        clickASAP(sidebarPage.framesAlertSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/frames");

        clickASAP(sidebarPage.nestedFramesAlertSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/nestedframes");

        clickASAP(sidebarPage.modalDialogsAlertSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/modal-dialogs");

        driver.get("https://demoqa.com/widgets");
        clickASAP(sidebarPage.accordianWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/accordian");

        clickASAP(sidebarPage.autoCompleteWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/auto-complete");

        clickASAP(sidebarPage.datePickerWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/date-picker");

        clickASAP(sidebarPage.sliderWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/slider");

        clickASAP(sidebarPage.progressWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/progress-bar");

        clickASAP(sidebarPage.tabsWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/tabs");

        clickASAP(sidebarPage.toolTipsWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/tool-tips");

        clickASAP(sidebarPage.menuWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/menu");

        clickASAP(sidebarPage.selectMenuWidgetsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/select-menu");

        driver.get("https://demoqa.com/interaction");
        clickASAP(sidebarPage.sortableInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sortable");

        clickASAP(sidebarPage.selectableInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/selectable");

        clickASAP(sidebarPage.resizableInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/resizable");

        clickASAP(sidebarPage.droppableInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/droppable");

        clickASAP(sidebarPage.dragabbleInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dragabble");

        clickASAP(sidebarPage.dragabbleInteractionsSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dragabble");

        driver.get("https://demoqa.com/books");
        clickASAP(sidebarPage.loginBsaSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");

        clickASAP(sidebarPage.bookStoreBsaSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");

        clickASAP(sidebarPage.profileBsaSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");

        clickASAP(sidebarPage.bookStoreApiSubMenuButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/swagger/");



    }


}
