package Session24;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.errorprone.annotations.ThreadSafe;

public class GridProj {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {

		//Desired Capabilities:
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
			
	    WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.106:4444/wd/hub").toURL(), dc);
	    driver.get("https://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Thread.sleep(5000);
	    driver.findElement(By.name("q")).sendKeys("Mayur");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@class='gsc-search-button']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("alert1")).click();
	    Thread.sleep(5000);
	}
	
}