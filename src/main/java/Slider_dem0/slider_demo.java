package Slider_dem0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class slider_demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();

        // min slider vlaue
        Actions ac = new Actions(driver);
        WebElement slider_default = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println("default location of slider:"+slider_default.getLocation());

        ac.dragAndDropBy(slider_default, 100, 249).perform();
        System.out.println("after sliding location is:"+slider_default.getLocation());

        // max slider value
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("max slider value is:"+max_slider.getLocation());
        ac.dragAndDropBy(max_slider, -100, 249).perform();
        System.out.println("maz value after slider: "+max_slider.getLocation());
    }
}
