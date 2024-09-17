import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddingItemInCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] veggieItemNames= {"Cucumber","Brocolli","Beans","Mushroom"};

		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));  

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver,veggieItemNames);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());


	}

	public static void addItems(WebDriver driver,String []veggieItemNames) throws InterruptedException 
	{
		int j=0;
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) 
		{
			//Thread.sleep(1000);
			String[] productName=products.get(i).getText().split("-");
			String formattedName=productName[0].trim();
			List<String> veggieItemNamesList = Arrays.asList(veggieItemNames);
			if(veggieItemNamesList.contains(formattedName)) 
			{

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggieItemNames.length) {
					break;
				}
			}

		}

	}

}
