package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class datalistfilter extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/data-list-filter-demo.html");
        driver.findElement(By.id("input-search")).sendKeys("555-454-5555");
        Thread.sleep(3000);
    }
}
