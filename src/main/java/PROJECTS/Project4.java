package PROJECTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Project4 {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://tutorialsninja.com/demo/");
            driver.findElement(By.xpath("//a[@title='My Account']")).click();
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
            driver.findElement(By.id("input-email")).sendKeys("prajesh1@gamil.com");
            driver.findElement(By.id("input-password")).sendKeys("prajesh");
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
            driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
            driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
            driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
            driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");
            driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/checkout");
            String product_1 = driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
            String product_2 =  driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();
            if (product_1.contains("MacBook Air")) {  // Use contains for partial string match
                System.out.println("Product 1 contains 'MacBook Air'"); // Adjusted message
            } else {
                System.out.println("Product 1 does not contain 'Macbook Air'");
            }

            if (product_2.contains("MacBook Pro")) {  // Use contains for partial string match
                System.out.println("Product 2 contains 'MacBook Pro'"); // Adjusted message
            } else {
                System.out.println("Product 2 does not contain 'MacBook Pro'");
            }

        }
    }


