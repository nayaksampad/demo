package org.example.demoseleniumeasy;
import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class filedwlddemo extends baseclass2{
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/generate-file-to-download-demo.html");
        driver.findElement(By.id("textbox")).sendKeys("i am learning selenium");
        driver.findElement(By.id("create")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("link-to-download")).click();
        Thread.sleep(3000);
    }

}
