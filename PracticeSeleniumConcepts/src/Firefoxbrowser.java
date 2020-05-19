import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Swetha\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//create driver object
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.get("https://yahoo.com");
		driver.navigate().back();

	}

}
