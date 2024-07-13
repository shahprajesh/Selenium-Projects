import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNG {



        @Test
        public void foo() {
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.demoblaze.com/index.html");

            driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();

            WebDriverWait wait = new WebDriverWait(driver, 10); // Set a timeout of 10 seconds


            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipient-email")));
            emailField.sendKeys("pro@123gmail.com");




            WebElement namefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipient-name")));
            namefield.sendKeys("pro");

            WebElement messagefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message-text")));
            messagefield.sendKeys("hey myself pro checking the demo app ");

            WebElement buttonclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")));
            buttonclick.click();


            WebElement samsungselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));
            samsungselect.click();

            WebElement addtocartbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
            addtocartbtn.click();

            driver.findElement(By.id("cartur")).click();

            WebDriverWait wait1 = new WebDriverWait(driver, 10);

            WebElement delete = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")));
            delete.click();

            driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();


            String act_url = driver.getCurrentUrl();
            System.out.println(act_url);

            String desired_url = "https://www.demoblaze.com/cart.html#";

            if (act_url.equals(desired_url)) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

            String act_tittle = driver.getTitle();
            System.out.println(act_tittle);

            String desired_tittle = "STORE";

            if (act_tittle.equals(desired_tittle)) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

            driver.quit();

        }
    }


