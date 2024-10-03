package TestNG_dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class paramTest {

    WebDriver driver;
    @BeforeClass
    void setup(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/events/greatfreedomsale/&ref_=ineA24_pccc_ecomm/?_encoding=UTF8&pd_rd_w=czn43&content-id=amzn1.sym.06b4cec4-7a3e-4e04-96b5-d00002195921&pf_rd_p=06b4cec4-7a3e-4e04-96b5-d00002195921&pf_rd_r=V2PWWFY7WWZKDK6QS66S&pd_rd_wg=mQQ1T&pd_rd_r=90c8ea11-9171-4260-b643-dedf94c61529&ref_=pd_hp_d_atf_unk&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&bubble-id=deals-collection-sports-and-fitness");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    void  testLogo(){
        boolean status = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).isDisplayed();
        Assert.assertEquals(status,true);
    }
    @Test(priority = 2)
    void testURL() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/event/greatfreedomsale/&ref_=ineA24_pccc_ecomm/?_encoding=UTF8&pd_rd_w=czn43&content-id=amzn1.sym.06b4cec4-7a3e-4e04-96b5-d00002195921&pf_rd_p=06b4cec4-7a3e-4e04-96b5-d00002195921&pf_rd_r=V2PWWFY7WWZKDK6QS66S&pd_rd_wg=mQQ1T&pd_rd_r=90c8ea11-9171-4260-b643-dedf94c61529&ref_=pd_hp_d_atf_unk&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&bubble-id=deals-collection-sports-and-fitness");
    }

        @Test(priority = 3, dependsOnMethods = {"testURL"})
    void testTitle(){
        Assert.assertEquals(driver.getTitle(),"Amazon Great Freedom Sale");
    }


    @AfterClass
    void tearDown(){
        driver.close();
    }
}
