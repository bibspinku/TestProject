import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bibrout0/Desktop/chromedriver_mac64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.casio.com/us/");
//		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);//
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9337974899");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.id("chkboxTwo")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
	

		
		

	}

}
