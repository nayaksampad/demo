package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option=driver.findElement(By.id("dropdown"));
        Select sel=new Select(option);
        sel.selectByVisibleText("Option 1");
        Thread.sleep(3000);
    }
}
