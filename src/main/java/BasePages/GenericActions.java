package BasePages;

import org.openqa.selenium.WebElement;

public class GenericActions {
	
	public static void FillTextField(WebElement TextField,String FieldValue){
		TextField.sendKeys(FieldValue);
	}

}
