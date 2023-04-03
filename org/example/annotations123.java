package org.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations123 {
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }
@BeforeClass
    public void beforeclass()
{
    System.out.println("BeforeClass");
}
}