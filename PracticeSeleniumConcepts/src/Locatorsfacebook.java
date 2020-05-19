import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
		//create driver object
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("swethab_shashidhar@yahoo.co.in");
		

		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.linkText("Forgotten account?")).click();

	}

}
