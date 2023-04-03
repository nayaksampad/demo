package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readexl {
      public static void main(String[] args) throws IOException {
          String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "excle file.xlsx";
          System.out.println(path);
          FileInputStream file = new FileInputStream(path);
          XSSFWorkbook wb = new XSSFWorkbook(file);
          XSSFSheet sh = wb.getSheetAt(0);

          String value = String.valueOf(sh.getRow(0).getCell(0).getRichStringCellValue());
          System.out.println(value);

          int lastRow = sh.getLastRowNum();
          System.out.println(lastRow);

          for(int i=0;i<=lastRow;i++){
              String name = sh.getRow(i).getCell(0).getStringCellValue();
      System.out.println(name);
String job= sh.getRow(i).getCell(1).getStringCellValue();
System.out.println(job);
}
}
}