import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.apache.commons.io.FileUtils;

public class Screenshot {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Below I was not able to install common io jar file
		driver.manage().deleteCookieNamed("test cookies");
		driver.manage().deleteAllCookies();
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("./SeleniumScreenshots/Screen.png"));
	}
	

}
