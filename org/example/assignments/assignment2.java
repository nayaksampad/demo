package org.example.assignments;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class assignment2 extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("club mahindra", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[text()='Review'])[2]")).click();

    }
}
