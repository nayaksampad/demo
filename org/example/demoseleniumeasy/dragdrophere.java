package org.example.demoseleniumeasy;

import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragdrophere extends baseclass2 {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/drag-and-drop-demo.html");
        WebElement source=driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
        WebElement desti=driver.findElement(By.id("mydropzone"));
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        act.dragAndDrop(source,desti).build().perform();
        Thread.sleep(3000);

    }
}
