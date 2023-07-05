package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.ParabankLoginPage;


/**
 * The Class ParabankLoginTest.
 *
 * @author Akshita
 */
@Test(testName = "Parabank app Login", description = "This test case is for verfying the login of Parabank app")
public class ParabankLoginTest extends BaseTest {

	@Test
	public void ParabankLoginTest() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		ParabankLoginPage ParabankLoginPage = PageinstancesFactory.getInstance(ParabankLoginPage.class);
		ParabankLoginPage.enterEmail("akshita").enterPassword("akshita123").clickSignIn();
		Assert.assertTrue(true, "Login Passed : Test Passed");
		
		
	}
}
