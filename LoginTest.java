package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Login Failed!");
    }
}