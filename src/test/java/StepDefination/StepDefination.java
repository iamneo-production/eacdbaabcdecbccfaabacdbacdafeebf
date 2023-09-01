package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver = null;

	@Given("the user navigates to JavaTpoint.com")
	public void the_user_navigates_to_java_tpoint_com() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.javatpoint.com/");
	}

	@When("the user clicks on Feedback")
	public void the_user_clicks_on_feedback() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/footer[1]/div[4]/a[1]")).click();
	}

	@When("the Feedback page opens")
	public void the_feedback_page_opens() {
		String title = driver.getTitle();
		boolean cond = title.contains("Contact Us");
		Assert.assertTrue(cond);
	}

	@When("the user submits feedback message")
	public void the_user_submits_feedback_message() {
		driver.findElement(By.name("name")).sendKeys("testName");
		driver.findElement(By.name("mobile")).sendKeys("1234567890");
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		driver.findElement(By.name("course")).sendKeys("testSubject");
		driver.findElement(By.name("message")).sendKeys("testMessage");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/div[2]/div[1]/form/table/tbody/tr[6]/td/input")).click();
		
	}

	@Then("feedback should be received on the admin page")
	public void feedback_should_be_received_on_the_admin_page() {
		String title = driver.getTitle();
		boolean cond = title.contains("Request Posted");
		Assert.assertTrue(cond);
	}

	@Then("admin can reply to the user")
	public void admin_can_reply_to_the_user() {
		driver.quit();
	}
}
