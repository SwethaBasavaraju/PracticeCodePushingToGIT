import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			String text="Swetha";
			System.setProperty("webdriver.chrome.driver", "C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
			//create driver object
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			
			
			
	
		

		}

	}


