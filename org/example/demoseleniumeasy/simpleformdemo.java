package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class simpleformdemo extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        driver.findElement(By.id("user-message")).sendKeys("abcde");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("5");
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(3000);
    }
}
