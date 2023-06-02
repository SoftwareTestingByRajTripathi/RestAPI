package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_GetPineappleBusinessID_TestSteps;
import org.pineapple.utility.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_PineApple_BusinessID_Test_API {
	@Test(priority=0)
	public void Get_PineappleBusinessID_RegisteredExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetPineappleBusinessID_TestSteps http = new Get_HTTPMethod_GetPineappleBusinessID_TestSteps(proObject);
		Response res=	http.get_PineappleBusinessID("GetPineappleID_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200, res.statusCode());
	}
	@Test(priority=1)
	public void Get_PineappleBusinessID_InvalidExternalID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetPineappleBusinessID_TestSteps http = new Get_HTTPMethod_GetPineappleBusinessID_TestSteps(proObject);
		Response res=	http.get_PineappleBusinessID1("GetPineappleID_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());
	}
	@Test(priority=2)
	public void Get_PineappleBusinessID_InvitedExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetPineappleBusinessID_TestSteps http = new Get_HTTPMethod_GetPineappleBusinessID_TestSteps(proObject);
		Response res=	http.get_PineappleBusinessID2("GetPineappleID_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());
	}
	@Test(priority=3)
	public void Get_PineappleBusinessID_InvalidToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetPineappleBusinessID_TestSteps http = new Get_HTTPMethod_GetPineappleBusinessID_TestSteps(proObject);
		Response res=	http.get_PineappleBusinessID("GetPineappleID_API", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401, res.statusCode());
	}

}
