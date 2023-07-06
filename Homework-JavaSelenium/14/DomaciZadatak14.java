package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciZadatak14 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        WebElement googlefieldBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
        googlefieldBox.sendKeys("YouTube");

        WebElement googleSearchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
        googleSearchButton.click();

        WebElement firstGoogleResult = driver.findElement(By.xpath("/html/body/div[6]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
        firstGoogleResult.click();

        WebElement youTubeSearchField = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        youTubeSearchField.sendKeys("gangnam style");

        WebElement youTubeSearchButton = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/button/yt-icon"));
        youTubeSearchButton.click();

        WebElement gangnamStyleSong = driver.findElement(By.xpath("/html/body/ytd-app/div[2]/ytd-video-preview/div/div[2]/a/div[1]/ytd-player/div/div/div[16]/div[1]"));
        gangnamStyleSong.click();

        



    }
}
