package SeleniumPra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeBrowserLaunch {
    public static void main(String[] args) {

       // System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        driver.manage().window().maximize();


    }
}
