package file_upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_file_upload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // stores files in variable
        String file1 = "C:\\Users\\hp\\Downloads\\Drag&Drop+Assignment.docx";
        String file2 = "C:\\Users\\hp\\OneDrive\\Desktop\\Rajkumar resum.doc";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+ "\n" + file2);
        int file_size = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
       //validate file size
        if (file_size == 2){
            System.out.println("successfully uplooded");
        }else {
            System.out.println("file not uploaded");
        }

        // validate files name

        if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Drag&Drop+Assignment.docx")
            && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Rajkumar resum.doc"))
        {
            System.out.println("file names are same");
        }else {
            System.out.println("files name are not same");
        }

    }
}
//"C:\Users\hp\OneDrive\Desktop\Rajkumar resum.doc"