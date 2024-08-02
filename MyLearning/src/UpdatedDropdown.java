import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bibrout0/Desktop/chromedriver-mac-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/Users/bibrout0/Desktop/chromedriver_mac64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	driver.findElement(By.id("btnclosepaxoption")).click();
    	driver.close();
	}
	

}
