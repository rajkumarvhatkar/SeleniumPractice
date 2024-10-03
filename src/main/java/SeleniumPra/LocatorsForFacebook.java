package SeleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsForFacebook {
    public static void main(String[] args) {

      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.name("email")).sendKeys("raj31.vk@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.cssSelector("button#loginbutton")).click();
        //System.out.println(driver.findElement(By.className(".fcb")).getText());
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.xpath("//input[@id = 'identify_email']")).sendKeys("raj31.vk@gmail.com");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.className("uiBoxRed")).getText());
        driver.findElement(By.cssSelector("span.x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft")).click();
    }
}
