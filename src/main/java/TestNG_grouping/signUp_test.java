package TestNG_grouping;

import org.testng.annotations.Test;

public class signUp_test {

    @Test(priority = 1, groups = {"regression"})
    void signUpByEmail() {
        System.out.println("signup is by email");
    }

    @Test(priority = 2, groups = {"regression"})
    void signUpByFacebook() {
        System.out.println("signup is by facebook");
    }

    @Test(priority = 3, groups = {"regression"})
    void signUpByTwitter() {
        System.out.println("signup is by twitter");
    }
}
