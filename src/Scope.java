
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerTags=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerTags.findElements(By.tagName("a")).size());
		WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

		System.out.println(col.findElements(By.tagName("a")).size());

		for(int i=1;i<col.findElements(By.tagName("a")).size();i++) 
		{
			String clickOnLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			col.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
		}
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("The Title of the Page is:"+ driver.getTitle());
		}
	}

}
