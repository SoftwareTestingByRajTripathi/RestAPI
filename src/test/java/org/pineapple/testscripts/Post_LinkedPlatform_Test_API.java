package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_HTTPMethod_ConnectLinked_Platform_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_LinkedPlatform_Test_API {
	@Test(priority=1)

	public void Post_LinkedPlatform_ValidExternalBusinessID() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"EnterLinkedPlatformcode.json");		
		Post_HTTPMethod_ConnectLinked_Platform_TestSteps http = new Post_HTTPMethod_ConnectLinked_Platform_TestSteps(proObject);
		Response res =    http.Post_LinkedPlatform_ValidExternalBusinessID(bodydata, "linkedplatform","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());

	}


}
