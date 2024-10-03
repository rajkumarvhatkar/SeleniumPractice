package file_upload;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class file_upload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\hp\\Downloads\\Drag&Drop+Assignment.docx");
        if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Drag&Drop+Assignment.docx"))
        {
            System.out.println("file uploaded successfully");
        }else{
            System.out.println("file not uploaded");
        }

    }
}
