package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ajaxform extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        driver.findElement(By.name("title")).sendKeys("AJAX");
        driver.findElement(By.name("btn-submit")).click();
        Thread.sleep(3000);
    }
}
