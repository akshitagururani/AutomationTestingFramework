package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;

import example.example.pages.ParabankLoginPage;

/**
 * The Class ParaBankRegisterTest.
 *
 * @author Akshita
 */
@Test(testName = "ParaBank Register", description = "ParaBank Registeration of the customer")
public class ParaBankHomePageLinkPresent extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void ParaBankRegisterTest() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		ParabankLoginPage ParabankLoginPage = PageinstancesFactory.getInstance(ParabankLoginPage.class);
		ParabankLoginPage.linksHm(33);
		
		
		
		
		
		
		
	}
}
