package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By productsTitle = By.className("title");

    public boolean isHomePageDisplayed() {
        return driver.findElement(productsTitle).isDisplayed();
    }
}
