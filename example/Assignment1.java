package assignments;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Navigation nav= driver.navigate();
		nav.to("https://www.bing.com/images/trending?form=Z9LH");
		
		List<WebElement> listImages =driver.findElements(By.tagName("img"));
		
		System.out.println("No of Images :" +listImages.size());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}


//html/body/div[2]/div/div[3]/header/div[1]/div/ul/li[1]/a