package SeleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsForRahulShettyWebsite {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Rajkumar");
        driver.findElement(By.name("inputPassword")).sendKeys("Raj1233");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Raj");
        driver.findElement(By.xpath("//input [@placeholder='Email']")).sendKeys("Raj@gmail.com");
        driver.findElement(By.xpath("//input [@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input [@type='text'][2]")).sendKeys("Rajjj@youmail.com");
        driver.findElement(By.xpath("//input [@type='text'][3]")).sendKeys("0000000000");
        driver.findElement(By.xpath("//input [@type='text'][3]")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9898989898");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Rajkumar");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }

}
