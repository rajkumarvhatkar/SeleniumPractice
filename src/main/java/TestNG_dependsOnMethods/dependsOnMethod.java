package TestNG_dependsOnMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod {
    @Test(priority = 1)
    void openApp(){
        Assert.assertTrue(true);
    }
    @Test(priority = 2, dependsOnMethods = {"openApp"})
    void login(){
        Assert.assertTrue(true);
    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    void search(){
        Assert.assertTrue(false);
    }
    @Test(priority = 4, dependsOnMethods = {"login"})
    void adv_search(){
        Assert.assertTrue(true);
    }
    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout(){
        Assert.assertTrue(true);
    }
}
