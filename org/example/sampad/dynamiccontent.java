package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dynamiccontent extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        driver.findElement(By.xpath("//a[@href='/dynamic_content?with_content=static']")).click();

        Thread.sleep(3000);

    }
}
