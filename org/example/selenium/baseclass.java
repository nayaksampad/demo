package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class baseclass {
    WebDriver driver;
    @BeforeClass
    public void open()
    {
        System.out.println("open browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void close(){
        System.out.println("close browser");
        driver.quit();
    }
}
