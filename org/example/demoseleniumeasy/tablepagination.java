package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tablepagination extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-pagination-demo.html");
        driver.findElement(By.xpath("//a[@class='next_link']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='prev_link']")).click();

        Thread.sleep(3000);
    }

}
