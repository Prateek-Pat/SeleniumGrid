package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserGridtest {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WINDOWS);
				
		ChromeOptions options = new ChromeOptions();
		options.merge(dc);
		
		WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"),options);
		driver.get("https://google.com");
		
	}

}
