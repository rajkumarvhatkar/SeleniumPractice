package TestNG;

/* 1)open orangeHRM
    2)test logo present or not
    3)login
    4)logout
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class amazonTest {

    WebDriver driver;
    @Test(priority = 1)

    void openApp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();

    }
    @Test(priority = 2)
    void testLogo(){
        boolean status = driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']")).isDisplayed();
        System.out.println("logo is dispalyed or not:"+ status);
    }
    @Test(priority = 3)
    void login(){
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation']")).sendKeys("raj31.vk@gmail.com");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
       // driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
    }
    @Test(priority = 4)
    void  closeApp(){
        driver.close();
    }

}
