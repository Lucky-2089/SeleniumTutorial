import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the b
		// TODO Auto-generated method stub

		driver.switchTo().newWindow(WindowType.TAB);//Can use window to open new window

		Set <String> handlers=	driver.getWindowHandles();
		Iterator<String> it=handlers.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		String course =driver.findElements(By.cssSelector("a[href*='rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course);
	}

}
