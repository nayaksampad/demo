package org.example.sampad;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.selenium.baseclass1;
import org.example.selenium.baseclass2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ddf1 extends baseclass2 {
    @Test(dataProvider = "Login")
    public void test(String email, String password) throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        String expectedTitle= "nopCommerce demo store";
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement((By.xpath("(//button[@type='submit'])[2]"))).click();

        Thread.sleep(5000);

        Reporter.log("email:"+email);
        Reporter.log("password:"+password);

        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }
    @DataProvider(name="Login")
    public Object[][] data() throws IOException {
        Object LoginData[][]=new Object[3][2];

        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "login.xlsx";
        System.out.println(path);
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheetAt(0);

      //  String value = String.valueOf(sh.getRow(0).getCell(0).getRichStringCellValue());
     //   System.out.println(value);

        int lastRow = sh.getLastRowNum();
      //  System.out.println(lastRow);

        for(int i=0;i<=lastRow;i++) {
            String email = sh.getRow(i).getCell(0).getStringCellValue();
            String password = sh.getRow(i).getCell(1).getStringCellValue();

            LoginData[i][0] = email;
            LoginData[i][1] = password;
        }

        return LoginData;
    }
}
