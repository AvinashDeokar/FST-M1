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

public class Activity_3
{
    public static void main(String[] args)
    {
        WebDriver driver    = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pgtitle = driver.getTitle();
        System.out.println("Page title is " + pgtitle);

        WebElement fname = driver.findElement(By.id("firstName"));
        WebElement lname = driver.findElement(By.id("lastName"));
        fname.sendKeys ("Avinash");
        lname.sendKeys("Deokar");

        driver.findElement(By.id("email")).sendKeys("deokaravi@gamail.com");
        driver.findElement(By.id("number")).sendKeys("9850238090");

        driver.findElement(By.cssSelector("ui green button")).click();

        driver.close();


    }
}
