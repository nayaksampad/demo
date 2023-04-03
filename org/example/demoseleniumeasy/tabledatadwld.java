package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tabledatadwld extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("angelica ramos");
        driver.findElement(By.xpath("//a[@class='dt-button buttons-excel buttons-html5']")).click();
        Thread.sleep(3000);
    }
}
