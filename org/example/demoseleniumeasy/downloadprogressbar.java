package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class downloadprogressbar extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
        driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(3000);
    }
}
