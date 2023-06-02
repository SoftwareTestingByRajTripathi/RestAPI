package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps;
import org.pineapple.utility.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_ListofAll_OutgoingJobs_details_Test_API {
	@Test(priority=0)
	public void Get_allOutgoingJobsDetails_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps(proObject);
	Response res=	http.Get_All_Outgoing_jobs_detailsValilExternalBusinessID("All_OutgoingJobs_details","QA_token");
	System.out.println(Constant.Response_Status_code);
    System.out.println(res.statusCode());
    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=1)
	public void Get_allOutgoingJobsDetails_InValidExternalBusinessID() throws IOException
	{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps(proObject);
	Response res=	http.Get_All_Outgoing_jobs_details_InvalidID("All_OutgoingJobs_details","QA_token");
	System.out.println(Constant.Response_Status_code);
    System.out.println(res.statusCode());
    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	@Test(priority=2)
	public void Get_allOutgoingJobsDetails_InviatedExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps http = new Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps(proObject);
		Response res=	http.Get_All_Outgoing_jobs_details_Inviated_ExternalBusinessID("All_OutgoingJobs_details","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}


}
