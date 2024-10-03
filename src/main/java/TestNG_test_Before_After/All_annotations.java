package TestNG_test_Before_After;

import org.testng.annotations.*;

public class All_annotations {

    @BeforeSuite()

    void BS(){
        System.out.println("this is before suit..");
    }

    @AfterSuite()

    void AS(){
        System.out.println("this is After suit..");
    }

    @BeforeTest()

    void BT(){
        System.out.println("this is before Test..");
    }

    @AfterTest()

    void AT(){
        System.out.println("this is After Test..");
    }

    @BeforeClass()

    void BC(){
        System.out.println("this is before class..");
    }

    @AfterClass()

    void AC(){
        System.out.println("this is After class..");
    }

    @Test
    void TM1(){
        System.out.println("This is test 1");
    }
    @Test
    void TM2(){
        System.out.println("this is test 2");
    }

}
