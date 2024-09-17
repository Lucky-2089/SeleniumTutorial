import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentSumTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		List<WebElement> values=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum = 0;
		for(int i=0;i<values.size();i++)
		{
		 sum  =sum+(Integer.parseInt(values.get(i).getText()));
		
		}
		System.out.println("Total Sum of the Value:"+sum);
		
	
	}

}
