package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="FormPage"                                
, summary=""
, relativeUrl=""
, connection="SurveyLink"
		)             
public class FormPage {


	@TextType()
	@FindBy(xpath = "//b[text()='First Name']/../../../following-sibling::div//input")
	public WebElement FirstName;
	@TextType()
	@FindBy(xpath = "//b[text()='Last Name']/../../../following-sibling::div//input")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//b[text()='Phone Number']/../../../following-sibling::div//input")
	public WebElement Phone;
	@TextType()
	@FindBy(xpath = "//b[text()='Email']/../../../following-sibling::div//input")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//b[text()='Confirm Email']/../../../following-sibling::div//input")
	public WebElement Confirm_Email;
	@ButtonType()
	@FindBy(xpath = "//div[@id='sv-nav-next']/div/input")
	public WebElement next;
	@BooleanType()
	@FindBy(xpath = "//input[@value='Yes']")
	public WebElement Yes_Radio;
	@BooleanType()
	@FindBy(xpath = "//input[@value='No']")
	public WebElement No_Radio;
	@TextType()
	@FindBy(xpath = "//input[@id='sq_116i']")
	public WebElement age;
	@BooleanType()
	@FindBy(xpath = "//label[@aria-label='None of the above']//input")
	public WebElement nonOfThese_cb;
	//new
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='moving_2mo_ind']//input[@value='No']")
	public WebElement moving_2mo_ind;

	@BooleanType()
	@FindBy(xpath = "//b[contains(text(),'Is your household moving, or')]/../../../following-sibling::div//input[@value='No']")
	public WebElement household_Moving_No;
	//new
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='primary_residence_ind']//input[@value='Yes']")
	public WebElement primary_residence_ind;

	@BooleanType()
	@FindBy(xpath = "//b[contains(text(),'Does at least one person in')]/../../../following-sibling::div//input[@value='Yes']")
	public WebElement person_Yes;
	@TextType()
	@FindBy(xpath = "//div[@id='sq_124']/div/div")
	public WebElement Message;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='tv_programming']/div[2]//div[1]//input")
	public WebElement tv_programming;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='media_affil_company_station']//input[@value='No']")
	public WebElement company_station;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='media_affil_company']//input[@value='No']")
	public WebElement cable_satellite;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='media_affil_company_advertisement']//input[@value='No']")
	public WebElement company_advertisement;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='media_affil_company_youflix']//input[@value='No']")
	public WebElement youflix;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Hooray, we’re so glad you’re here!']")
	public WebElement hooray_Text;
	@ChoiceListType()
	@FindBy(xpath = "//div[@data-name='household_members_count']//select")
	public WebElement household_members_count;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='collected_gender']//input[@value='Male']")
	public WebElement collected_gender;
	@TextType()
	@FindBy(xpath = "//div[@data-name='date_of_birth']//input")
	public WebElement date_of_birth;
	@BooleanType()
	@FindBy(xpath = "//span[contains(text(),'No, not of Hispanic, Latino, ')]/../..//input")
	public WebElement hispanic_origin_choice;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Asian Indian']/../..//input")
	public WebElement race_detail;
	@BooleanType()
	@FindBy(xpath = "//span[text()='In the U.S. (50 states and D.C.)']/../..//input")
	public WebElement birth_place;
	@ChoiceListType()
	@FindBy(xpath = "//div[@data-name='state_of_birth']//select")
	public WebElement state_of_birth;
	@BooleanType()
	@FindBy(xpath = "//input[@value=concat('Bachelor',\"'\",'s degree (for example: BA, BS)')]")
	public WebElement education;
	@BooleanType()
	@FindBy(xpath = "//input[@value='Employed']")
	public WebElement employment_status;
	@TextType()
	@FindBy(xpath = "//div[@data-name='hours_per_week']//input")
	public WebElement hours_per_week;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Choose...']/span[normalize-space(.)='Choose...']/span[2]")
	public WebElement occupation;
	@TextType()
	@FindBy(xpath = "//li[normalize-space(.)='Actor']")
	public WebElement test;
	@TextType()
	@FindBy(xpath = "//div[@data-name='job_title']//input")
	public WebElement job_title;
	@TextType()
	@FindBy(xpath = "//div[@data-name='employer']//input")
	public WebElement employer;
	@TextType()
	@FindBy(xpath = "//div[@data-name='work_internet_hrs']//input")
	public WebElement work_internet_hrs;
	@TextType()
	@FindBy(xpath = "//div[@data-name='home_internet_hrs']//input")
	public WebElement home_internet_hrs;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='phone_number_confirmation']//input[@value='Yes']")
	public WebElement phone_number_confirmation;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='work_number']//input[@value='Yes']")
	public WebElement work_number;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='phone_type']//input[@value='Landline']")
	public WebElement phone_type;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='contact_method']//input[@value='Telephone']")
	public WebElement contact_method;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='preferred_languages']//input[@value='English']")
	public WebElement preferred_languages;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='best_days']//input[@value='Sunday']")
	public WebElement best_days;
	@BooleanType()
	@FindBy(xpath = "//input[@value='Morning: 9am-1pm']")
	public WebElement bestTimes;
	@TextType()
	@FindBy(xpath = "//div[@data-name='tv_count']//input")
	public WebElement tv_count;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='home_internet_type']//div[2]//div[1]//input")
	public WebElement home_internet_type;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='internet_service_provider_wired']//input[@value='Cablevision']")
	public WebElement internet_service_provider;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='internet_payer']//div[2]//div[1]//input")
	public WebElement internet_payer;
	@BooleanType()
	@FindBy(xpath = "//div[@data-name='internet_video']//div[2]//span/span[text()='None']")
	public WebElement internet_video;
	@TextType()
	@FindBy(xpath = "//div[@data-name='epa_agreement_sign']//input")
	public WebElement agreement_sign;
	@ButtonType()
	@FindBy(xpath = "//input[@value='AGREE']")
	public WebElement agree;
	@TextType()
	@FindBy(xpath = "//div[@data-name='privacy_consent_sign']//input")
	public WebElement agreement_sign1;

}
