package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Drag_and_drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");

        WebElement frmsrc = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frmsrc);

        WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement desti = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));

        Actions ac = new Actions(driver);

        ac.dragAndDrop(source, desti ).perform();
        driver.switchTo().defaultContent();

        Thread.sleep(5000);
        driver.switchTo().frame(frmsrc);

        WebElement source2 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        WebElement desti2 = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));

        ac.dragAndDrop(source2, desti2).perform();
    }
}
