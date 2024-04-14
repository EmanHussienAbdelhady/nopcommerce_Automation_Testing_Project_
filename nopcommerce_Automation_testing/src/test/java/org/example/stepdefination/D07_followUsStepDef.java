package org.example.stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.testng.Assert;



import java.util.ArrayList;

import static org.example.stepdefination.hook.driver;

public class D07_followUsStepDef
{
    HomePage hpage=new HomePage();

@When("user opens facebook link")
    public void useropensfacebooklink(){
    hpage.facebook.click();

}
    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        hpage.twitter.click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        hpage.rss.click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        hpage.youtube.click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //hard assertion verify navigate to desired url
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, arg0);

        //close the current tab
        driver.switchTo().window(tabs.get(1)).close();
        //tabs=new ArrayList<>(driver.getWindowHandles()); //no need to reload window handles if one tab closed , you only need it if one new tab will be opened
        driver.switchTo().window(tabs.get(0));

    }


}
