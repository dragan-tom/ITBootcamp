package demoQA.pages;

import org.openqa.selenium.WebElement;
import demoQA.base.BaseTest;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h5[contains(.,'Elements')]")
    public WebElement elementsButton;

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    public WebElement banner;

    @FindBy(linkText = "Form Authentication")
    public WebElement loginForm;

    @FindBy(xpath = "//h5[contains(.,'Book Store Application')]")
    public WebElement bsaButton;

    @FindBy(css = ".avatar.mx-auto.white")
    public WebElement elementsButton2;
//
//    ElementsButton
//    //h5[contains(.,'Elements')]

}






