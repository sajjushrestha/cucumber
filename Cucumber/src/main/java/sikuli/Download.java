package sikuli;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Download {
	
	WebDriver driver;
	
@BeforeMethod
public void open() throws Exception
{
	
	Runtime.getRuntime().exec("taskkill /f /im chromeriver.exe");
	//System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe"); //setup the chromedriver using //
	WebDriverManager.chromedriver().version("2.26").setup();
	ChromeOptions opt=new ChromeOptions();
	List<String> list=new ArrayList<String>();
	list.add("disable-infobars");
	list.add("disable-notifications");
	list.add("start-maximized");
	opt.addArguments("start-maximized");
	opt.addArguments("disable-infobars");
	
	
	  driver = new ChromeDriver(opt);
	  
	 // driver.manage().window().maximize();
	// driver.manage().window().setSize(new Dimension(800,480));
	 
	 driver.navigate().to("http://demo.guru99.com/test/image_upload/index.php");
	
}


@Test
public void download() throws Exception
{
	Screen s=new Screen();
	Pattern fileInputTxtBox=new Pattern(".//images//inputbox.png");
	Pattern open=new Pattern(".//images//open.png");
	
	String filename = fileInputTxtBox.getFilename();
	System.out.println(filename);
		
		  driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
		  s.wait(fileInputTxtBox, 10); s.type(fileInputTxtBox,filename);
		  s.click(open);
		 
}


}
