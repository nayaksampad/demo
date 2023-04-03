package org.example.demoseleniumeasy;
import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bootstrapdwldprogress extends baseclass2{
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
        driver.findElement(By.id("cricle-btn")).click();
        Thread.sleep(3000);
    }

}
