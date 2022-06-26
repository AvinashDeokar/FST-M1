package activities;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_102 {

        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            Actions actions = new Actions(driver);
            String pressedKeyText;

            //Open browser
            driver.get("https://www.training-support.net/selenium/input-events");
            WebElement pressedKey = driver.findElement(By.id("keyPressed"));

            //Create action sequence for initials
            Action actionSequence1 = actions.sendKeys("S").build();
            actionSequence1.perform();
            pressedKeyText = pressedKey.getText();
            System.out.println("Pressed key is:-- " + pressedKeyText);


            //Create action sequence for Spacebar
            Action actionSequence2 = actions
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .build();
            actionSequence2.perform();
            pressedKeyText = pressedKey.getText();
            System.out.println("Pressed key is:-- " + pressedKeyText);

            //Close browser
            driver.close();
        }
}
