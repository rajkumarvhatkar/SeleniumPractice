package TestNG_test_Before_After;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
    @Test
    void abc(){
        System.out.println("printing abc");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("before test execute");
    }
}
