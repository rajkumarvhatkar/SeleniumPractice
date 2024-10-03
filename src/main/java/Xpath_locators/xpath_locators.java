package Xpath_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class xpath_locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.orangehrm.com/");
        // driver.get("https://automationpanda.com/2019/01/15/web-element-locators-for-test-automation/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
       //xpath with single attribute
        //driver.findElement(By.xpath("//input[@type='search']")).sendKeys("laptop");

        //xpath with multiple attribute
        //driver.findElement(By.xpath("//input[@type='search'][@placeholder='Search …']")).sendKeys("Apples");

       // System.out.println(driver.getWindowHandle());
//       String windowId = driver.getWindowHandle();
//        System.out.println(windowId);
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM']")).click();

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

    }
}
