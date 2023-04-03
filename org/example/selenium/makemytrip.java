package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class makemytrip extends baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("pff")).click();
        driver.findElement(By.id("a_FromSector_show")).sendKeys("DEL");
        driver.findElement(By.id("ptt")).click();
        driver.findElement(By.id("a_Editbox13_show")).sendKeys("BLR");
        driver.findElement(By.id("ddate")).click();


        Thread.sleep(3000);






    }

}
