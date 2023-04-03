package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dragdropsliders extends baseclass2 {
    @Test
    public void test(){
        driver.get("http://demo.seleniumeasy.com/drag-drop-range-sliders-demo.html");
        driver.findElement(By.xpath("//input[@value='10']"));



       // NOT WORKING PLEASE EXPLAIN HOW TO DO IT
    }
}
