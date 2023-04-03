package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bootstrapmodals extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-modal-demo.html");
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[3]")).click();
        Alert alt=driver.switchTo().alert();
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[4]")).click();
       // driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[5]")).click();
        Thread.sleep(3000);
    }
}
//NOT WORKING PROPERLY