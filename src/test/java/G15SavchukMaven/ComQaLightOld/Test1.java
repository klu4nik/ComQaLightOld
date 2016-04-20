package G15SavchukMaven.ComQaLightOld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	WebDriver driver;
	Zapisatsya zapisatsya;
	@Before
	public void setUP(){
		
		driver = new FirefoxDriver();
		zapisatsya = new Zapisatsya(driver);
	}
	@Test
	public void test1(){
		zapisatsya.openZapisatsya();
	}
	@After
	public void tearDown(){
		zapisatsya.closePage();
	}

}
