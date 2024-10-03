package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assignment_hidden_dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // select dropdown
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();

      // signle dropdon select
       driver.findElement(By.xpath("//span[text() ='Part-Time Contract'] ")).click();

   // size of dropdown

    }
}
