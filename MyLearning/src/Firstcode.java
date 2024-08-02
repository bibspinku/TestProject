import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		WebDriver driver= null;
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "//Users//bibrout0//Desktop//chromedriver//chromedriver"); 
		 * WebDriver driver=new ChromeDriver(); 
		 * driver.get("https://facebook.com");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); driver.close();
		 */
		
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		int[] arr2= {56,8,9,0,6,7,8};
		for(int i=0;i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}

}
