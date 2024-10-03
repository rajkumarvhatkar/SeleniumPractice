package TestNG_grouping;

import org.testng.annotations.Test;

public class payment_test {

    @Test(priority = 1, groups = {"sanity", "regression","functional"})
    void paymwntInRuppes() {
        System.out.println("payment in rupees");
    }

    @Test(priority = 2, groups = {"sanity", "regression","functional"})
    void paymwntInDollers() {
        System.out.println("payment in dollers");
    }
}
