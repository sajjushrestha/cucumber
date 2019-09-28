package testng;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {

	public static void main(String[] args) throws  Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe"); //setup the chromedriver using //
				
				 WebDriver driver = new ChromeDriver();
				  
		      //  driver.get("https://google.com");
				 
				 driver.navigate().to("https://google.com");
		
		        driver.findElement(By.name("q")).sendKeys("selenium");
		Point p= driver.findElement(By.name("q")).getLocation();
		int x=p.getX();
		int y=p.getY();
		
		System.out.println(x +" "+ y);
		        
		
		
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("document.getElementByName('q').style.backgroundColor='red';");
		       // js.executeScript("arguments[0].setAttribute('style', 'background: black; border: 5px solid green;');", driver.findElement(By.name("q")));
		       // js.executeScript("window.scrollByPages(3)");
		     // set zoom level to 90%
		    // js.executeScript("document.body.style.zoom='200%'");
		     
		/*
		 * Robot robot=new Robot(); Rectangle rect=new
		 * Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); BufferedImage
		 * bi=robot.createScreenCapture(rect); ImageIO.write(bi,"png",new
		 * File(".//scr.png"));
		 * 
		 * driver.navigate().back();
		 * 
		 * DesiredCapabilities dc=DesiredCapabilities.chrome();
		 * dc.setAcceptInsecureCerts(true);
		 * 
		 * driver = new ChromeDriver();
		 * driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		 * driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 * WebDriverWait wait = new WebDriverWait(driver,10);
		 * driver.manage().window().maximize();
		 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * ".btn.btn-success.fileinput-button")));
		 * driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click
		 * (); StringSelection sel=new StringSelection("path"); Clipboard
		 * clip=Toolkit.getDefaultToolkit().getSystemClipboard(); clip.setContents(sel,
		 * null);
		 * 
		 * robot.delay(250); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.delay(150); robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".//Drivers//chromedriver.exe"); //setup the chromedriver using //
		 * WebDriverManager //WebDriverManager.chromedriver().setup();
		 * 
		 * // WebDriver driver = new ChromeDriver();
		 * 
		 * //Navigate to a URL driver.get("http://google.com");
		 * 
		 * //driver.findElement(new ByIdOrName("q")); driver.findElement (new ByAll
		 * (By.className("not-exist"), By.id("inner"),By.name("q"))).sendKeys("help");
		 * 
		 * 
		 * driver.findElement(new ByChained(By.id("registration-form"),
		 * By.xpath("//label[contains(.,'Email')]"), By.tagName("input")) );
		 * driver.findElement(new ByIdOrName("password"));
		 */
		  
		  
		 }
}
