package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day16_SoftAssert {
    @Test
    public void softAssertTest(){
        SoftAssert softAssert= new SoftAssert();

        System.out.println("Line 11 code");
        softAssert.assertEquals(3,5);
        System.out.println("Line 13 code");
        softAssert.assertEquals("apple","orange");
        System.out.println("Line 15 code");
        softAssert.assertTrue(false);
        System.out.println("Line 17 code");
        softAssert.assertAll();

    }
}
