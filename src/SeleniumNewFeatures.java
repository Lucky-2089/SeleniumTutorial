import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
public class SeleniumNewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the b
		WebElement var=	driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(var)).getText());
		WebElement dob =driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).above(dob)).click();

		WebElement icecheckbox= driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecheckbox)).click();
		WebElement radiobtnlabel= driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobtnlabel)).getText());
	}
}
