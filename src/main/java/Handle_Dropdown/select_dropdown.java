package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class select_dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpdwn_Ele = driver.findElement(By.xpath("//select[@id = 'country']"));
        Select dropdown_country = new Select(drpdwn_Ele);

       List<WebElement> list_of_country = dropdown_country.getOptions();
        System.out.println("size of dropdown: "+ list_of_country.size());

        for (int i = 0; i < list_of_country.size(); i++) {
            System.out.println(list_of_country.get(i).getText());

            // enhanced for loop

            for(WebElement op: list_of_country){
                System.out.println(op.getText());
            }
        }

        // select by visible text

        dropdown_country.selectByVisibleText("Canada");

        // select by value

        dropdown_country.selectByValue("uk");

        // select by index
        dropdown_country.selectByIndex(3);
    }
}
