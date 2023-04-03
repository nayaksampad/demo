package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dynamicloading extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2 ");
       // driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']")));

    }
}
