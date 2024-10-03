package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class bootstrap_dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id = 'justAnInputBox']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

        List<WebElement> options = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//input"));
        System.out.println("optino size: "+ options.size());



        for ( WebElement op:options){
            System.out.println(op.getText());
        }
    }
}
