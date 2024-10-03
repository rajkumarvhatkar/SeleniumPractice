package Handeling_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
//       // driver.switchTo().alert().accept();
//
//        Alert myalerts = driver.switchTo().alert();
//        myalerts.accept();


        // confirmation alerts ok & cancel

      //  driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']")).click();
       // driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();

        // prompt  alert - inputbox

        driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();

       Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Welocme to testing");
        promptAlert.accept();
      //  System.out.println(driver.findElement(By.xpath("//p[@id = 'result']")).getText());
        String res = driver.findElement(By.xpath("//p[@id = 'result']")).getText();
        if (res.contains("Welocme to testing")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }


    }
}
