package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    HomePage hom =new HomePage();
    @Given("user clicks on first slider")
    public void userclicksonfirstslider(){
        hom.sliders().get(0).click();

    }

    @Then("relative product for first slider is displayed")
    public void relativeProductForFirstSliderIsDisplayed() {
        SoftAssert sft = new SoftAssert();
        //as required  in project requirements that test scenario should be failed
        String actuallink="https://demo.nopcommerce.com/";
        String expectedlink="";
        sft.assertEquals(actuallink,"https://demo.nopcommerce.com/nokia-lumia-1020" ,"not the requiredlink" );
        sft.assertAll();

    }

    @When("user clicks on second slider")
    public void userClicksOnSecondSlider() {
        hom.sliders().get(1).click();
    }

    @Then("relative product for second slider is displayed")
    public void relativeProductForSecondSliderIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        String actualink="https://demo.nopcommerce.com/";
        String expectelink="https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(actualink,"https://demo.nopcommerce.com/iphone-6","not the requiredlink"  );
        soft.assertAll();
    }
}
