package com.test.myzs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.utility.ReadAndWrCSV;

public class LaunchFirefoxTest {

	//public static void main(String[] args) throws InterruptedException {  
	
	ReadAndWrCSV rw=new ReadAndWrCSV();
	public static WebDriver driver ;
	
	@Test
	//启动浏览器
	public void test001(){
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe"); 
		driver= new ChromeDriver();  
		 System.out.println("driver:"+driver);
		 driver.manage().window().maximize();  
	        //设置隐性等待时间  
	     
	           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        
     
          
     //   System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
		//打开chrome浏览器
	  // 	System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
          
        //初始化一个火狐浏览器实例，实例名称叫driver  
      //  WebDriver driver = new FirefoxDriver();  
	    //初始化一个chrome浏览器实例，实例名称叫driver  
	//	WebDriver driver = new ChromeDriver();  
	//	 WebDriver driver = PageUtils.getChromeDriver("https://www.baidu.com/");
        //最大化窗口  
        
       // Thread.sleep(3000);
          
        // get()打开一个站点  
        driver.get("http://zs.kuaikuaipaobei.com/");  
        //getTitle()获取当前页面title的值  
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());  
        
          
        //关闭并退出浏览器  
      //   driver.quit();  
          
    //}  
	
	}
	@AfterClass
	public void waitsleep() throws InterruptedException{
		
		
		Thread.sleep(3000);
	}
	@Test
	public void test002() throws Exception{
		//绝对路径
		
		//String url2="F://github//Selenium3//src//com//test//ExcelFile//TestData.csv";
		
		//相对路径
		String url2="src/com/test/ExcelFile/TestData.csv";
		String url1="src/com/test/ExcelFile/TestResult.csv";
		
		
		//绝对路径
		
		
		//String url1="F://github//Selenium3//src//com//test//ExcelFile//TestResult.csv";
		
		
		rw.wricsv(url1, url2);
		
	}
	//@Test
	public void test003() throws Exception{
		
		
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[@id='topbar']/div/div[2]/div[2]/a[2]"));
	      loginbutton.click();
		
	}
}
