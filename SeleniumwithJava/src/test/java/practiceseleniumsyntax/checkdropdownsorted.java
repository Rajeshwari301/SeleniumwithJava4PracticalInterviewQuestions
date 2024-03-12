package practiceseleniumsyntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkdropdownsorted {
	public static void main(String args[])
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.twoplugs.com/newsearchserviceneed");
	WebElement drpdown = driver.findElement(By.name("category_id"));
	Select drop = new Select(drpdown);
	List<WebElement> options = drop.getOptions();
	
	ArrayList originallist = new ArrayList();
	ArrayList templist = new ArrayList();
	
	for(WebElement option:options)
	{
		originallist.add(option.getText());
		templist.add(option.getText());
	}
	
	System.out.println("Originallist:"+originallist);
	System.out.println("templist:"+templist);
	
	Collections.sort(templist);
	
	System.out.println("templist:"+templist);
	
	if(originallist.equals(templist))
	{
		System.out.println("dropdown sorted");
	
	}
	else
	{
		System.out.println("dropdown unsorted");
	}

}
}
