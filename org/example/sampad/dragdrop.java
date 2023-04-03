package org.example.sampad;
import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;

public class dragdrop extends baseclass1{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source=driver.findElement(By.id("column-a"));
        WebElement desti=driver.findElement(By.id("column-b"));

        Actions act=new Actions(driver);
        act.dragAndDrop(source,desti).build().perform();





    }
}
