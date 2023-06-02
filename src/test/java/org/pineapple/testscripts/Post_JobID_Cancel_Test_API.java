package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.pineapple.test_steps.Post_httpMethod_JobID_Cancel;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;

public class Post_JobID_Cancel_Test_API {
	//This API allows the Business having contracting function to cancel a posted job 
	@Test(priority=0)
	public  void Post_JobID_Cancel() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_JobID_Cancel http = new Post_httpMethod_JobID_Cancel(proObject);
		Response res=http.Post_OutgoingJobId_Cancel_InvalidAccessToken("CancelJob_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	//This API allows the Business having contracting function to cancel a posted job ....InvalidExtrenalID
	@Test(priority=1)
	public  void Post_JobID_Cancel_InvalidExtrenalID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_JobID_Cancel http = new Post_httpMethod_JobID_Cancel(proObject);
		Response res=http.Post_OutgoingJobId_CancelInvalidExternal("CancelJob_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	//This API allows the Business having contracting function to cancel a posted job ....InvalidJobID
	@Test(priority=2)
	public  void Post_JobID_Cancel_InvalidJobID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_JobID_Cancel http = new Post_httpMethod_JobID_Cancel(proObject);
		Response res=http.Post_OutgoingJobId_Cancel_InvalidJobID("CancelJob_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API allows the Business having contracting function to cancel a posted job ....InvalidAccessToken
	@Test(priority=3)
	public  void Post_JobID_Cancel_InvalidAccessToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_JobID_Cancel http = new Post_httpMethod_JobID_Cancel(proObject);
		Response res=http.Post_OutgoingJobId_Cancel_InvalidJobID("CancelJob_Details", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}
	//This API allows the Business having contracting function to cancel a posted job ....InvalidServerUrl
	//@Test(priority=4)
	//public  void Post_JobID_Cancel_InvalidServerUrl() throws IOException{
	//String basePath = System.getProperty("user.dir");
	//Properties proObject = 	PropertiesRead.readPropertyFile(basePath +"\\src\\main\\java\\Resources\\URI.properties");
	//Post_httpMethod_JobID_Cancel http = new Post_httpMethod_JobID_Cancel(proObject);
	//Response res=http.Post_OutgoingJobId_Cancel_InvalidServerUrl("CancelJob_Details", "QA_Token");
	//System.out.println("Status code is :");
	//System.out.println(res.statusCode());
	//System.out.println("Response data is");
	//System.out.println(res.asString());
	//Assert.assertEquals(500,res.getStatusCode());

}