package org.pineapple.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;

import io.restassured.response.Response;

public class Post_LinkPlatform_TestAPI {
	@Test(priority=0)
	public  void Post_LinkPlatform() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= org.pineapple.utility.JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"LinkPlatform.json");
		org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test http = new org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test (proObject);
		Response res=http.Post_LinkPlatform_TestScript(bodydata, "LinkPlatformDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(400,res.getStatusCode());
	}

	@Test(priority=1)
	public  void Post_LinkPlatform_InvalidSystemCode() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= org.pineapple.utility.JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"LinkPlatform_InvalidCode.json");
		org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test http = new org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test (proObject);
		Response res=http.Post_LinkPlatform_TestScript_InvalidCode(bodydata, "LinkPlatformDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(400,res.getStatusCode());
	}
	@Test(priority=2)
	public  void Post_LinkPlatform_UnverifiesEmail() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= org.pineapple.utility.JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"LinkPlatForm_UnverifiedEmail.json");
		org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test http = new org.pineapple.test_steps.Post_httpMethod_LinkPlatform_Test (proObject);
		Response res=http.Post_LinkPlatform_TestScript_UnverifiedEmail(bodydata, "LinkPlatformDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(400,res.getStatusCode());
	}


}
