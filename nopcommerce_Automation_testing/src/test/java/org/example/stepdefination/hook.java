package org.example.stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hook {
    public static WebDriver driver;
    @Before
    public void openbrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public void quit() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
