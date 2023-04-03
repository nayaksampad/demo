package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class notification extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[@href='/notification_message']")).click();
        Thread.sleep(3000);
    }
}
