import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorxpathcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Swetha\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//create driver object
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("#email")).sendKeys("swethab_shashidhar@yahoo.co.in");
		

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		
		driver.findElement(By.linkText("Forgotten account?")).click();

		
		


	}

}
