package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.pineapple.test_steps.Get_httpMethod_IndustryList_TestMethod;

import io.restassured.response.Response;

public class Get_IndustryList_TestScript_API {
	//This API provides a list of all Industries in Subeez alongwith total Industry count and Industry details....get industry list
	@Test(priority=0)
	public  void  Get_IndustryList() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_IndustryList_TestMethod http = new Get_httpMethod_IndustryList_TestMethod(proObject);
		Response res =http.Get_httpMethod_IndustryList_Api_Withoutdata("IndustryListDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}

	//This API provides a list of all Industries in Subeez alongwith total Industry count and Industry details.....IndustryListWithdata
	@Test(priority=1)
	public  void  Get_IndustryListWithdata() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_IndustryList_TestMethod http = new  Get_httpMethod_IndustryList_TestMethod(proObject);
		Response res =http.Get_httpMethod_IndustryList_Api_Withdata("IndustryList", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}

	//This API provides a list of all Industries in Subeez alongwith total Industry count and Industry details....IndustryListAutoMobile
	@Test(priority=2)
	public  void  Get_IndustryListAutoMobile() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_IndustryList_TestMethod http = new  Get_httpMethod_IndustryList_TestMethod(proObject);
		Response res =http.Get_httpMethod_IndustryList_Api_AutoMobiledata("IndustryListAutoMobile", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}


	//This API provides a list of all Industries in Subeez alongwith total Industry count and Industry details....IndustryListInvalidToken
	@Test(priority=3)
	public  void  Get_IndustryListInvalidToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_httpMethod_IndustryList_TestMethod http = new Get_httpMethod_IndustryList_TestMethod(proObject);
		Response res =http.Get_httpMethod_IndustryList_Api_InvalidToken("IndustryListDetails", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}


}
