package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class alerts extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      //  driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
      //  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
          Thread.sleep(3000);
        Alert alt=driver.switchTo().alert();
        alt.sendKeys("yes");
        alt.accept();
      //  alt.accept();
       // alt.dismiss();


    }
}
