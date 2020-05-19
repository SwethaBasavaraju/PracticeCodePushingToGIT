import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop= new Properties();
FileInputStream fis = new FileInputStream("C:\\Swetha\\work\\PracticeCodeInGIT\\PracticeSeleniumConcepts\\src\\data.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	
	FileOutputStream fos = new FileOutputStream("C:\\Swetha\\work\\PracticeCodeInGIT\\PracticeSeleniumConcepts\\src\\data.properties");
	prop.setProperty("browser", "firefox");

	
	prop.store(fos, null);
	}

}

