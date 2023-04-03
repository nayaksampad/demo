package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bootstrapdate extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).click();
        driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();

        //NOT ABLE TO SOLVE



    }
}
