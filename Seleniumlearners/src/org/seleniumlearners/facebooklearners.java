package org.seleniumlearners;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class facebooklearners {

	public static void main(String[] args) {
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("incognito");
			options.addArguments("disable-infobars");
			//WebDriver driver2 = new RemoteWebDriver(new URL(url), desiredCapabilities);
			WebDriver driver = new ChromeDriver(options);
						
			//driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			List<WebElement> ls = driver.findElements(By.xpath("//select[@id='month']//option"));
			//System.out.println(ls);
			String mon=null;
	
			for(WebElement ls1:ls)
			{
				mon = ls1.getText();
				if(mon.equalsIgnoreCase("Jul"))
				{
					break;
					
				}
			}
			System.out.println(mon);
			WebElement wl = driver.findElement(By.cssSelector("input[name='firstname']"));
			
			Rectangle r=wl.getRect();
			int x = r.x;
			int y = r.y;
			
			System.out.println(x);
			System.out.println(y);
//			WebElement el2 = driver.findElement(By.xpath("//div[@class='mtm mbs _2_68' and contains(text(),'Gender')]"));
//			Actions ac = new Actions(driver);
//			ac.doubleClick(el2).build().perform();
//			Thread.sleep(10000);
			driver.quit();
			//driver.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
