import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.manage().window().maximize();
	    
	    //driver.findElement(By.id("inputUsername")).sendKeys("laxman1");
	    //driver.findElement(By.name("inputPassword")).sendKeys("Password");
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("laxman");
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password");
	    driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.cssSelector(".error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Laxman");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("laxman2089@gmail.com");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("laxman2089@gmail.com");
	    driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8055964051");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Laxman");

	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

	    driver.findElement(By.id("chkboxOne")).click();

	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    Thread.sleep(1000);
	    

	}

}
