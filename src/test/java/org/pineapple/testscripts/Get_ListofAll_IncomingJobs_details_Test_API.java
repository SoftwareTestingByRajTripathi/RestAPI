package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_ListofAll_IncomingJobs_details_Test_API {
	@Test(priority=0)
	public void Get_allIncomingjobs_details_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_All_Incoming_jobs_details("All_Incoming_Jobs_details","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=1)
	public void Get_allIncomingjobs_details_InvalidExternalID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_All_Incoming_jobs_details_InvalidID("All_Incoming_Jobs_details","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());

	}
	@Test(priority=2)
	public void Get_allIncomingjobs_details_InvitedExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_All_Incoming_jobs_details_Inviated_ExternalBusinessID("All_Incoming_Jobs_details","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());

	}


}
