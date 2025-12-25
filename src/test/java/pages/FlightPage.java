package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightPage {

    WebDriver driver;

    By fromCity = By.name("fromPort");
    By toCity = By.name("toPort");
    By searchBtn = By.cssSelector("input[type='submit']");

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRoute(String from, String to) {
        new Select(driver.findElement(fromCity)).selectByVisibleText(from);
        new Select(driver.findElement(toCity)).selectByVisibleText(to);
    }

    public void searchFlights() {
        driver.findElement(searchBtn).click();
    }
}
