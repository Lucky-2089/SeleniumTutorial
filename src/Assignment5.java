import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String selOption=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		WebElement staticDropdown =driver.findElement(By.id("dropdown-class-example"));

		Select dropdown= new Select (staticDropdown);
		dropdown.selectByVisibleText(selOption);
		driver.findElement(By.name("enter-name")).sendKeys(selOption);
		driver.findElement(By.id("alertbtn")).click();
		String altmsg=driver.switchTo().alert().getText();
		if(altmsg.contains(selOption)) 
		{
			System.out.println("Alert Popup contains the" +selOption);
		}
		else {
			System.out.println("Failed");
			
		}
	}

}
