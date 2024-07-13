package PROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project5 {



        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/");
            driver.manage().window().maximize();
            driver.findElement(By.id("search2")).sendKeys("html");
            driver.findElement(By.id("learntocode_searchbtn")).click();


        }
    }


