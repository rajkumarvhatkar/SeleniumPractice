package TestNG_annotation;

/* login ----@before method
    search --- @TEst
    logout --- @after method
    login --@ before method
    advance searhc ---@Test
    logout ---@after metohd
 */


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_BeforeMethod {

    @BeforeMethod
    void login(){
        System.out.println("app login..");
    }
    @AfterMethod
    void logout(){
        System.out.println("app logout..");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("Testing...");
    }
    @Test(priority = 2)
    void adv_search(){
        System.out.println("Adv testing...");
    }

}
