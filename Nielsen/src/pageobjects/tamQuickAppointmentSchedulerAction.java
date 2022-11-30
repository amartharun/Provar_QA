package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Tam Quick Appointment Scheduler Action"                                
               , summary=""
               , connection="Salesforce"
               , auraComponent="tamQuickAppointmentSchedulerAction"
               , namespacePrefix=""
     )             
public class tamQuickAppointmentSchedulerAction {

	@TextType()
	@FindBy(xpath = "//button[@name='person']")
	public WebElement person;
	@TextType()
	@FindBy(xpath = "//button[@name='worktype']")
	public WebElement workType;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@PageWait.Field(field = "select_Slot", timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//span[text()='Available Slots']/parent::div/../following-sibling::div/div/div[2]//div/div[1]//div/div[1]/span")
	public WebElement select_Slot;
	@ButtonType()
	@FindByLabel(label = "Schedule Appointment")
	public WebElement scheduleAppointment;
	
}
