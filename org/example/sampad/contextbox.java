package org.example.sampad;
import org.example.selenium.baseclass1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class contextbox extends baseclass1{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();

        Alert alt = driver.switchTo().alert();
        alt.accept();

        Thread.sleep(3000);
    }
}
