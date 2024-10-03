package TestNG_dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class data_provider_demo {
   WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "dp")
    void  testLogin(String userName, String pwd) throws InterruptedException {
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
       driver.findElement(By.xpath("//button[@class='btn']")).click();
       Thread.sleep(5000);
       boolean status = driver.findElement(By.xpath("//a[normalize-space()='Home']")).isDisplayed();
        if (status == true){
            driver.findElement(By.xpath("(//a[normalize-space()='Log out'])[1]")).click();
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }
    }

    @AfterClass
    void tearDown(){
       driver.close();

    }

    @DataProvider(name = "dp")
    Object loginData(){
        Object data[][] = {
                {"raj31", "test123"},
                {"ganesh23", "test103"},
                {"student", "Password123"},
                {"john11223@gmail.com", "john@123"},
        };
        return data;
    }
}
