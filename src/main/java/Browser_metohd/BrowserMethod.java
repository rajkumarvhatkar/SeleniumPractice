package Browser_metohd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

    }
}
