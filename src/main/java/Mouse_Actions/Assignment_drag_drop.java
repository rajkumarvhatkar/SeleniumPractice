package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment_drag_drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement sou1 = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement dest2 = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));

        Thread.sleep(5000);
        Actions ac = new Actions(driver);
        ac.dragAndDrop(sou1, dest2).perform();

        Thread.sleep(5000);
        WebElement sou2 = driver.findElement(By.xpath("//section[@class='g-wrapper']//li[2]//a[1]"));
        WebElement desti2 = driver.findElement(By.xpath("//section[@class='g-wrapper']//li[2]//a[1]"));

        ac.dragAndDrop(sou2, dest2).perform();
    }
}

//a[normalize-space()='BANK']
//ol[@class='field14 ui-droppable ui-sortable']
//section[@class='g-wrapper']//li[2]//a[1]
//section[@class='g-wrapper']//li[2]//a[1]