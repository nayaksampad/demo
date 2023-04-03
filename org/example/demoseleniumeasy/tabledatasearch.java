package org.example.demoseleniumeasy;
import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tabledatasearch extends baseclass2{
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
        driver.findElement(By.id("task-table-filter")).sendKeys("SEO tags");
        Thread.sleep(3000);
         driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-filter']")).click();
         driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("3");
        Thread.sleep(3000);
    }
}
