package fail_testcases_Screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenshot extends Main_Test {
	@Test

	public void captureScreenshot() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals("Home", title);
		Thread.sleep(1000);
		driver.close();
	}

}
