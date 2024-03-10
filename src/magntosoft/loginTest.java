package magntosoft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void myBe4() {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void testCases() {
//		driver.findElement(By.linkText("Sign In")).click();
		;
		driver.findElement(By.partialLinkText("Create")).click();

		WebElement formCreatAccount = driver.findElement(By.id("form-validate"));

		List<WebElement> inputTag = formCreatAccount.findElements(By.tagName("input"));

		for (int i = 0; i < inputTag.size(); i++) {
			if (inputTag.get(i).getAttribute("type").equals("hidden")) {

				continue;
			} else {
				inputTag.get(i).sendKeys("mohammad nabeel");

			}
		}
		;
	}
	// im gonaa search for all element have yhe smae link
};
