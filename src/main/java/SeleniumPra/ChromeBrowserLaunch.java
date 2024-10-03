package SeleniumPra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
    public static void main(String[] args) {

       // ChromeDriver driver = new ChromeDriver();
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());

       // driver.close();
    }
}
