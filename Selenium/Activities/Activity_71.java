package activities;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_71 {

        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();

            //Open browser
            driver.get("https://training-support.net/selenium/dynamic-attributes");

            //Find username and password fields
            WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
            WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
            //Type credentials
            userName.sendKeys("admin");
            password.sendKeys("password");
            //Click Log in
            driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

            //Print login message
            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Your Login message: " + loginMessage);

            //Close browser
            driver.close();

        }
}
