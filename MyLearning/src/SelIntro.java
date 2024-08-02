import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bibrout0/Desktop/chromedriver-mac-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/Users/bibrout0/Desktop/chromedriver_mac64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
