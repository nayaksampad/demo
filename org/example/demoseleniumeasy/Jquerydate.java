package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Jquerydate extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-date-picker-demo.html");
        Thread.sleep(3000);
        driver.findElement(By.name("from")).click();
        WebElement date=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(date);
        sel.selectByVisibleText("Dec");
        driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[17]")).click();
        driver.findElement(By.name("to")).click();
        WebElement date1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel2=new Select(date1);
        sel2.selectByVisibleText("Dec");
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[17]")).click();

        Thread.sleep(3000);
    }
}
