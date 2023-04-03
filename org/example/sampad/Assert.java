package org.example.sampad;

import org.example.selenium.baseclass1;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert extends baseclass1 {
    @Test
    public void test(){
        String expectedTitle="Page home title";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(expectedTitle, "page login title");
        System.out.println("END");
        sa.assertAll();

    }

}
