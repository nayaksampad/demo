package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class loginsuccess extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(3000);
    }
}
