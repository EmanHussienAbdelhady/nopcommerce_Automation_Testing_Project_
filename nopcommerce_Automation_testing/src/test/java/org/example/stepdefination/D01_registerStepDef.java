package org.example.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.P01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    HomePage home =new HomePage();
    P01_register register=new P01_register();
    @Given("user go to register page")
    public void register(){
      home.registertab().click();

    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.Genderf.click();

    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.fname.sendKeys("Eman");
        register.lname.sendKeys("Abdelhady");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select s1= new Select(register.Day);
        s1.selectByValue("1");
        Select s2=new Select(register.Month);
        s2.selectByValue("3");
        Select s3=new Select(register.year);
        s3.selectByValue("1998");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.mail.sendKeys("amitstudnt@test.com");
    }

    @And("user fills Password fields {string}")
    public void userFillsPasswordFields(String arg0) {
        register.password.sendKeys("hellothere");
    }
    @And("user confirm password")
    public void userConfirmPassword() {
        register.Confirmpassword.sendKeys("hellothere");

    }
    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.regbutton.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(register.msg.getText(),"Your registration completed");
        soft.assertEquals(register.msg.getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();
    }


}
