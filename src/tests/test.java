package tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {
	@Test
	public void google(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
	}
	
}
