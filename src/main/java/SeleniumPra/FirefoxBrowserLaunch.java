package SeleniumPra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {
    public static void main(String[] args) {

      //  System.setProperty("webdriver.geco.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.manage().window().getSize();

       // driver.close();
       // driver.quit();
    }
}
