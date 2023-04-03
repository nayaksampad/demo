package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class jquerydropdown extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
        Thread.sleep(2000);
        WebElement state=driver.findElement(By.xpath("//input[@class='select2-search__field']"));

        Select sel=new Select(state);
        sel.selectByVisibleText("Alabama");
        Thread.sleep(5000);
    }
           //NOT WORKING PROPERLY
}
