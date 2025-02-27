package activities;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_42
{

        public static void main(String[] args)
        {
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            //Open the browser
            driver.get("https://www.training-support.net/selenium/simple-form");

            //Find the page title and print it
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);

            //Find the input fields and enter text
            WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

            firstName.sendKeys("Avinash");
            lastName.sendKeys("Deokar");

            //Enter the email
            driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("deokaravi@gmail.com");

            //Enter the contact number
            driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9850238090");

            //Enter Message
            driver.findElement(By.xpath("//textarea")).sendKeys("This is my message Text");

            //Click Submit
            driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        }
}
