package TestNG_test_Before_After;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
    @Test
    void xyz(){
        System.out.println("printing xyz");
    }
    @AfterTest
    void AfterTest(){
        System.out.println("After test");
    }
}
