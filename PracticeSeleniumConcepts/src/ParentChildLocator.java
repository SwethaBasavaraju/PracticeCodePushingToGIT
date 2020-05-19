import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
		//create driver object
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		
	//	driver.findElement(By.xpath("//div[@id='ntp-contents']/div[2]/div/div[2]")).sendKeys("swetha");
		
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a[@class='gb_g']")).click();
	
		

	}

}
