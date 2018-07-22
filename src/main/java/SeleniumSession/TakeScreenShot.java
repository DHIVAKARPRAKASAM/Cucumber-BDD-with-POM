package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 takeScreenshot("Amazon");
		
		 driver.quit();
	}
	
	
	public static  void takeScreenshot(String filename) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\dhiva\\eclipse-workspace\\AmazonBDDwithPOM\\"
				+ "src\\main\\java\\SeleniumSession "+ filename +".png"));

}}
