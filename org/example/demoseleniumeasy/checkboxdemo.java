package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkboxdemo extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
        driver.findElement(By.id("isAgeSelected")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        driver.findElement(By.id("check1")).click();
        driver.findElement(By.id("check1")).click();
        Thread.sleep(3000);
    }
}
