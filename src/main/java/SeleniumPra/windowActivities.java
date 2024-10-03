package SeleniumPra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
