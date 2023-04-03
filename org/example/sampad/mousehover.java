package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mousehover extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement pic=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
        WebElement txt=driver.findElement(By.xpath("//a[@href='/users/1']"));

        Actions act= new Actions(driver);
        act.moveToElement(pic).build().perform();
        Thread.sleep(3000);
        txt.click();


    }
}
