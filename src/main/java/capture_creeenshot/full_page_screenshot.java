package capture_creeenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class full_page_screenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        // full page screenshot

//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//        File targatefile = new File("C:\\Users\\hp\\IdeaProjects\\SeleniumPractice\\screenshots\\amazonfullpage.png");
//
//        // copy sourcefile to targate folder
//        sourcefile.renameTo(targatefile);

        // capture screenshot of specific Webelement

        WebElement earphonepage = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none shogun-widget card-lite product-shoveler aui-desktop fresh-shoveler'])[1]"));
        File sourc = earphonepage.getScreenshotAs(OutputType.FILE);
        File targt = new File(System.getProperty("user.dir")+"\\screenshots\\amazon_specific_page.png");

        sourc.renameTo(targt);


    }
}
