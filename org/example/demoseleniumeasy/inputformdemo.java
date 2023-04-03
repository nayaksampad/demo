package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class inputformdemo extends baseclass2 {

    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("last_name")).sendKeys("xyz");
        driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("9876543672");
        driver.findElement(By.name("address")).sendKeys("datagalli");
        driver.findElement(By.name("city")).sendKeys("mysore");
        WebElement state=driver.findElement(By.name("state"));
        Select sel=new Select(state);
        sel.selectByVisibleText("Alabama");
        driver.findElement(By.name("zip")).sendKeys("35004");
        driver.findElement(By.name("website")).sendKeys("www.google.com");
        driver.findElement(By.xpath("//input[@value='no']")).click();
        driver.findElement(By.name("comment")).sendKeys("i love selenium");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Thread.sleep(10000);
    }
}
