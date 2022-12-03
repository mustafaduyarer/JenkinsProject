package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

public class US_013 {
    @Given("user sayafaya gider")
    public void userSayafayaGider() {
        Driver.getDriver().get("https://test.hypnotes.net/register");
        WebElement google= Driver.getDriver().findElement(By.id("social-media-login-logo-g"));
        BrowserUtils.waitFor(3);
        google.click();
    }

//    @And("user google linkine tiklar")
//    public void userGoogleLinkineTiklar() {
//        WebElement googleemail= Driver.getDriver().findElement(By.xpath("//input[@type='email']"));
//         googleemail.sendKeys("hypnotes2022tr1@gmail.com");
//         BrowserUtils.waitFor(2);
//         WebElement googlebutton= Driver.getDriver().findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
//         googlebutton.click();
//
//    }
}
