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
        WebElement google= Driver.getDriver().findElement(By.xpath("(//div[@class = 'RegisterForm_socRowCont__fpaxX'])[1]"));
        BrowserUtils.waitFor(3);
        google.click();
    }


}
