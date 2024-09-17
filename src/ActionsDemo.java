import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?ref_=icp_country_from_us");
		driver.manage().window().maximize();
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("form[id='nav-search-bar-form']")))
		.click().keyDown(Keys.SHIFT).sendKeys("laxman").build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}

}
