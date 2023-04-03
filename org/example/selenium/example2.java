package org.example.selenium;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class example2 extends baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Faker fake = new Faker();
        String firstname = fake.name().firstName();
        String lastname = fake.name().lastName();
        String email = firstname +"@gmail.com";
        String number = fake.number().digits(10);

        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        driver.findElement(By.id("userNumber")).sendKeys(number);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();

        Thread.sleep(3000);

    }}