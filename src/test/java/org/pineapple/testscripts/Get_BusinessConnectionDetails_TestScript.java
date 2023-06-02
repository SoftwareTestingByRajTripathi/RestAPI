package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.pineapple.test_steps.Get_httpMethod_BusinessConnection_TestMethod;

import io.restassured.response.Response;

public class Get_BusinessConnectionDetails_TestScript {
	//Code Status--OK
	//This Method provides a list of all Business Connections for a Business//
	@Test(priority=0)
	public  void  Get_BusinessConnection_ValidExternalId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_BusinessConnection_TestMethod http = new Get_httpMethod_BusinessConnection_TestMethod(proObject);
		Response res =http.Get_BusinessConnection_ID("BusinessConnection_details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//This Method provides a list of all Business Connections for a Business//...InvalidExternalID
	@Test(priority=1)
	public  void  Get_BusinessConnection_InValidExternalId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_BusinessConnection_TestMethod http = new Get_httpMethod_BusinessConnection_TestMethod(proObject);
		Response res =http.Get_BusinessConnection_InvalidExternalID("BusinessConnection_details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	//This Method provides a list of all Business Connections for a Business//....InvalidAPIKey
	@Test(priority=2)
	public  void  Get_BusinessConnection_InValidAPIKey() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +"\\src\\main\\java\\Resources\\URI.properties");
		Get_httpMethod_BusinessConnection_TestMethod http = new  Get_httpMethod_BusinessConnection_TestMethod(proObject);
		Response res =http.Get_BusinessConnection_InvalidAPIKey("BusinessConnection_details", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}	
}