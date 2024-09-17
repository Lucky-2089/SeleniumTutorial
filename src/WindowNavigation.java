import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com");
		   driver.navigate().forward();
		   driver.navigate().back();
		   driver.navigate().refresh();
		   driver.navigate().to("https://www.google.com");
		   System.out.println("Everythings works properly");
	}

}
