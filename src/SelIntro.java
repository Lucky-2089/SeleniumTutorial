import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) {
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\laxma\\Documents\\Browser Drivers\\ChromeSetup.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    //FireFox Browser
	    //System.setProperty("webdriver.gecko.driver","C:\\Users\\laxma\\Documents\\Browser Drivers\\FireFox Installer.exe");
	    //WebDriver driver= new FirefoxDriver();
	    
	    //Edge Browser
	    //System.setProperty("webdriver.gecko.driver","C:\\Users\\laxma\\Documents\\Browser Drivers\\msedgedriver.exe");
	    //WebDriver driver= new EdgeDriver();
	    driver.get("https://bsisandbox.livegage.ai/login");

	    System.out.println(driver.getTitle());

	    System.out.println(driver.getCurrentUrl());

	    driver.close();

	    //driver.quit();



	}

}
