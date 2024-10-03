package Handle_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class frame_handle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://ui.vision/demo/webtest/frames/");

        // frame 1 handle

       // driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("Hello");  not work this type

       WebElement fm1 =  driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
       driver.switchTo().frame(fm1);
       driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("hello");
        driver.switchTo().defaultContent();

       // frame 2
        WebElement fm2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
        driver.switchTo().frame(fm2);
        driver.findElement(By.xpath("//input[@name = 'mytext2']")).sendKeys("feame2");

        driver.switchTo().defaultContent();
        // frame 3

        WebElement fm3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
        driver.switchTo().frame(fm3);
        driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("Frame 3");

        //driver.switchTo().defaultContent();

        // inner frame or nester frame or iframe frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();

        driver.switchTo().defaultContent();
        // inner frame or nester frame or iframe frame 3

        WebElement fm5 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
        driver.switchTo().frame(fm5);
        Thread.sleep(5000);

       // driver.findElement(By.xpath("(//a[normalize-space()='https://a9t9.com'])[1]")).click();
        driver.findElement(By.xpath("//input[@name = 'mytext5']")).sendKeys("Frame 5");
      //  driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

    }
}
