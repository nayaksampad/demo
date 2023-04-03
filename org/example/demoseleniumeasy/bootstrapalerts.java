package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class bootstrapalerts extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        Thread.sleep(3000);
        driver.findElement(By.id("autoclosable-btn-success")).click();
        driver.findElement(By.id("normal-btn-success")).click();
        driver.findElement(By.id("autoclosable-btn-warning")).click();
        driver.findElement(By.id("normal-btn-warning")).click();
        driver.findElement(By.id("autoclosable-btn-danger")).click();
        driver.findElement(By.id("normal-btn-danger")).click();
        driver.findElement(By.id("autoclosable-btn-info")).click();
        driver.findElement(By.id("normal-btn-info")).click();
        Thread.sleep(3000);
    }
}
