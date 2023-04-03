package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tablefilterdem0 extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-records-filter-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-filter']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-filter']")).click();

        Thread.sleep(3000);
    }
}
