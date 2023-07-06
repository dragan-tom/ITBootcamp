package demoQA.pages.bookStoreApplication;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SidebarPage extends BaseTest {


    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Elements']//following::div[4]")
    public WebElement elementsMainMenuSidebarButtonStatus;
    // -------- Elements------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Elements']/..")
    public WebElement elementsMainMenuSidebarButton;

    @FindBy(xpath = "//span[.='Text Box']")
    public WebElement textBoxElementsSubMenuButton;

    @FindBy(xpath = "//span[.= 'Check Box']")
    public WebElement checkBoxElementsSubMenuButton;

    @FindBy(xpath = "//*[.='Radio Button']")
    public WebElement radioButtonElementsSubMenuButton;

    @FindBy(xpath = "//span[.='Web Tables']")
    public WebElement webTablesElementsSubMenuButton;

    @FindBy(xpath = "//*[.='Buttons']")
    public WebElement buttonsElementsSubMenuButton;

    @FindBy(xpath = "//span[.='Links']")
    public WebElement linksElementsSubMenuButton;

    @FindBy(xpath = "//*[text()='Broken Links - Images']")
    public WebElement brokenLinksElementsSubMenuButton;

    @FindBy(xpath = "//span[.='Upload and Download']")
    public WebElement uploadAndDownloadElementsSubMenuButton;

    @FindBy(xpath = "//span[.='Dynamic Properties']")
    public WebElement dynamicPropertiesElementsSubMenuButton;
    // -------- Forms---------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Forms']/..")
    public WebElement formsMainMenuSidebarButton;

    @FindBy(xpath = "//span[.='Practice Form']")
    public WebElement practiceFormFormsSubMenuButton;
    // -------- Alert, Frames and Windows ------------------------------------------------------------------------------
    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Alerts, Frame & Windows']/..")
    public WebElement alertsFrameAndWindowsMainMenuSidebarButton;

    @FindBy(xpath = "//span[.='Browser Windows']")
    public WebElement browserWindowsAlertSubMenuButton;

    @FindBy(xpath = "(//*[.='Alerts'])[1]")
    public WebElement alertsAlertSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Frames']")
    public WebElement framesAlertSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Nested Frames']")
    public WebElement nestedFramesAlertSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Modal Dialogs']")
    public WebElement modalDialogsAlertSubMenuButton;
    // -------- Widgets ------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Widgets']/..")
    public WebElement widgetsMainMenuSidebarButton;

    @FindBy(xpath = "//span[normalize-space()='Accordian']")
    public WebElement accordianWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Auto Complete']")
    public WebElement autoCompleteWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Date Picker']")
    public WebElement datePickerWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Slider']")
    public WebElement sliderWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Progress Bar']")
    public WebElement progressWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Tabs']/..")
    public WebElement tabsWidgetsSubMenuButton;

    @FindBy(xpath = "(//*[.='Tool Tips'])[1]")
    public WebElement toolTipsWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Menu']")
    public WebElement menuWidgetsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Select Menu']")
    public WebElement selectMenuWidgetsSubMenuButton;
    // -------- Interactions -------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[contains(@class, 'header-text') and text() = 'Interactions']/..")
    public WebElement interactionsMainMenuSidebarButton;

    @FindBy(xpath = "(//*[.='Sortable'])[1]")
    public WebElement sortableInteractionsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Selectable']")
    public WebElement selectableInteractionsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Resizable']")
    public WebElement resizableInteractionsSubMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Droppable']")
    public WebElement droppableInteractionsSubMenuButton;

    @FindBy(xpath = "(//*[.='Dragabble'])[1]")
    public WebElement dragabbleInteractionsSubMenuButton;
    // -------- Book Store Application ---------------------------------------------------------------------------------
    @FindBy(xpath = "//*[text()='Book Store Application']")
    public WebElement bsaMainMenuSidebarButton;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginBsaSubMenuButton;

    @FindBy(xpath = "//*[text()='Book Store']")
    public WebElement bookStoreBsaSubMenuButton;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profileBsaSubMenuButton;

    @FindBy(xpath = "//*[contains(.,'Book Store API')][@class='btn btn-light ']")
    public WebElement bookStoreApiSubMenuButton;


    public List<WebElement> sidebarMainMenuButtons(){
        List<WebElement> list = new ArrayList<>();
        list.add(elementsMainMenuSidebarButton);
        list.add(formsMainMenuSidebarButton);
        list.add(alertsFrameAndWindowsMainMenuSidebarButton);
        list.add(widgetsMainMenuSidebarButton);
        list.add(interactionsMainMenuSidebarButton);
        list.add(bsaMainMenuSidebarButton);
        return list;
    }

    public List<WebElement> elementsSubMenuButtons(){
        List<WebElement> list = new ArrayList<>();
        list.add(textBoxElementsSubMenuButton);
        list.add(checkBoxElementsSubMenuButton);
        list.add(radioButtonElementsSubMenuButton);
        list.add(webTablesElementsSubMenuButton);
        list.add(buttonsElementsSubMenuButton);
        list.add(linksElementsSubMenuButton);
        list.add(brokenLinksElementsSubMenuButton);
        list.add(uploadAndDownloadElementsSubMenuButton);
        list.add(dynamicPropertiesElementsSubMenuButton);
        return list;
    }

    public List<WebElement> formsSubMenuButtons(){
        List<WebElement> list = new ArrayList<>();
        list.add(practiceFormFormsSubMenuButton);
        for (WebElement a: list
             ) {
            System.out.println(a.getText());
        }
        return list;
    }

    public List<WebElement> alertsSubMenuButtons() {
        List<WebElement> list = new ArrayList<>();
        list.add(browserWindowsAlertSubMenuButton);
        list.add(alertsAlertSubMenuButton);
        list.add(framesAlertSubMenuButton);
        list.add(nestedFramesAlertSubMenuButton);
        list.add(modalDialogsAlertSubMenuButton);
        return list;
    }

    public List<WebElement> widgetsSubMenuuButtons() {
        List<WebElement> list = new ArrayList<>();
        list.add(accordianWidgetsSubMenuButton);
        list.add(autoCompleteWidgetsSubMenuButton);
        list.add(datePickerWidgetsSubMenuButton);
        list.add(sliderWidgetsSubMenuButton);
        list.add(progressWidgetsSubMenuButton);
        list.add(tabsWidgetsSubMenuButton);
        list.add(toolTipsWidgetsSubMenuButton);
        list.add(menuWidgetsSubMenuButton);
        list.add(selectMenuWidgetsSubMenuButton);
        return list;
    }

    public List<WebElement> interactionsSubMenuButtons() {
        List<WebElement> list = new ArrayList<>();
        list.add(sortableInteractionsSubMenuButton);
        list.add(selectableInteractionsSubMenuButton);
        list.add(resizableInteractionsSubMenuButton);
        list.add(droppableInteractionsSubMenuButton);
        list.add(dragabbleInteractionsSubMenuButton);
        return list;
    }

    public List<WebElement> bsaSubMenuButtons() {
        List<WebElement> list = new ArrayList<>();
        list.add(loginBsaSubMenuButton);
        list.add(bookStoreBsaSubMenuButton);
        list.add(profileBsaSubMenuButton);
        list.add(bookStoreApiSubMenuButton);
        return list;
    }


//    ---------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[contains(@class, 'header-text')]")
    public List<WebElement> sidebarMainMenuButtons2;

    @FindBy(xpath = "//*[@class='element-group'][contains(., 'Elements')]/descendant::*[@class='btn btn-light ']")
    public List<WebElement> elementsSubMenuButtons2;


}
