package basic.java.code;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITTest 
{

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException
	{ 
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\shankar\\\\\\\\Desktop\\\\\\\\14th Apr\\\\\\\\chromedriver.exe");
		
		//driver=new ChromeDriver();
		  
		
		/*driver.get("http://172.16.9.151");
		 
		 
			
		Runtime.getRuntime().exec("C:\\Users\\shankar\\Desktop\\14th Apr\\shan.exe");*/
		
		//.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		for(int i=1;i<10;i++)
		{
		
			
		          driver = new FirefoxDriver(); 
		          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		        driver.get("http://172.16.11.155:80");

		        Runtime.getRuntime().exec("C:\\\\Users\\\\shankar\\\\Desktop\\\\14th Apr\\\\shan.exe");
		        System.out.println("Browser launched:"+i);
		        
		        driver.close();
		}

		}
}
