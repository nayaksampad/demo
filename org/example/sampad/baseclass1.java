package org.example.selenium;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class baseclass1 {
     public WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    public void open(String name)
    {
        if(name.equals("chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
        else if(name.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }}
    @AfterClass
    public void close(){
        System.out.println("close browser");
        driver.quit();
    }
}

