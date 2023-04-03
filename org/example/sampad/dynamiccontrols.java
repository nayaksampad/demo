package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dynamiccontrols extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
      // driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]")));


       //driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        WebDriverWait wait1=new WebDriverWait(driver,10);
        WebElement element2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]")));

        Thread.sleep(3000);
    }
}

