package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name = "LoginErrorDataOne")
	public static Object datasetOne() {
		Object[][] errorObjects = {
				{"zdsfdas@fds.com","12345", "Wrong email or phone "}, 
				{"hgfhgfcas@fds.com","12345", "Wrong email or phone "},
				{"cas@fdscom","5645","Wrong email or phone "}
				};
		return errorObjects;
	}
	
	@DataProvider(name = "LoginErrorDataTwo")
	public static Object datasetTwo() {
		Object[][] errorObjects = {
				{"zdsfdasfds.com","12345", "Wrong email/phone or password"}, 
				{"hgfhgfcasfds.com","12345", "Wrong email/phone or password"},
				{"casfdscom","5645","Wrong email/phone or password"}
				};
		return errorObjects;
	}
	
	@DataProvider(name = "LoginData")
	public static Object datasetThree() {
		Object[][] validObjects = {
				{"01736278083","i@m1997s","Istear"}
				};
		return validObjects;
	}

}

