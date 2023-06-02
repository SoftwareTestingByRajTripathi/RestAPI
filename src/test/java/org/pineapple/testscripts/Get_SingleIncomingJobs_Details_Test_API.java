package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_An_IncomingJobsDetails_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_SingleIncomingJobs_Details_Test_API {
	@Test(priority=0)
	public void Get_SingleIncomingJob_Details_ValidExternalID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_An_IncomingJobsDetails_TestSteps http = new Get_HTTPMethod_An_IncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_SingleIncomingJobs_Details_Valid_ExternalBusinessID("GetDetailsOfSingleJobs","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200, res.statusCode());
	}
	@Test(priority=1)
	public void Get_SingleIncomingJob_Details_InvalidExternalID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_An_IncomingJobsDetails_TestSteps http = new Get_HTTPMethod_An_IncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_SingleIncomingJobs_Details_Invalid_ExternalBusinessID("GetDetailsOfSingleJobs","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());
	}
	@Test(priority=2)
	public void Get_SingleIncomingJob_Details_ValidExternalID_InvalidJobID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_An_IncomingJobsDetails_TestSteps http = new Get_HTTPMethod_An_IncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_SingleIncomingJobs_Details_Valid_ExternalBusinessID_Invalid_JobID("GetDetailsOfSingleJobs","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());
	}

}
