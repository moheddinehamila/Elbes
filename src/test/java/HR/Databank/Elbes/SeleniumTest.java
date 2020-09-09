package HR.Databank.Elbes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

@SpringBootTest
public class SeleniumTest {
	@Test

		public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/moheddine/Documents/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://localhost:4200/login");
			driver.findElement(By.name("mail")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("fff");
			driver.findElement(By.name("log")).click();
			assertEquals(true, true);
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			//driver.quit();
		}
	}
}
