package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class windowhandle extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

        Thread.sleep(3000);

    }
}
