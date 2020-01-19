package parameterization;

import java.io.File;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestParameterization {

	

	@Test(dataProviderClass = parameterization.DataProviderTest.class,dataProvider = "dp2")
	public void doLogin(Hashtable<String, String> data) {

		//System.out.println("username:   " + data.get("username") + "pasword:   " + data.get("password"));
	}

	@Test(dataProviderClass = parameterization.DataProviderTest.class,dataProvider = "dp1")
	public void login(String username, String password) {

		
		System.out.println("username:"+username+"password:  "+ password);
		
	}

	@Test(dataProviderClass = parameterization.DataProviderTest.class,dataProvider = "dp1")
	public void userReg(String username, String password, String email) {
	
		System.out.println("username:"+username+"password:  "+ password+"email: "+ email);
	}

	

}
