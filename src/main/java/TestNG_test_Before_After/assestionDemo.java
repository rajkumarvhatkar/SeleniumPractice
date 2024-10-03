package TestNG_test_Before_After;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assestionDemo {
    @Test

    void testTitle(){
        String Exp_title = "Opencart";
        String Act_title = "Opencart";
    //This way we cannot get test failed messange

//        if (Exp_title.equals(Act_title)){
//            System.out.println("Test passed");
//        }else {
//            System.out.println("Test failed");
//        }

        //This way we can get test failed messange

        // Assert.assertEquals(Exp_title, Act_title);


        //This way we can get test failed messange

        if (Exp_title.equals(Act_title)){
            System.out.println("Test passed");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test failed");
            Assert.assertTrue(false);
        }
    }


}
