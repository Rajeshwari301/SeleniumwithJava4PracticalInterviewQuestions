package practiceseleniumsyntax;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownselect {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		//WebElement drp = driver.findElement(By.id("dropdown"));
		//drp.click();
		Select sel = new Select(driver.findElement(By.id("dropdown")));
		//sel.selectByVisibleText("Option 1");
		
		List<WebElement>alloptions = sel.getOptions();
		for(WebElement ele : alloptions)
		{
			if(ele.getText().equals("Option 2"))
			{
				ele.click();
			}
		}
	}

}
