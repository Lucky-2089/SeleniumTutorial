import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BsiSandbox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriver driver= new ChromeDriver();
		    driver.get("https://bsisandbox.livegage.ai/login");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password1");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(15000);
		    System.out.println(driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//a[@id='dropdownMenuButton']")).getText());
		    Thread.sleep(15000);
		    System.out.println(driver.findElement(By.linkText("Signout")).getText());
	}

}
