package basicSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiPleWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\06012019\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com");
		
		String parent=dr.getWindowHandle();
		
		System.out.println(parent);
		
		Set<String> wins=dr.getWindowHandles();
		
		for(String s:wins)
		{
			dr.switchTo().window(s);			
			if(!s.equals(parent))
			{
				dr.close();
			}
		}
		
		
		

	}

}
