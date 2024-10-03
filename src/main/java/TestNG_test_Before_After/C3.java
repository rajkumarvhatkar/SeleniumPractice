package TestNG_test_Before_After;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
    @Test
    void pqr(){
        System.out.println("this is pqr");
    }
    @BeforeSuite
    void beforeSuit(){
        System.out.println("this is before suit");
    }
    @AfterSuite
    void aftersuit(){
        System.out.println("This is after suite");
    }
}
