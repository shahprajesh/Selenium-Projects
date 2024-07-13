package PROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {


        public static void main(String[] args) throws InterruptedException {
// Problem Statement:
            //Create a Selenium Script to automate the login page.
            //  Verify Logout link is displayed under MyAccount in the home page.
            // Page URL – http://tutorialsninja.com/demo/index.php?route=account/login

            //Approach: .

            //Create a new Selenium script
            // Navigate to the login page
            // Use Selenium locators to enter text into Username & Password fields
            // Use Selenium locators to click on Login button
            //Use Selenium methods to verify whether Logout link is displayed under MyAccount menu
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
            driver.findElement(By.id("input-email")).sendKeys("prajesh1@gamil.com");
            driver.findElement(By.id("input-password")).sendKeys("prajesh");
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            int delaybeforeLogin = 5;
            System.out.println("Waiting for " + delaybeforeLogin + " seconds after login...");
            Thread.sleep(delaybeforeLogin * 1000);

            driver.get("http://tutorialsninja.com/demo/index.php?route=account/logout");



            if (driver.findElement(By.xpath("//a[text()='Logout']")).isEnabled()) {
                System.out.println("Logout link is present on the homepage");
            } else {
                System.out.println("Logout link is not present on the homepage");
            }

        }
    }


