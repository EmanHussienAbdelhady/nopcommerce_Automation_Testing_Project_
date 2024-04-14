package org.example.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    HomePage Home = new HomePage();
@When("user clicks on wish button for element {int}")
    public void userclicksonwishbuttonforelement(int arg2){
    Home.wishBtn.get(arg2).click();

}

    @Then("success notification displayed")
    public void successNotificationDisplayed() {
        SoftAssert soft=new SoftAssert();

        //verify success message content
        boolean actualMsg=Home.notificationMsg.getText().contains("The product has been added");
        soft.assertTrue(actualMsg);

        //verify success message background color
        String actualColor= Color.fromString(Home.notificationContainer.getCssValue("background-color")).asHex();
        soft.assertEquals(actualColor,"#4bb07a");
        soft.assertAll();
    }

    @And("user close success notification bar")
    public void userCloseSuccessNotificationBar() {
        Home.closeNotificationBar.click();
    }

    @And("user go to wishlist page")
    public void userGoToWishlistPage() {
        Home.wishlistTab.click();
    }

    @Then("item added to the wishlist")
    public void itemAddedToTheWishlist() {
        String Qty = Home.wishQty.getText();
        Assert.assertNotEquals(Qty,"(0)");
    }
}
