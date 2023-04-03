package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class jqueryduallistbox extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html");
        driver.findElement(By.xpath("//option[@data-id='1']")).click();
        driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[@data-id='2']")).click();
        driver.findElement(By.xpath("//button[@class='pRemove btn btn-primary btn-sm']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='pRemoveAll btn btn-primary btn-sm']")).click();
        Thread.sleep(3000);
    }

}
