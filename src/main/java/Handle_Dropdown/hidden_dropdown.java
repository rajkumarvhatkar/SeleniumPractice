package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class hidden_dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // clicked on hidden dropdown

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        // select single deopdown

      //  driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();

        // count dropdown options

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//"));
        System.out.println("size of dropdown:"+ options.size());

        for (WebElement op:options){
            System.out.println(op.getText());
        }
    }
}
