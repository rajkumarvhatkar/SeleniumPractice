package Slider_dem0;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class open_link_inNew_tab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.nopcommerce.com/login?ReturnUrl=%2Fvendor%2Fapply");
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Actions ac = new Actions(driver);

        // contorl key
        ac.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

        // swiching windows

        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);

        List<String> Wid_id = new ArrayList<>(ids);

        driver.switchTo().window(Wid_id.get(1)); // switch to registratipn page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rajkumar");

        driver.switchTo().window(Wid_id.get(0)); // switch to homw page

        driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("laptop");








    }
}
