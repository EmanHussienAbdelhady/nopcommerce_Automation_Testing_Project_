package org.example.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.example.stepdefination.hook.driver;

public class D04_searchStepDef {
    private String searchKeyword;
    HomePage homePage = new HomePage();
    SoftAssert asser = new SoftAssert();

    @Given("the user is on the home page")
    public void theuserisonthehomepage() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("the user searches for product with name {string}")
    public void theUserSearchesForProductWithName(String productName) {
        homePage.Searchbox.sendKeys(productName);
        String searchkeyword = productName;
        homePage.searchbutton.click();
    }

    @And("each search result should contain the search keyword")
    public void eachSearchResultShouldContainTheSearchKeyword() {
        String results = homePage.searchkey.getText();
        String[] searchResults = results.split(";");

        for (String result : searchResults) {
            assert result.toLowerCase().contains(searchKeyword.toLowerCase()) :
                    "Search result '" + result + "' does not contain the search keyword '" + searchKeyword + "'";
        }

    }


    @And("Url contains search Url")
    public void urlContainsSearchUrl() {
        String acutalurl= driver.getCurrentUrl();
        asser.assertTrue(acutalurl.contains("https://demo.nopcommerce.com/search?q="),
                "Expected URL to contain '" + "https://demo.nopcommerce.com/search?q=" + "', but found: " + acutalurl);
        asser.assertAll();
    }

    @Then("search results should be relevant")
    public void searchResultsShouldBeRelevant() {
        int numberOfResults = homePage.productsresults.size();
        System.out.println("Number of search results: " + numberOfResults);
        ///////
        String[] searchWords = {"book", "laptop", "nike"};

        for (String searchWord : searchWords) {
            for (int i = 0; i < numberOfResults; i++) {
                String resultText = homePage.productsresults.get(i).getText().toLowerCase();
                if (resultText.contains(searchWord.toLowerCase())) {
                    System.out.println("Search word '" + searchWord + "' found in result " + (i + 1));
                } else {
                    System.out.println("Search word '" + searchWord + "' not found in result " + (i + 1));
                }
            }
        }

    }

    @When("the user searches for product with SKU {string}")
    public void theUserSearchesForProductWithSKU(String productSku) {
        homePage.Searchbox.sendKeys(productSku);
        String searchkeyword = productSku;
        homePage.searchbutton.click();
    }

    @Then("user should click on the product in search results")
    public void userShouldClickOnTheProductInSearchResults() {
           homePage.itemsr.click();
    }

    @And("the SKU shown on the product page should contain the searched SKU")
    public void theSKUShownOnTheProductPageShouldContainTheSearchedSKU() {
        String expected =homePage.sku.getText();
        String searchdsku= searchKeyword;
        asser.assertEquals( expected,searchdsku);
        asser.assertAll();

    }
}



