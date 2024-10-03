package SeleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LOcators {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        String act_title = driver.getTitle();
        if (act_title.equals("Your Store")){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
       // driver.findElement(By.linkText("Contact Us")).click();

      //  driver.findElement(By.partialLinkText("Cont")).click();

       // System.out.println( driver.findElements(By.className("list-inline-item")).size());

//        List<WebElement> headersLink = driver.findElements(By.className("list-inline-item"));
//        System.out.println(headersLink.size());

//       List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//        System.out.println(allLinks.size());
//
//        System.out.println(driver.findElements(By.tagName("img")).size());
    }
}
