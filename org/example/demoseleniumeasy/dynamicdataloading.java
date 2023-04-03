package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dynamicdataloading extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
        driver.findElement(By.id("save")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("save")).click();
        Thread.sleep(3000);
    }
}
