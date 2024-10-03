package conditional_metohd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        // isDisplayed
//        boolean dispalyedMethod = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//        System.out.println(dispalyedMethod);

        //isSelected
        //before selecting
        WebElement gender_m = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
        WebElement gender_f = driver.findElement(By.xpath("//input[@id = 'gender-female']"));

//        System.out.println(gender_m.isSelected());
//        System.out.println(gender_f.isSelected());

        // after selecting
        gender_m.click();
        System.out.println(gender_m.isSelected());
        System.out.println(gender_f.isSelected());

    }
}
