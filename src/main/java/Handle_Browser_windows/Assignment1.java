package Handle_Browser_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
        driver.findElement(By.xpath("(//a[normalize-space()='More »'])[1]")).click();

       // System.out.println(driver.findElement(By.xpath("wikipedia-search-results")).getSize());
        Set<String> Windows_ids = driver.getWindowHandles();
       // System.out.println(Windows_ids);

        List<String> Window_list = new ArrayList(Windows_ids);
        System.out.println(Window_list);

        // approach one

        String parent_id = Window_list.get(0);
        String child1 = Window_list.get(1);
        String child2 = Window_list.get(2);
        String child3 = Window_list.get(3);
        String child4 = Window_list.get(4);
        String child5 = Window_list.get(5);
        String child6 = Window_list.get(6);

        System.out.println("par_id "+ parent_id);
        System.out.println("child_id1 "+ child1);
        System.out.println("child_id2 "+ child2);
        System.out.println("child_id3 "+ child3 );
        System.out.println("child_id4 "+ child4 );
        System.out.println("child_id5 "+ child5);
        System.out.println("child_id6 "+ child6);



    }
}
