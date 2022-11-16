package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LoginPage"                                
     , summary=""
     , relativeUrl=""
     , connection="SurveyLink"
     )             
public class LoginPage {

	@TextType()
	@FindBy(xpath = "//input[@id='sq_100i']")
	public WebElement AccessCode;
	@TextType()
	@FindBy(xpath = "//input[@id='sq_101i']")
	public WebElement ZipCode;
	@BooleanType()
	@FindBy(xpath = "//input[@id='sq_102i_0']")
	public WebElement termsCheckBox;
	@PageFrame()
	public static class Frame {

		@BooleanType()
		@FindBy(xpath = "//span[@id='recaptcha-anchor']/div[1]")
		public WebElement robotCheckbox;
	}
	@FindBy(xpath = "//div[contains(@class, \"form-group\")]/div/div/div//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//div[@id='sv-nav-complete']/div/input")
	public WebElement sUBMIT;
	@TextType()
	@FindBy(xpath = "//div[@data-name='survey_completed']//div/div")
	public WebElement SurveyCompleted;
	@TextType()
	@FindBy(xpath = "//div[@id='sq_100_errors']/div/span/span")
	public WebElement accesscodeError;
	@TextType()
	@FindBy(xpath = "//div[@id='sq_101_errors']/div/span/span")
	public WebElement zipcodeError;
	@TextType()
	@FindBy(xpath = "//div[@id='sq_102_errors']/div/span/span")
	public WebElement termsError;
	@TextType()
	@FindBy(xpath = "//div[@id='sq_103']/div/div")
	public WebElement IncorrectAccess_ZipCode;
	@TextType()
	@FindBy(xpath = "//div[@data-name='survey_completed']//p[1]/span")
	public WebElement ThankYou;
	@ChoiceListType()
	@FindBy(xpath = "//select")
	public WebElement langSelector;
	@TextType()
	@FindBy(xpath = "//div[@data-name='verify_access_code']//h5//b[1]")
	public WebElement header_txt;
	@TextType()
	@FindBy(xpath = "//div[@data-name='verify_access_code']//h5//b[2]")
	public WebElement accessCode_txt;
			
}
