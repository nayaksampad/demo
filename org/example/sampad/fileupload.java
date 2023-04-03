package org.example.sampad;

import org.example.selenium.baseclass1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fileupload extends baseclass1 {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user\\IdeaProjects\\demo\\data\\excle file.xlsx");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

    }
}
