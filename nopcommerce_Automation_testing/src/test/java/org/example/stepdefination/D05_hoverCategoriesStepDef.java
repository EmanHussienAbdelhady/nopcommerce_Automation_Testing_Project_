package org.example.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.example.stepdefination.hook.driver;

public class D05_hoverCategoriesStepDef {
    SoftAssert sof = new SoftAssert();
    HomePage hoverObj = new HomePage();
   @Given("hover on the selected category")
    public void hoverontheselectedcategory(){
       WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(hoverObj.hover()));
       Actions action1 = new Actions(hook.driver);
       action1.moveToElement(hoverObj.hover()).perform();

   }

    @And("select random one of the three sub categories")
    public void selectRandomOneOfTheThreeSubCategories() {
        WebDriverWait wait = new WebDriverWait(hook.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(hoverObj.selectSub()));
        Actions action2 = new Actions(hook.driver);
        action2.moveToElement(hoverObj.selectSub()).perform();
        hoverObj.selectSub().click();
    }

    @Then("verify sub-category title is equal or contains the one you get")
    public void verifySubCategoryTitleIsEqualOrContainsTheOneYouGet() {
        String actualWord = hoverObj.verifySubCategory().getText();
        String expectedWord = "Software";
        sof.assertEquals(actualWord, expectedWord, "Wrong");
        System.out.println(actualWord.toLowerCase().trim());
        sof.assertAll();
    }
}
