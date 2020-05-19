import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
		// create driver object
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());

		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
