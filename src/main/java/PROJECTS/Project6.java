package PROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project6 {




        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.xpath("//span[text()='128 GB']")).click();
            // driver.findElement(By.xpath("//span[text()='256 GB']")).click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.findElement(By.id("a-autoid-2-announce")).click();
        }
    }


