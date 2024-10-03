package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class assignment_select_dropdeown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(" https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();

        WebElement country_op =  driver.findElement(By.xpath("//select[@id = 'country-list']"));
        Select options = new Select(country_op);


        List<WebElement> potion_list = options.getOptions();
        System.out.println("size of list:"+potion_list.size());

        for (WebElement op:potion_list){
            System.out.println(op.getText());
        }

        options.selectByVisibleText("France");


    }
}
