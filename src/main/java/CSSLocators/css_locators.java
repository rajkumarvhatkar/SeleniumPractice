package CSSLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpanda.com/2019/01/15/web-element-locators-for-test-automation/");
        driver.manage().window().maximize();

        // css locators  tag#id  or #id
       // driver.findElement(By.cssSelector("input#small-searchterms"));

        // tag.classname or .classname
       // driver.findElement(By.cssSelector("input.search-field")).sendKeys("Books");
       // driver.findElement(By.cssSelector(".search-field")).sendKeys("books");

        // tag[attribute] or [attritube]

       // driver.findElement(By.cssSelector("input[placeholder='Search …']")).sendKeys("Bookss");
      //  driver.findElement(By.cssSelector("[placeholder='Search …']")).sendKeys("Bookss");

        // tag.classname[attritube] or .classname[atrribute]
     //   driver.findElement(By.cssSelector("input.search-field[type='search']")).sendKeys("images");
        driver.findElement(By.cssSelector(".search-field[type='search']")).sendKeys("actors");



    }
}
