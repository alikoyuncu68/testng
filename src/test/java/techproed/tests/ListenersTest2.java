package techproed.tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;


@Listeners(techproed.utilities.Listeners.class)

public class ListenersTest2 {

    @Test
    public void test1() {
        System.out.println("Test case 1 PASS");
        assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Test case 2 FAIL");
        assertTrue(false);
    }

    @Test
    public void test3() {
        System.out.println("Test case 3 SKIPPED");
        throw new SkipException("SKIP THIS TESTCASE");

    }

    @Test
    public void test4() {
        System.out.println("Test case 4 No Such Element Exception");
        Driver.getDriver().get("https://techproeducation.com/");
        Driver.getDriver().findElement(By.id("abc"));


    }
}
