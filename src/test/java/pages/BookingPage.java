package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BookingPage extends BasePage {

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookies;

    @FindBy(xpath = "//input[@name='ss']")
    public WebElement stay_input;

//    @FindBy(xpath = "//*[text()='Check-in Date']")
//    public WebElement check;

    @FindBy(xpath = "//*[contains(text(),'Check-in Date')]")
    public WebElement check;


    @FindBy(xpath = "//span[@data-date='2022-12-01']")
    public WebElement check_in_date;

    @FindBy(xpath = "//span[@data-date='2022-12-07']")
    public WebElement getCheck_out_date;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement search_button;

    @FindBy(xpath = "//h1[@class='e1f827110f d3a14d00da']")
    public WebElement number_of_properties;

    @FindBy(xpath = "//button[@data-testid='date-display-field-start']")
    public WebElement left_side_date1;

    @FindBy(xpath = "//button[@data-testid='date-display-field-end']")
    public WebElement left_side_date2;

    @FindBy(xpath = "//div[@data-testid='title']")
    public List<WebElement> names_of_properties;

}
