package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BookingPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class Booking_Step_Def {

    BookingPage bookingPage = new BookingPage();

    Actions actions = new Actions(Driver.getDriver());


    @Given("user should be able to go url")
    public void userShouldBeAbleToGoUrl() {
        Driver.getDriver().get("https://www.booking.com");
        BrowserUtils.waitFor(5);
        bookingPage.cookies.click();
        BrowserUtils.waitFor(5);

    }

    @When("user should be able to click place input")
    public void userShouldBeAbleToClickPlaceInput() {
//        WebElement place= bookingPage.stay_input;
//        place.click();
//        place.sendKeys("Porto");
        //  bookingPage.stay_input.click();
        //  BrowserUtils.waitFor(3);
        bookingPage.stay_input.sendKeys("Porto");

    }

    @And("user should be able to choose Check-in date")
    public void userShouldBeAbleToChooseCheckInDate() {
        bookingPage.check.click();
        BrowserUtils.waitFor(2);

        bookingPage.check_in_date.click();
        BrowserUtils.waitFor(2);

    }

    @And("user should be able to choose Check-out date")
    public void userShouldBeAbleToChooseCheckOutDate() {
        bookingPage.getCheck_out_date.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should be able to click search button")
    public void userShouldBeAbleToClickSearchButton() {
        bookingPage.search_button.click();
        BrowserUtils.waitFor(2);

    }

    @And("user can see total number of properties")
    public void userCanSeeTotalNumberOfProperties() {
        String properties = bookingPage.number_of_properties.getText();
        System.out.println("Number of properties = " + properties);
        System.out.println("--------------------------------------------------");

    }


    @Then("user Verify the Check-in date on the left is {int} of next month")
    public void userVerifyTheCheckInDateOnTheLeftIsOfNextMonth(int date1) {
        String Left_side_date1 = bookingPage.left_side_date1.getText();
        System.out.println("Left_side_date1 = " + Left_side_date1);
        Assert.assertEquals(Left_side_date1, date1);
    }


    @Then("user Verify the Check-in date on the left is {int} {string}, {string} {int}, {int} of next month")
    public void userVerifyTheCheckInDateOnTheLeftIsOfNextMonth(int date1, String day, String mount, int date, int year) {
        String actual = bookingPage.left_side_date1.getText();
        String actual_regex = actual.trim().replaceAll("\\s|\\n", "");
        String expected = date1 + day + "," + mount + date + "," + year;

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual_regex);
        Assert.assertEquals(expected, actual_regex);
    }


    @Then("user Verify the Check-out date on the left is {int} {string}, {string} {int}, {int} of next month")
    public void userVerifyTheCheckOutDateOnTheLeftIsOfNextMonth(int date1, String day, String mount, int date, int year) {
        System.out.println("--------------------------------------------------");
        String actual = bookingPage.left_side_date2.getText();
        String actual_regex = actual.trim().replaceAll("\\s|\\n", "");
        String expected = date1 + day + "," + mount + date + "," + year;

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual_regex);
        Assert.assertEquals(expected, actual_regex);
    }

    @And("user should Print the names of the properties found on this first page")
    public void userShouldPrintTheNamesOfThePropertiesFoundOnThisFirstPage() {
        System.out.println("--------------------------------------------------");

        int size = bookingPage.names_of_properties.size();
        System.out.println("--------------------------------------------------");

        List<WebElement> names = bookingPage.names_of_properties;
        System.out.println("size = " + size);
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.println("Name of place : " + names.get(i).getText());

            Driver.getDriver().manage().deleteAllCookies();

        }
    }
}
