package org.example.stepdefination;

import static org.example.stepdefination.hook.driver;
import org.example.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    SoftAssert soft= new SoftAssert();
    HomePage home =new HomePage();
    P02_login log = new P02_login();

    @Given("user go to login page")
    public void login(){
      SoftAssert soft = new SoftAssert();
      String expectedUrl = "https://demo.nopcommerce.com/" ;
      String actualUrl = driver.getCurrentUrl();
      soft.assertEquals(actualUrl, expectedUrl, "Current URL doesn't   match expected URL");
           home.logintab().click();
    }
    @When("user login with valid username and password")
    public void userLoginWithAnd() {
        log.logmail.sendKeys("amit@test.com");
        log.logpass.sendKeys("hellothere");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        log.logbutton.click();
    }

    @Then("user login to the system successfully")
    public void userlogintothesystemsuccessfully() {
        SoftAssert soft = new SoftAssert();
        String expectedUrl = "https://demo.nopcommerce.com/customer/info";
        String actualUrl = driver.getCurrentUrl();
        soft.assertEquals(actualUrl, expectedUrl, "Current URL doesn't match expected URL");
         log.myaccounttab().click();
    }

    @When("user login with invalid email and password")
    public void userloginwithinvalidemailandpassword() throws InterruptedException {
        log.logmail.sendKeys("ami@test.com");
        log.logpass.sendKeys("hellthere");


    }

    @Then("user could not login to the system")
    public void usercouldnotlogintothesystem() {
        String actualmsg=log.Loginerrormessage.getText();
        soft.assertEquals(actualmsg,"Login was unsuccessful. Please correct the errors and try again");
        soft.assertEquals(log.Loginerrormessage.getCssValue("color"),"rgb(254, 151, 148)");
        soft.assertAll();
    }



}
