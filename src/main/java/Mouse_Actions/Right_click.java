package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Right_click {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().window().maximize();

        WebElement rt_action = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions ac = new Actions(driver);
//      right click action
        ac.contextClick(rt_action).build().perform();

        // click on copy

        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        driver.switchTo().alert().accept();


    }
}
