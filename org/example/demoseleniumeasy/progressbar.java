package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class progressbar extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-progress-bar-dialog-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        Thread.sleep(3000);
    }
}
