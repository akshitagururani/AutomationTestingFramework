package example.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * The Class represents ParabankLoginPage.
 *
 * @author Akshita
 */
public class ParabankLoginPage extends BasePage {

	/** The email input. */
	@FindBy(name = "username")
	private WebElement emailInput;

	/** The pass. */
	@FindBy(name = "password")
	private WebElement pass;
	
	/** Register link. */
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerLink;
	
	/** First name for registration . */
	@FindBy(name = "customer.firstName")
	private WebElement fName;
	
	/** Last name for registration . */
	@FindBy(name = "customer.lastName")
	private WebElement lName;
	
	/** Address for registration . */
	@FindBy(name = "customer.address.street")
	private WebElement addReg;
	
	/** City for registration . */
	@FindBy(id = "customer.address.city")
	private WebElement cityReg;
	
	/** State for registration . */
	@FindBy(id = "customer.address.state")
	private WebElement stateReg;
	
	/** Zip for registration . */
	@FindBy(id = "customer.address.zipCode")
	private WebElement zipReg;
	
	/** SSN for registration . */
	@FindBy(id = "customer.ssn")
	private WebElement ssnReg;
	
	/** Username for registration . */
	@FindBy(id = "customer.username")
	private WebElement usernameReg;
	
	/** Pass for registration . */
	@FindBy(id = "customer.password")
	private WebElement passReg;
	
	/** ConfirmPass for registration . */
	@FindBy(id = "repeatedPassword")
	private WebElement confPassReg;
	
	/** click on register button for registration . */
	@FindBy(xpath = "//tbody/tr[13]/td[2]/input[1]")
	private WebElement registerBtn;
	
	/** regrestation validation msg . */
	@FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
	private WebElement regSucessValidMsg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*******************************************************************************/
	/**
	 * Instantiates a new Parabank login page.
	 *
	 * @param driver the driver
	 */
	public ParabankLoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Enter email.
	 *
	 * @param email the email
	 * @return the facebook login page
	 */
	public ParabankLoginPage enterEmail(String email) {
		emailInput.sendKeys(email);
		return this;
	}

	/**
	 * Enter password.
	 *
	 * @param password the password
	 * @return the Parabank login page
	 */
	public ParabankLoginPage enterPassword(String password) {	
		pass.sendKeys(password);
		return this;
	}

	/**
	 * Click sign in.
	 */
	public void clickSignIn() {
		pass.submit();
	}
	
	/** Click register link.*/
	public void clickRegisterLink() { 
		registerLink.click();
	}
	
	/**
	 * Enter first name in registration page.
	 */
	public ParabankLoginPage enterFNAme(String fname){	
		fName.sendKeys(fname);
		return this;
	}
	
	/**
	 * Enter last name in registration page.
	 */
	public ParabankLoginPage enterLNAme(String lname) {	
		lName.sendKeys(lname);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterAddr(String addrReg) {	
		addReg.sendKeys(addrReg);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterCity(String cityRegi) {	
		cityReg.sendKeys(cityRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterZip(String zipRegi) {	
		zipReg.sendKeys(zipRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterState(String stateRegi) {	
		stateReg.sendKeys(stateRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterSSN(String ssnRegi) {	
		ssnReg.sendKeys(ssnRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterUN(String usernameRegi) {	
		usernameReg.sendKeys(usernameRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterPass(String passRegi) {	
		passReg.sendKeys(passRegi);
		return this;
	}
	
	/**
	 * Enter address in registration page.
	 */
	public ParabankLoginPage enterConfPass(String ConfPassRegi) {	
		confPassReg.sendKeys(ConfPassRegi);
		return this;
	}
	
	/**
	 * Click register button.
	 */
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	
	/**
	 * validate logged in successfully
	 */
	public void validateRegisterationSucess() {
		String regMsgText= regSucessValidMsg.getText();
		String RegExpMsg= "Your account was created successfully. You are now logged in.";
		assert regMsgText.equals(RegExpMsg) : "Validation failed with : " + regMsgText;
	}
	
	public void linksHm(int expectedLinkCount) {
		// Find all the links on the web page
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
     // Print the count of links
        System.out.println("Total links count: " + links.size());

        // Print the text and href attribute of each link
        for (WebElement link : links) {
            String linkText = link.getText();
            String href = link.getAttribute("href");
            System.out.println("Link text: " + linkText + ", href: " + href);
        }
        
     // Get the actual count of links
        int actualLinkCount = links.size();
        System.out.println("Actual links count: " + actualLinkCount);
      

        // Define the expected count of links
        
        System.out.println("Expected links count: " + expectedLinkCount);

        // Validate the count of links
        if (actualLinkCount == expectedLinkCount) {
            System.out.println("Link count validation successful!");
            Assert.assertTrue(true,"links counts are as expected");
        } else {
            System.out.println("Link count validation failed!");
            Assert.assertTrue(false,"links counts are not as expected");
        }

	}
	
	

	
	
}
