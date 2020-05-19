
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTestCase {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = null;
		return driver;

		// TODO Auto-generated method stub File appDir = new File("src"); File app = new
		// File(appDir, "ApiDemos-debug.apk"); DesiredCapabilities capabilities = new
		// DesiredCapabilities();
		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
		// "Rahulemulator"); capabilities.setCapability(MobileCapabilityType.APP,
		// app.getAbsolutePath()); driver = new AndroidDriver<>(new
		// URL("http://127.0.0.1:4723/wd/hub"), capabilities); return driver; }

	}
}
