package Handle_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class static_table {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // frind total number of rows

        int row_size = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();

        System.out.println("size of row:"+row_size);

        // find column size

        int column_size = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr//th")).size();
        System.out.println("size of column:"+column_size);

        // read data from specific row and colum

        String row_data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]")).getText();
        for (int i = 1; i <= row_size; i++) {
           // System.out.println(driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]")).getText());
            for (int j = 1; j <= column_size; j++) {
                System.out.println(driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//th["+j+"]")).getText());
            }
        }

       // System.out.println(row_data);
    }
}
