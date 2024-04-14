package org.example.pages;
import static org.example.stepdefination.hook.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login(){
        PageFactory.initElements(driver,this);
    }
    public WebElement myaccounttab(){return driver.findElement(By.className("ico-account"));
    }

    @FindBy(id="Email")
    public WebElement logmail;
    @FindBy(id="Password")
    public WebElement logpass;
    @FindBy(className = "login-button")
    public WebElement logbutton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]/text()")
    public WebElement Loginerrormessage;
}
