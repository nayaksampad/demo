package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;

public class facebook extends baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9302460%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA3pugBhAwEiwAWFzwdSKNjFx1BFwh9IBYDQZRYF0S7-oZ54ya0TJPtlQSlFH6KM99SUMZHRoCbDQQAvD_BwE");
        driver.findElement(By.name("firstname")).sendKeys("abcdef");
        driver.findElement(By.name("lastname")).sendKeys("wxyz");
        driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("gd2KxiiT8=4h+V#");
        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
        WebElement day = driver.findElement(By.name("birthday_day"));
        WebElement month= driver.findElement(By.name("birthday_month"));
        WebElement year = driver.findElement(By.name("birthday_year"));
        Thread.sleep(5000);
        Select sel = new Select(day);
        sel.selectByVisibleText("17");

        Select sel2=new Select(month);
        sel2.selectByIndex(10);

        Select sel3 = new Select(year);
        sel3.selectByVisibleText("1996");

        Thread.sleep(5000);




    }


}
