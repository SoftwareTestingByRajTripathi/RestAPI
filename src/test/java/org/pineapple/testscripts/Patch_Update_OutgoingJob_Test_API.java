package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Patch_HTTPMethod_UpdateJobDetails_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Patch_Update_OutgoingJob_Test_API {
	@Test(priority=0)

	public void UpdateOutgoingjobs_validExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Updatejobdetails.json");
		Patch_HTTPMethod_UpdateJobDetails_TestSteps http = new Patch_HTTPMethod_UpdateJobDetails_TestSteps(proObject);
		Response res = http.UpdateJobsDetails_ValidExternalBusinessID("All_OutgoingJobs_details", "QA_token", bodydata);
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=1)
	public void UpdateOutgoingjobs_InvalidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Updatejobdetails.json");
		Patch_HTTPMethod_UpdateJobDetails_TestSteps http = new Patch_HTTPMethod_UpdateJobDetails_TestSteps(proObject);
		Response res = http.UpdateJobsDetails_InvalidExternalBusinessID("All_OutgoingJobs_details", "QA_token", bodydata);
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
		
		
	}

}
