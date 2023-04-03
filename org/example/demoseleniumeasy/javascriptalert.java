package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class javascriptalert extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Alert alt=driver.switchTo().alert();
        alt.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
        Alert alt2=driver.switchTo().alert();
        alt.dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
        Alert alt3=driver.switchTo().alert();
        alt3.sendKeys("sam");
        Thread.sleep(3000);
        alt3.accept();
        Thread.sleep(3000);

    }
}
