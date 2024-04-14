package org.example.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.pages.*;

import java.util.List;

import static org.example.stepdefination.hook.driver;



public class D03_currenciesStepDef {
    HomePage home = new HomePage();
    @When("go to homepage")
    public void goToHomepage() {

        SoftAssert Mysoft = new SoftAssert();
        String expectedone = "https://demo.nopcommerce.com/";
        String actualone = driver.getCurrentUrl();
        Mysoft.assertEquals(actualone, expectedone, "Current URL doesn't match expected URL");
    }


    @And("user selects Euro currency")
    public void userSelectsEuroCurrency() {
        Select choice = new Select(home.currencyDropdown);
        choice.selectByVisibleText("Euro");
    }


    @Then("Euro symbol {string} is shown on the product prices")
    public void euroSymbolIsShownOnTheProductPrices(String eurosymbol) {
        List<WebElement> productList = home.getProductList();

        for (WebElement product : productList) {
            String productPrice = product.getText();
            Assert.assertTrue(productPrice.contains("€"), "Euro symbol (€) is not shown on product price: " + productPrice);

        }

    }


}
