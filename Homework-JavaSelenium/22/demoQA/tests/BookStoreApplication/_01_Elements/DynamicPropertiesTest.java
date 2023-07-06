package demoQA.tests.BookStoreApplication._01_Elements;

import demoQA.base.BaseTest;
import demoQA.pages.bookStoreApplication._01_Elements._09_DynamicPropertiesPage;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest {

    private _09_DynamicPropertiesPage dynamicPropertiesPage;

    @Test
    public void waitingForElementToBecomingEnabled() throws InterruptedException {
        dynamicPropertiesPage = new _09_DynamicPropertiesPage();
        driver.get("https://demoqa.com/dynamic-properties");
        System.out.println(dynamicPropertiesPage.waitingToBecomingEnabled.isEnabled());
        Thread.sleep(7000);
        System.out.println(dynamicPropertiesPage.waitingToBecomingEnabled.isEnabled());
    }

}
