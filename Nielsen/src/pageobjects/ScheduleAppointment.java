package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ScheduleAppointment"                                
     , summary=""
     , relativeUrl=""
     , connection="SurveyLink"
     )             
public class ScheduleAppointment {

	@PageFrame()
	public static class Frame {
	}
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='OK']")
	public WebElement oK;
			
}
