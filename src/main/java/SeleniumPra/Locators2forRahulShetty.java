package SeleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.io.File;

public class Locators2forRahulShetty {
    public static void main(String[] args) throws InterruptedException {
        String name = "Rajkumar";
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addExtensions(new File("C:\\Users\\hp\\Downloads\\NDGIMIBANHLABGDGJCPBBNDIEHLJCPFH_5_3_2_0.crx"));

        WebDriver driver = new ChromeDriver(options);
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text() = 'Log Out']")).click();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text() = 'Reset Login']")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        String[] passwordArray2 = passwordArray[1].split("'");
        String password = passwordArray2[0];
        return password;


    }
}
