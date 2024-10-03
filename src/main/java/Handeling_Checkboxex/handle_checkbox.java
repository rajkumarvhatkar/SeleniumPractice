package Handeling_Checkboxex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class handle_checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       WebElement checkbox =  driver.findElement(By.xpath("//input[@id = 'sunday']"));
        System.out.println("before select: "+checkbox.isSelected());

       // System.out.println("before selection: "+driver.findElement(By.xpath("//input[@id = 'sunday']")).isSelected());
       // driver.findElement(By.xpath("//input[@id = 'sunday']")).click();
       // System.out.println("After selected: "+ checkbox.isSelected());

        // get count or size of checkboxs

        List<WebElement> checkboxlist = driver.findElements(By.xpath("//input[@type = 'checkbox' and @class = 'form-check-input']"));
        System.out.println(checkboxlist.size());

       // System.out.println("checkobxex: "+ driver.findElements(By.xpath("//input[@type = 'checkbox' and @class = 'form-check-input']")).size());

        // select all cheboxex

        //select checkboxex using nor for loop

//        for (int i = 0; i < checkboxlist.size(); i++) {
//            checkboxlist.get(i).click();
//            System.out.println(i);
//        }

        // enhanced for loop
//        for (WebElement chkbox:checkboxlist) {
//            chkbox.click();
//        }

        // select last 3 cheboxex
//        for (int i = checkboxlist.size()- 3; i < checkboxlist.size(); i++) {
//            checkboxlist.get(i).click();
//        }

       //  select first 3 cheboxex
//        for (int i = 0; i < checkboxlist.size() + 2; i++) {
//            checkboxlist.get(i).click();
//        }
//        Thread.sleep(5000);
//        for (WebElement chkb:checkboxlist){
//            if (chkb.isSelected()) {
//                chkb.click();
//            }else {
//                chkb.click();
//            }
//        }

        // select specific checkbox
//        for (int i = 0; i < checkboxlist.size(); i++) {
//            if (i == 0 || i == 3 || i == 6){
//                checkboxlist.get(i).click();
//            }
  //      }

        // radio button
       WebElement radio_m =  driver.findElement(By.xpath("//input[@id = 'male']"));
       WebElement radio_f =  driver.findElement(By.xpath("//input[@id = 'female']"));

        System.out.println("male :"+ radio_m.isSelected());
        System.out.println("female:"+ radio_f.isSelected());

        radio_m.click();
        System.out.println("after selecting male:"+radio_m.isSelected());
        System.out.println("female:"+ radio_f.isSelected());
        }
    }

