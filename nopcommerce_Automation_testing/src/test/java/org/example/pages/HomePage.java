package org.example.pages;

import org.example.stepdefination.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.webauthn.WebAuthn;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.channels.Selector;
import java.time.Instant;
import java.util.List;

import static org.example.stepdefination.hook.driver;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement registertab() {
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement logintab() {
        return driver.findElement(By.className("ico-login"));
    }


    @FindBy(id = "customerCurrency")
    public WebElement currencyDropdown;
    public List<WebElement> productList;
    public List<WebElement> getProductList() {
        List<WebElement> productList = driver.findElements(By.id("221"));
        return productList;}

    //Search Function
    @FindBy(id="small-searchterms")
    public WebElement Searchbox;
@FindBy(id="q")
    public WebElement searchkey;
@FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    public WebElement searchbutton;
@FindBy(className = "item-grid")
    public List<WebElement>productsresults;
@FindBy(className = "item-box")
    public WebElement itemsr;
@FindBy(className = "sku")
    public WebElement sku;

///////////Hover///



        public WebElement hover() {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        }

        public WebElement selectSub() {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/software\"]"));
        }

        public WebElement verifySubCategory() {
            return driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
        }
        ///Sliders//
        public List<WebElement> sliders()
        {
            return hook.driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]"));
        }
        /////////Followus///

    @FindBy(linkText ="Facebook")
    public WebElement facebook;
    @FindBy(linkText ="Twitter")
    public WebElement twitter;
    @FindBy(linkText ="RSS")
    public WebElement rss;
    @FindBy(linkText ="YouTube")
    public WebElement youtube;
/////////wishlist//
@FindBy(className ="add-to-wishlist-button")
public List<WebElement> wishBtn;

    @FindBy(css = "div[class=\"bar-notification-container\"] p[class=\"content\"]")
    public WebElement notificationMsg;
    @FindBy(css = "div[class=\"bar-notification-container\"] div[class=\"bar-notification success\"]")
    public WebElement notificationContainer;
    @FindBy(css = "div[class=\"bar-notification success\"] span[class=\"close\"]")
    public WebElement closeNotificationBar;
    @FindBy(className = "wishlist-label")
    public WebElement wishlistTab;

    @FindBy(css ="a[class=\"ico-wishlist\"] [class=\"wishlist-qty\"]")
    public WebElement wishQty;



}







