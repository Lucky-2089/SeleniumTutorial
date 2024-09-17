import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class CalenderSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//.ui-state-default.ui-state-highlight.ui-state-hover
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//a[@value='MAA']")).getText());
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(5000);
		   int i=1;
		   while(i<5)
		   {
		   driver.findElement(By.id("hrefIncAdt")).click();
		   driver.findElement(By.id("hrefIncChd")).click();
		   driver.findElement(By.id("hrefIncInf")).click();
		   i++;
		  }
		   
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
