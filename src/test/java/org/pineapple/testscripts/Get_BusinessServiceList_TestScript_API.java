package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import org.pineapple.test_steps.Get_httpMethod_Business_ServiceList_TestMethod;
import org.pineapple.utility.Constant;

public class Get_BusinessServiceList_TestScript_API {
 //Code status - OK
	//This API provides a list of all Services alongwith their details for an Industry in Subeez. 

	@Test(priority=0)
	public  void  Get_BusinessServiceList_Test() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_IndustryId("IndustryId", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}

	@Test(priority=1)
	public  void  Get_BusinessServiceList_Test_InvalidIndustryId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new  Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_IndustryId("InvalidIndustryId", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}


	//This API provides a list of all Services alongwith their details for an Industry in Subeez.....InvalidToken
	@Test(priority=2)
	public  void  Get_BusinessServiceList_Test_InvalidToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_InvalidToken("IndustryId", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}


	//This API provides a list of all Services alongwith their details for an Industry in Subeez.....PageSize
	@Test(priority=3)
	public  void  Get_BusinessServiceList_Test_PageSize() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_InvalidToken("IndustryIDAndPageSize", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}


	//This API provides a list of all Services alongwith their details for an Industry in Subeez.....InvalidSearchData
	@Test(priority=4)
	public  void  Get_BusinessServiceList_Test_InvalidSearchData() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new  Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_InvalidSerachData("IndustryIDAndInvalidsearchdata", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}

	//This API provides a list of all Services alongwith their details for an Industry in Subeez.....ValidSearchDataAndInvalidAccess
	@Test(priority=5)
	public  void  Get_BusinessServiceList_Test_ValidSearchDataAndInvalidAccess() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_Business_ServiceList_TestMethod http = new Get_httpMethod_Business_ServiceList_TestMethod(proObject);
		Response res =http.Get_httpMethod_Business_ServiceList_API_ValidSerachDataAndInvalidToken("IndustryIDAndValidsearchdata", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}


}
