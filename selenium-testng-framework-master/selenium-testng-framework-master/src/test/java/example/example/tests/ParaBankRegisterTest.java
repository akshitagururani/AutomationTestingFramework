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
public class ParaBankRegisterTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void ParaBankRegisterTest() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		ParabankLoginPage ParabankLoginPage = PageinstancesFactory.getInstance(ParabankLoginPage.class);
		ParabankLoginPage.clickRegisterLink();
		Assert.assertTrue(true, "Register Link Clicked");
		ParabankLoginPage.enterFNAme("AKs");
		ParabankLoginPage.enterLNAme("Guru");
		ParabankLoginPage.enterAddr("ABCD");
		ParabankLoginPage.enterCity("City");
		ParabankLoginPage.enterZip("13344");
		ParabankLoginPage.enterState("unihz");
		ParabankLoginPage.enterSSN("123");
		ParabankLoginPage.enterUN("akshita111");
		ParabankLoginPage.enterPass("isihita@2");
		ParabankLoginPage.enterConfPass("isihita@2");
		ParabankLoginPage.clickRegisterBtn();
		ParabankLoginPage.validateRegisterationSucess();
		Assert.assertTrue(true, "Register Successfully done  : Test Passed");
		
		
		
		
		
		
		
		
		
	}
}
