package Slider_dem0;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboard_Actions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        Actions ac = new Actions(driver);
        driver.findElement(By.cssSelector("#inputText1")).sendKeys("Welcome to keybloard actions");

        // CTRL+ A select text on clipboard
        ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        // CTRL+ C copy text into clipboard

        ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //TAB shift to next clipboard

        ac.keyDown(Keys.TAB).perform();

        // CTRL+v paste text into clipboard

        ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        // CTRL+SHIFT+A  3 button action

        ac.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).perform();



    }
}
