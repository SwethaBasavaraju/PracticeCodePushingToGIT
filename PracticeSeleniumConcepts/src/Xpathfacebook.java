import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
		//create driver object
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swetha");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}