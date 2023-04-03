package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownlist extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
        Select sel=new Select(dropdown);
        sel.selectByVisibleText("Thursday");
        WebElement states=driver.findElement(By.id("multi-select"));
        Select sel1=new Select(states);
        sel1.selectByIndex(2);
        sel1.selectByIndex(3);
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();


        Thread.sleep(3000);

    }
}
