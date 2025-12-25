package tests;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import base.baseTest;
import pages.FlightPage;
import pages.HomePage;
import pages.SearchResultPage;
 

public class FlightSearchTest extends baseTest {

    @Test
    public void searchAndValidateFlights() {

        HomePage home = new HomePage(driver);
        home.openApplication();

        FlightPage flights = new FlightPage(driver);
        flights.selectRoute("Boston", "London");
        flights.searchFlights();

        SearchResultPage results = new SearchResultPage(driver);
        results.printCheapestFlights();

        // Open new tab and go to Google
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
    }
}
