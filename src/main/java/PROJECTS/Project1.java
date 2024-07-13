package PROJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1 {

        public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://gmail.com");
            driver.manage().window().maximize();
            String title = driver.getTitle(); // Corrected spelling: title

            if (title.equals("Gmail")) {  // Corrected spelling and added closing parenthesis
                System.out.println("Title is correct");
            }
            else {
                System.out.println("Title is incorrect"); // More descriptive message
            }
            driver.quit();
        }
    }


