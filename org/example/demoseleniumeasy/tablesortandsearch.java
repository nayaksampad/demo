package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tablesortandsearch extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
        WebElement Nos=driver.findElement(By.name("example_length"));
        Select sel=new Select(Nos);
        sel.selectByVisibleText("50");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("London");
        Thread.sleep(3000);
    }
}
