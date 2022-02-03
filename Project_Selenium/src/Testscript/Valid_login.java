package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Generic_read_excel;
import Pom.Facebook_login;

public class Valid_login extends Base_Test{
	public  WebDriver driver;
	@Test
	public void getLogged() 
	{
		String uname=Generic_read_excel.getData("Sheet1",0,0);
		String pwd1=Generic_read_excel.getData("Sheet1",0,1);
		Facebook_login fb =new Facebook_login(driver);
		fb.setEmail(uname);
		fb.setPassword(pwd1);
		fb.passbtn();
		Assert.fail();
	}
}