package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class radiobuttondemo extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.findElement(By.name("optradio")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
         driver.findElement(By.name("gender")).click();
         driver.findElement(By.xpath("//input[@value='15 - 50']")).click();
         driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(3000);
    }
}
