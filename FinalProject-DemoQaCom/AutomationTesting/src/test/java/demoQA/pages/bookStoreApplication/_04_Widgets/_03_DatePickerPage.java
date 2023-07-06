package demoQA.pages.bookStoreApplication._04_Widgets;

import demoQA.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_DatePickerPage extends BaseTest {

    public _03_DatePickerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement datePickerTextEntryField;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement selectMonthDropBox;

    @FindBy(css = ".react-datepicker__current-month.react-datepicker__current-month--hasYearDropdown.react-datepicker__current-month--hasMonthDropdown")
    public WebElement selectMonthFieldLabel;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement selectYearDropBox;

    @FindBy(xpath = "//*[contains(@class,'react-datepicker__day')][@role='option']")
    public List<WebElement> datePickerFromCalendar;

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement inputFieldEnteredDate;

    @FindBy(xpath = "//*[contains(@class,'react-datepicker__day react-datepicker__day')]")
    public List<WebElement> allAvailableDays;















}
