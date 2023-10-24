package myHelloWorldPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myHelloWorldClass {
  @Test
  public void firstTest() throws InterruptedException {
	  System.out.println("Hello world!");
		//System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("org.slf4j.LoggerFactory","org.apache.logging.log4j.simple.SimpleLoggerContextFactory"); 		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\ChromeDriverLatestVersion116\\chromedriver-win64\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\ChromeDriverLatestVersion118\\chromedriver-win64\\chromedriver.exe");
		
				//System.setProperty("webdriver.chrome.whitelistedIps", "");
				
				WebDriver driver = new ChromeDriver();
				Thread.sleep(8000);
				//driver.get("https://www.amazon.com/");
				driver.get("https://www.google.com/");
				Thread.sleep(8000); //ie 8 seconds or 8000 milliseconds
				driver.manage().window().maximize();
				Thread.sleep(8000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//--------------------
				WebElement GmailLink = driver.findElement(By.linkText("Gmail"));
				GmailLink.click();
				Thread.sleep(3000);
				//--------------------
				
				//WebElement SearchBox = (WebElement) driver.findElements(By.id("twotabsearchtextbox"));
				//SearchBox.sendKeys("earphone");
				//WebElement SearchIcon = driver.findElement(By.className("nav-input nav-progressive-attribute"));
				//SearchIcon.click();
				//WebElement theHelpText = driver.findElement(By.name("qna_question_expander"));
				//theHelpText.click();
				//Thread.sleep(4000);
				
				js.executeScript("window.scrollBy(0,6000)");
				Thread.sleep(8000);
				driver.quit();

  }
}
