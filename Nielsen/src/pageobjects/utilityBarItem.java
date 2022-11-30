package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="utilityBarItem"                                
     , summary=""
     , relativeUrl=""
     , connection="Salesforce"
     )             
public class utilityBarItem {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Omni-Channel (Online)']")
	public WebElement omniChannelOnline;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Change your Omni-Channel status']")
	public WebElement changeYourOmniChannelStatus;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Available - SMS and Email']")
	public WebElement availableSMSAndEmail;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Omni-Channel (Offline)']")
	public WebElement omniChannelOffline;
	@PageWait.Field(field = "acceptEmailRouting", timeoutSeconds = 10)
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:buttonIcon[@aura:id= 'accept']")
	public WebElement acceptEmailRouting;
			
}
