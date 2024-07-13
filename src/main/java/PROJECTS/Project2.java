package PROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {






        public static void main(String[] args) {


            // Create a Selenium Script to automate the account registration page
            // Verify confirmation message on the page match the expected text
            //  Page URL – http://tutorialsninja.com/demo/index.php?route=account/register
            //  Expected Text – “Congratulations! Your new account has been successfully created!”


            //   Approach:.

            // Create a new Selenium script
            // Use sendKeys method to enter text into fields for Your Personal Details section
            //  Use sendKeys method to enter text into fields for Your Password section
            //  Use click method to select Subscribe radio button
            //Use click method to select Privacy Policy check box
            // Use click method to click on Continue button
            // Use getText method to get the actual text on the confirmation page
            //  Use if else statement to compare the expected vs. actual text

            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
            String id_FirstName = "input-firstname";
            String id_LastName = "input-lastname";
            String id_Email = "input-email";
            String id_Telephone = "input-telephone";
            String id_Password = "input-password";
            String id_ConfirmPwd = "input-confirm";
            String xpath_Newsletter = "(//input[@name='newsletter'])[1]";
            String name_Agree = "agree";
            String xpath_Continue = "//input[@value='Continue']";
            String xpath_Text = "//div[@id='content']//p";

            driver.findElement(By.id("input-firstname")).sendKeys("prajesh");
            driver.findElement(By.id("input-lastname")).sendKeys("shah");
            driver.findElement(By.id("input-email")).sendKeys("prajesh1@gamil.com");
            driver.findElement(By.id("input-telephone")).sendKeys("7418529634");
            driver.findElement(By.id("input-password")).sendKeys("prajesh");
            driver.findElement(By.id("input-confirm")).sendKeys("prajesh");

            driver.findElement(By.xpath(xpath_Newsletter)).click();
            driver.findElement(By.name(name_Agree)).click();
            driver.findElement(By.xpath(xpath_Continue)).click();

            String actualText = driver.findElement(By.xpath(xpath_Text)).getText();

            if (actualText.equals("Congratulations! Your new account has been successfully created!")) {
                System.out.println("Expected test matches actual text");
            } else {
                System.out.println("Expected test does not match actual text"); // Corrected message
            }
        }
    }

