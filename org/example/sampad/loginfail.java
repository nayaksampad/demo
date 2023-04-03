package org.example.sampad;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.example.selenium.baseclass1;

public class loginfail extends baseclass1{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("hsjsavjv");
        driver.findElement(By.name("password")).sendKeys("jksachkgcj");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(3000);
    }
}


