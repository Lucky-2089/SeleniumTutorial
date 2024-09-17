import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Click on the Column header
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Click on the Column header
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Get all the webelements into the list
		
		List<String> price;
		
		do {
			List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]")); 
	price =rows.stream().filter(s->s.getText().contains("Rice")).
				map(s->getProductprice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			
		}
		}while(price.size()<1);
		
			

	}
	
	private static String getProductprice(WebElement s) {
		// TODO Auto-generated method stub
		String productPrice=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return productPrice;


	}


}
