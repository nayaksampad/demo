package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bootstraplistbox extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html");
        driver.findElement(By.name("SearchDualList")).sendKeys("bootstrap-duallist");
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//i[@class='glyphicon glyphicon-unchecked'])[2]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-left']")).click();
        Thread.sleep(3000);


    }
}
