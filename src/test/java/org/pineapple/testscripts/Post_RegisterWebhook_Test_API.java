package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.pineapple.test_steps.Post_HTTPMethod_RegisterWebhook_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;

import io.restassured.response.Response;

public class Post_RegisterWebhook_Test_API {
	@Test()
	public void RegsiterJobofferDetailsInWebhookURL_ValidExternalBusinessID() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"RegisterWebhook.json");
		Post_HTTPMethod_RegisterWebhook_TestSteps http= new Post_HTTPMethod_RegisterWebhook_TestSteps(proObject);
		Response res=http.RegisterWebhookDetails_InJobOfferwithValidExternalID("registerWebhookdetails","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code+res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());
	}
}