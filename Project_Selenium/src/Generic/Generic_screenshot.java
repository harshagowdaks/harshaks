package Generic;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot {
	public WebDriver driver;
	public static void getPhoto(WebDriver driver) throws IOException {
		String photo ="./Photos/";
		Date d = new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(photo+d2+".jpeg");
		FileUtils.copyFile(src, dst);
}
}
