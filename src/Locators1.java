import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Locators1 {

    public static void main(String[] args) throws Throwable {
        // TODO Auto-generated method stub
        String name = "Laxman";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //WebDriver driver= new ChromeDriver();
        Thread.sleep(5000);
        String pass = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(pass);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(1000);
        String password = (driver.findElement(By.cssSelector(".infoMsg")).getText());
        //Please use temporary password 
        //'rahulshettyacademy' to Login.
        String[] passwordArray = password.split("'");
        String expPassword = passwordArray[1].split("'")[0];
        return expPassword;
    }

}