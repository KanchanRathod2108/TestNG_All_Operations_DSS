package fail_testcases_Screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class GetScreenshot extends Main_Test {
public static String capture(String screenshotName) throws IOException {
		
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("C:/Users/Aakash/Desktop/ss/k.bmp");
		FileUtils.copyFile(s,d);
		
		return screenshotName;
}

}