package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

    WebDriver driver;

    By prices = By.xpath("//td[contains(text(),'$')]");
    
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printCheapestFlights() {

        List<WebElement> priceElements = driver.findElements(prices);
        List<Double> priceList = new ArrayList<>();

        for (WebElement price : priceElements) {
            String priceText = price.getText().replace("$", "").trim();
            priceList.add(Double.parseDouble(priceText));
        }

        priceList.sort(Double::compareTo);

        System.out.println("Cheapest Flight: $" + priceList.get(0));
        System.out.println("Second Cheapest Flight: $" + priceList.get(1));
    }
}
