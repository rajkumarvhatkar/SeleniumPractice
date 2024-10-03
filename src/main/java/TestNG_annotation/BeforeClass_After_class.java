package TestNG_annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* login ----@before class
    search --- @TEst
    advance searhc ---@Test
    logout ---@after class
 */
public class BeforeClass_After_class {

    @BeforeClass
    void login(){
        System.out.println("login...");
    }
    @AfterClass
    void logout(){
        System.out.println("logout");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("search...");
    }
    @Test(priority = 2)
    void adv_search(){
        System.out.println("advSearch...");
    }
}
