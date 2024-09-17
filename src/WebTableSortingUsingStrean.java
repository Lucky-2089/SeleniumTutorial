import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingUsingStrean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Click on the Column header
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Click on the Column header
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Get all the webelements into the list
		List<WebElement> L1= driver.findElements(By.xpath("//tr/td[1]")); 
		//Capture all the webelement into new List
		List<String> orignalist =L1.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedList=orignalist.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(orignalist, sortedList);

		List<String> productRow =L1.stream().filter(s->s.getText().contains("Almond")).
				map(s->getProductprice(s)).collect(Collectors.toList());
		productRow.forEach(a->System.out.println(a));
		
	}

	private static String getProductprice(WebElement s) {
		// TODO Auto-generated method stub
		String productPrice=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return productPrice;


	}

}
