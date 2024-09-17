import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

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
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));//URL in the b
		name.sendKeys(course);
		
		//Use to take the webelement screenshot
		File  ss= name.getScreenshotAs(OutputType.FILE);//
		FileUtils.copyFile(ss,new File("logo.png"));

		
		//Use to take the height and width of the webelement.
		System.out.print(name.getRect().getDimension().getHeight());	
		System.out.print(name.getRect().getDimension().getWidth());

	}

}
