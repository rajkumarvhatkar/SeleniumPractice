package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

    WebDriver driver;
    // constructor

    login_page(WebDriver driver){
        this.driver = driver;

    }

    // locators
      By txt_username_loc = By.xpath("//input[@placeholder='Username']");
      By txt_password_loc = By.xpath("//input[@placeholder='Password']");
       By btn_login_loc = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    // action method

    public void setUserName(String user){
        driver.findElement(txt_username_loc).sendKeys(user);
    }
    public void setPassword(String pwd){
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(btn_login_loc).click();
    }


}
