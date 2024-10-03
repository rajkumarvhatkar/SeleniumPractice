package SeleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class sliblingToSibling {

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\hp\\Downloads\\NDGIMIBANHLABGDGJCPBBNDIEHLJCPFH_5_3_2_0.crx"));

        WebDriver driver = new ChromeDriver();

        //siblings to sibling xpath

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

        System.out.println(driver.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[2]")).getText());

        // child to parent xpath

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());



    }
}
