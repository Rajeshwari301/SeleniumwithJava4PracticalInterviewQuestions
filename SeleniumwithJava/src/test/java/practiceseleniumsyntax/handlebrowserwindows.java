package practiceseleniumsyntax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlebrowserwindows {
	
	public static void main(String arg[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		//getwindow handle
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		
		//getwindowhandles
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Set<String> windowsid = driver.getWindowHandles();
		//Iterator<String> it = windowsid.iterator();
		//String parentid = it.next();
		//String childid = it.next();
		
		List<String> winids = new ArrayList(windowsid);
		String parenid = winids.get(0);
		String childid1 = winids.get(1);
		
		driver.switchTo().window(parenid);
		driver.switchTo().window(childid1);
		
		for(String ins : winids)
		{
			String title = driver.switchTo().window(ins).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
	}
	
	

}
