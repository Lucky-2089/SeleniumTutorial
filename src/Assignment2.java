
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/angularpractice/");	   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Laxman Telang");
		   driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("laxman2089@gmail.com");
		   driver.findElement(By.id("exampleInputPassword1")).sendKeys("Lucky@123");
		   System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		   driver.findElement(By.id("exampleCheck1")).click();
		   System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		   //driver.findElement(By.xpath("(//select[@id='exampleFormControlSelect1'])[1]")).click();
		   WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		   Select abc = new Select(dropdown);
		   abc.selectByVisibleText("Male");
		   driver.findElement(By.id("inlineRadio1")).click();
		   driver.findElement(By.name("bday")).sendKeys("20-08-1989");
		   driver.findElement(By.xpath("//input[@value='Submit']")).click();
		   System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
