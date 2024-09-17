import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentLoginPage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String[] mobiles= {"iphone","Samsung","Nokia","Blackberry"};
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		System.out.println(driver.findElement(By.xpath("//div[@class='form-check-inline']//label[2]//span[2]")).isSelected());
		driver.findElement(By.xpath("//div[@class='form-check-inline']//label[2]//span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ProtoCommerce")));
		addMobiles(driver,mobiles);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ProtoCommerce Home")));

	}


	public static void addMobiles(WebDriver driver,String []mobiles) throws InterruptedException

	{

		int j=0;
		List<WebElement> mobilesPhones =driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0;i<mobilesPhones.size();i++) 
		{
			//Thread.sleep(1000);
			String[] mobileName=mobilesPhones.get(i).getText().split(" ");
			String formattedName=mobileName[0].trim();
			List<String> mobileList = Arrays.asList(mobiles);
			if(mobileList.contains(formattedName)) 
			{

				j++;
				driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
				if(j==mobiles.length) 
				{
					break;
				}

			}

		}

	}
}
