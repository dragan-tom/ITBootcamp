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


    @FindBy(css = "img[src='/images/Toolsqa.jpg']")
    public WebElement banner;

    @FindBy(linkText = "Form Authentication")
    public WebElement loginForm;

    @FindBy(css = ".avatar.mx-auto.white")
    public WebElement bsaButton;

    @FindAll({@FindBy(css = ".card.mt-4.top-card")})
    public List<WebElement> homePageButtons;

    public WebElement getBSAHomepageButton() throws InterruptedException {
        for (int i = 0; i < homePageButtons.size(); i++) {
            if (homePageButtons.get(i).getText().trim().equalsIgnoreCase("Book Store Application")) {
                scrollIntoView(homePageButtons.get(i));
                return homePageButtons.get(i);
            }
        }
        return null;
    }

    public WebElement getElementsButton() throws InterruptedException {
        for (int i = 0; i < homePageButtons.size(); i++) {
            if (homePageButtons.get(i).getText().trim().equalsIgnoreCase("Elements")) {
                scrollIntoView(homePageButtons.get(i));
                return homePageButtons.get(i);
            }
        }
        return null;
    }



}
