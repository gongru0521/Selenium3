package com.test.myzs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxTest {

	public static void main(String[] args) throws InterruptedException {  
        
     
          
     //   System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
		//打开chrome浏览器
	   	System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
          
        //初始化一个火狐浏览器实例，实例名称叫driver  
      //  WebDriver driver = new FirefoxDriver();  
	    //初始化一个chrome浏览器实例，实例名称叫driver  
		WebDriver driver = new ChromeDriver();  
	//	 WebDriver driver = PageUtils.getChromeDriver("https://www.baidu.com/");
        //最大化窗口  
        driver.manage().window().maximize();  
        //设置隐性等待时间  
      //   driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
           driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
       // Thread.sleep(3000);
          
        // get()打开一个站点  
        driver.get("https://www.baidu.com");  
        //getTitle()获取当前页面title的值  
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());  
          
        //关闭并退出浏览器  
     //   driver.quit();  
          
    }  
	
	
}
