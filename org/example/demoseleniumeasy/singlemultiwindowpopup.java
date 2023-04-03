package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class singlemultiwindowpopup extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
        driver.findElement(By.xpath("(//a[@class='btn btn-primary followeasy'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='btn btn-primary followeasy'])[2]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary ']")).click();
    }
}
