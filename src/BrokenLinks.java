import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String demourl=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		String demourl=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(demourl).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int codes=conn.getResponseCode();
		System.out.println(codes);
		

	}

}
