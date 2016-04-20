package G15SavchukMaven.ComQaLightOld;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Zapisatsya {
	WebDriver driver;
	Logger log;
	public Zapisatsya(WebDriver driver) {
		this.driver = driver;
		log = Logger.getLogger(getClass());
	}

	public void openZapisatsya() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try {
			driver.get("http://old.qalight.com/zapisatsya-na-kurs/");
			log.info("Browser and url was opened");
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("Can't work with browser");
		}
		
	}

	public void closePage() {
		driver.quit();
	}

	
}
