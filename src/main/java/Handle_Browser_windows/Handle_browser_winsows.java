package Handle_Browser_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Handle_browser_winsows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> Windows_ids =  driver.getWindowHandles();
        System.out.println(Windows_ids);

        List<String>  window_list = new ArrayList(Windows_ids);
        String parent_id = window_list.get(0);
        String child_id = window_list.get(1);

        System.out.println("parentid "+ parent_id);
        System.out.println("childid "+ child_id);

        // switch window from parent to child
        driver.switchTo().window(child_id);

        driver.close();
    }
}
