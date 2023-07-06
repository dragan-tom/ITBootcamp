package demoQA.tests.BookStoreApplication._04_Widgets;

import com.sun.source.tree.AssertTree;
import demoQA.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class _03_DatePickerTest extends BaseTest {

    public _03_DatePickerTest() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void PageSetUp() {
        driver.get("https://demoqa.com/date-picker");
    }

    @Test
    public void selectDateByTextEntry() {
        WebElement element = datePicker.datePickerTextEntryField;
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys("09/28/2024");
        element.sendKeys(Keys.ENTER);
        Assert.assertEquals(datePicker.datePickerTextEntryField.getAttribute("value"), ("09/28/2024"));
    }

    @Test
    public void testPickAllDatesFromMonth() {
        String startMonth = "09/2002";

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
        Calendar cal2 = Calendar.getInstance();
        try {
            cal2.setTime(sdf2.parse(startMonth));
        } catch (ParseException e) {
            System.out.println("Nisam uspeo");
            e.printStackTrace();
        }
        String expectedDate2 = String.format("%02d", cal2.get(Calendar.MONTH) + 1) + "/" + String.format("%02d", cal2.get(Calendar.DATE)) + "/" + cal2.get(Calendar.YEAR);
        System.out.println("cal2 " + expectedDate2);
        datePicker.datePickerTextEntryField.click();
        Select monthSelector2 = new Select(datePicker.selectMonthDropBox);
        monthSelector2.selectByValue(Integer.toString(cal2.get(Calendar.MONTH)));
        Select yearSelector2 = new Select(datePicker.selectYearDropBox);
        yearSelector2.selectByValue(Integer.toString(cal2.get(Calendar.YEAR)));
        int startingDay = Integer.parseInt("pocinje od kog datuma u proslom mesecu: " + datePicker.datePickerFromCalendar.get(0).getText());
        int day = cal2.get(Calendar.DAY_OF_MONTH);
        Calendar cal3 = cal2;

//            if (startingDay == day)

//
//        String startDate = "09/26/2020"; //  MM/dd/yyyy
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        Calendar cal = Calendar.getInstance();
//        try {
//            cal.setTime(sdf.parse(startDate));
//        } catch (ParseException e) {
//            System.out.println("Nisam uspeo");
//            e.printStackTrace();
//        }
//        int totalNumberOfDatesToBeTested = 1;
//        String month = Integer.toString(cal.get(Calendar.MONTH));
//        String year = Integer.toString(cal.get(Calendar.YEAR));
//        for (int i = 0; i < totalNumberOfDatesToBeTested; i++) {
//            cal.add(Calendar.DAY_OF_MONTH, 1);
//            datePicker.datePickerTextEntryField.click();
//            Select monthSelector = new Select(datePicker.selectMonthDropBox);
//            monthSelector.selectByValue(month);
//            Select yearSelector = new Select(datePicker.selectYearDropBox);
//            yearSelector.selectByVisibleText(year);
//            if (totalNumberOfDatesToBeTested < 2)
//                totalNumberOfDatesToBeTested = datePicker.datePickerFromCalendar.size();
//            datePicker.datePickerFromCalendar.get(i).click();
//            String actualDate = datePicker.inputFieldEnteredDate.getAttribute("value");
//            String expectedDate = String.format("%02d", cal.get(Calendar.MONTH) + 1) + "/" + String.format("%02d", cal.get(Calendar.DATE)) + "/" + cal.get(Calendar.YEAR);
//            Assert.assertEquals(actualDate, expectedDate);
//        }
    }

    @Test
    public void datePickerPositive() {
        for (int k = 2; k <= excelReader.getLastRow("DatePickerPositive"); k++) {
            String dateForTesting = excelReaderData("DatePickerPositive", k, 0);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Calendar cal = Calendar.getInstance();
            try {
                cal.setTime(sdf.parse(dateForTesting));
            } catch (ParseException e) {
                System.out.println("Failed!");
                e.printStackTrace();
            }
            int dd = cal.get(Calendar.DATE);
            int mm = cal.get(Calendar.MONTH);
            int yyyy = cal.get(Calendar.YEAR);
            String expectedResult = String.format("%02d", mm + 1) + "/" + String.format("%02d", dd) + "/" + yyyy;
            datePicker.datePickerTextEntryField.click();
            Select monthSelector = new Select(datePicker.selectMonthDropBox);
            monthSelector.selectByValue(Integer.toString(mm));
            Select yearSelector3 = new Select(datePicker.selectYearDropBox);
            yearSelector3.selectByValue(Integer.toString(yyyy));
            try {
                for (int i = 0; i < 8; i++) {
                    if (Integer.parseInt(datePicker.allAvailableDays.get(i).getText()) == 1)
                        while (i < 37) {
                            System.out.println(i);
                            if (Integer.parseInt(datePicker.allAvailableDays.get(i).getText()) == dd) {
                                datePicker.allAvailableDays.get(i).click();
                                break;
                            }
                            i++;
                        }
                }
            } catch (Exception ignored) {
                System.out.println("Warning: Stale element found.");
            }
            String actualResult = datePicker.inputFieldEnteredDate.getAttribute("value");
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void datePickerNegative() {
        for (int k = 2; k <= excelReader.getLastRow("DatePickerNegative"); k++) {
            String dateForTesting = excelReaderData("DatePickerNegative", k, 0);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            try {
                cal.setTime(sdf.parse(dateForTesting));
            } catch (ParseException e) {
                System.out.println("Failed!");
                e.printStackTrace();
            }
            int dd = cal.get(Calendar.DATE);
            int mm = cal.get(Calendar.MONTH);
            int yyyy = cal.get(Calendar.YEAR);
            datePicker.datePickerTextEntryField.click();
            Select monthSelector = new Select(datePicker.selectMonthDropBox);
            Select yearSelector3 = new Select(datePicker.selectYearDropBox);
            try {
                monthSelector.selectByValue(Integer.toString(mm));
                yearSelector3.selectByValue(Integer.toString(yyyy));
            } catch (Exception e) {
                continue;
            }
            try {
                for (int i = 0; i < 8; i++) {
                    if (Integer.parseInt(datePicker.allAvailableDays.get(i).getText()) == 1)
                        while (i < 37) {
                            System.out.println(i);
                            if (Integer.parseInt(datePicker.allAvailableDays.get(i).getText()) == dd) {
                                datePicker.allAvailableDays.get(i).click();
                                break;
                            }
                            i++;
                        }
                }
            } catch (Exception ignored) {
                System.out.println("Warning: Stale element found.");
            }
            String actualResult = datePicker.inputFieldEnteredDate.getAttribute("value");
            Assert.assertNotEquals(actualResult, dateForTesting);
        }
    }

}