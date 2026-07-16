package utils;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class ScreenshotUtil {
	
	public static String takeScreenshot(Page page,String testName) {
		String timestamp = new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
		//create path of the sscreenshot along with unique name
		String path ="test-output/screenshot/" +testName+"_"+timestamp+".png";
		
		String projectPath = System.getProperty("user.dir");
		String absolutePath = projectPath+"/"+path;
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(false));
		return path;
	}

}
