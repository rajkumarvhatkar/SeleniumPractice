package vwoTesting;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwoVerifying {

       // @Description("verify that email and password and error message");
        @Test
        public void testVwoNevigstion() throws InterruptedException {

            ChromeOptions co = new ChromeOptions();
            co.addArguments("--incognito");
            co.addArguments("--start-maximised");

            WebDriver driver = new ChromeDriver(co);
            driver.navigate().to("https://app.vwo.com/#/login");
            System.out.println(driver.getTitle());

            Assert.assertEquals(driver.getTitle(),"Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

            WebElement username = driver.findElement(By.id("login-username"));
            username.sendKeys("Rajkumar@gmail.com");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Password@123");

            WebElement submitButton = driver.findElement(By.id("js-login-btn"));
            submitButton.click();

            // after 3 sec error message comes
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            WebElement errorMessage = driver.findElement(By.xpath("//div[@id='js-notification-box-msg']"));
            Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

            WebElement linkTest = driver.findElement(By.linkText("Start a free trial"));
            linkTest.click();
        }

    }

