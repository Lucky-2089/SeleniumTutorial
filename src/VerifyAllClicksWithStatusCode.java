import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyAllClicksWithStatusCode {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            // Setup ChromeDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();
            
            // Configure Chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");  // Run in headless mode
            
            // Initialize WebDriver
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            // Navigate to the webpage
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            
            // Initialize SoftAssert
            SoftAssert softAssert = new SoftAssert();
            
            // Find all links
            List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
            
            System.out.println("Total links to check: " + links.size());
            
            // Check each link
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                if (url != null && !url.isEmpty()) {
                    checkLink(url, link.getText(), softAssert);
                } else {
                    System.out.println("URL is empty or null for link text: " + link.getText());
                }
            }
            
            // Assert all checks
            softAssert.assertAll();
            
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
    
    private static void checkLink(String urlString, String linkText, SoftAssert softAssert) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
            
            int responseCode = conn.getResponseCode();
            System.out.println("Checking link: " + urlString + " - Status: " + responseCode);
            
            softAssert.assertTrue(responseCode < 400, 
                "The link with text '" + linkText + "' is broken with code " + responseCode);
            
            conn.disconnect();
        } catch (IOException e) {
            System.err.println("Error checking link " + urlString + ": " + e.getMessage());
            softAssert.fail("Exception occurred while checking link: " + urlString);
        }
    }
}