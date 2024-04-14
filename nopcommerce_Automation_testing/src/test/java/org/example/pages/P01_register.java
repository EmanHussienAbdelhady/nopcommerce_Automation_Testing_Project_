package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepdefination.hook.driver;

public class P01_register {
public P01_register(){
    PageFactory.initElements(driver,this);
}
@FindBy(id="gender-female")
public  WebElement Genderf;
@FindBy(id="gender-male")
public WebElement Genderm;
    @FindBy(id ="FirstName")
    public WebElement fname;
    @FindBy(id ="LastName")
    public WebElement lname;
    @FindBy(name = "DateOfBirthDay")
    public WebElement Day;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement Month;
    @FindBy(name = "DateOfBirthYear")
    public WebElement year;
    @FindBy(id ="Email")
    public WebElement mail;
    @FindBy(id = "Newsletter")
    public WebElement Newsl;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement Confirmpassword;
    @FindBy(id="register-button")
    public WebElement regbutton;
    @FindBy(className = "result")
    public WebElement msg;
    @FindBy(id ="Email-error" )
    public  WebElement emailerror;
}
