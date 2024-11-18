package curaHealthcare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifypageSource {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      //  System.out.println(driver.getPageSource());

        if (driver.getPageSource().contains("CURA Healthcare Servic")){
            System.out.println("verified");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
