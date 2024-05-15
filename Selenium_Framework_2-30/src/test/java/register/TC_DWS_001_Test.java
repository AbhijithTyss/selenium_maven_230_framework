package register;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ec.tricentis.genericutility.BaseClass;
import com.ec.tricentis.genericutility.ExcelUtility;
import com.ec.tricentis.genericutility.WebDriverUtility;

public class TC_DWS_001_Test extends BaseClass{
	@Test
	public void demo() throws EncryptedDocumentException, IOException {
		ExcelUtility eLib=new ExcelUtility();
		String email = eLib.getDataFromExcel("Login", 1, 0);
		System.out.println(email);
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.doubleClick(null, null);
	}
}
