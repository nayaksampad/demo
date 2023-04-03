package org.example.sampad;
import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkbox extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

        Thread.sleep(3000);
    }
}