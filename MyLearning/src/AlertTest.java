import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bibrout0/Desktop/chromedriver-mac-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/Users/bibrout0/Desktop/chromedriver_mac64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("bibhu");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		


		
		

	}

}
