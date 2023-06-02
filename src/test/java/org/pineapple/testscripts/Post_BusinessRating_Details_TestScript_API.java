package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_BusinessRating_Details_TestSteps_API;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_BusinessRating_Details_TestScript_API {
	@Test(priority=1)
	// This Api allows Business to verify that user can give the ratings if the job is in job completed state
	public void Post_BusinessRating_Details_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Post_BusinessRating.json");
		Post_BusinessRating_Details_TestSteps_API http = new Post_BusinessRating_Details_TestSteps_API(proObject);
		Response res=	http.Post_BusinessRating_Details("AnOutgoingcomingJobOffer","QA_Token",bodydata);
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	public class Post_BusinessRating_DraftState_Details_TestScript_API {
		@Test(priority=1)
		// This Api allows Business to verify that user can not give the rating if the job is in draft state 
		public void Post_BusinessRating_Details_ValidExternalBusinessID() throws IOException{
			String basePath = System.getProperty("user.dir");
			Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
			String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"BusinessRating_DraftState.json");
			Post_BusinessRating_Details_TestSteps_API http = new Post_BusinessRating_Details_TestSteps_API(proObject);
			Response res=	http.Post_BusinessRating_Details("AnOutgoingcomingJobOffer","QA_Token",bodydata);
			System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
				System.out.println(res.asString());
				Assert.assertEquals(200,res.getStatusCode());
		}
		public class Post_BusinessRating_FieldReady_Details_TestScript_API {
			@Test(priority=1)
			// This Api allows Business to verify that user can not give the rating if the job is in draft state 
			public void Post_BusinessRating_Details_ValidExternalBusinessID() throws IOException{
				String basePath = System.getProperty("user.dir");
				Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
				String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"BusinessRating_DraftState.json");
				Post_BusinessRating_Details_TestSteps_API http = new Post_BusinessRating_Details_TestSteps_API(proObject);
				Response res=	http.Post_BusinessRating_Details("AnOutgoingcomingJobOffer","QA_Token",bodydata);
				System.out.println(Constant.Response_Status_code);
		        System.out.println(res.statusCode());
		        System.out.println(Constant.Response_Data);
					System.out.println(res.asString());
					Assert.assertEquals(200,res.getStatusCode());
			}
			public class Post_BusinessRating_FieldStarted_Details_TestScript_API {
				@Test(priority=1)
				// This Api allows Business to verify that user can not give the rating if the job is in draft state 
				public void Post_BusinessRating_Details_ValidExternalBusinessID() throws IOException{
					String basePath = System.getProperty("user.dir");
					Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
					String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"BusinessRating_DraftState.json");
					Post_BusinessRating_Details_TestSteps_API http = new Post_BusinessRating_Details_TestSteps_API(proObject);
					Response res=	http.Post_BusinessRating_Details("AnOutgoingcomingJobOffer","QA_Token",bodydata);
					System.out.println(Constant.Response_Status_code);
			        System.out.println(res.statusCode());
			        System.out.println(Constant.Response_Data);
						System.out.println(res.asString());
						Assert.assertEquals(200,res.getStatusCode());
				}

	}
		
	}
	}}


