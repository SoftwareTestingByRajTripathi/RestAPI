package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_BusinessRating_Deatails_TestStep_API;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_BusinessRating_Details_TestScript {
	@Test(priority=1)
	// This Api allows Business to verify that user can get business rating by using external business id
	public void Get_BusinessRating_Details_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_BusinessRating_Deatails_TestStep_API http = new Get_BusinessRating_Deatails_TestStep_API(proObject);
		Response res=	http.Get_BusinessRating_Details("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
		@Test(priority=2)
		// This Api allows Business to Verify that if user enter invalid externalBusinessID of a Business then user is not able to get the business rating of that business
		public void Get_BusinessRating_Details_UnVerifiedExternalBusinessID() throws IOException{
			String basePath = System.getProperty("user.dir");
			Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
			Get_BusinessRating_Deatails_TestStep_API http = new Get_BusinessRating_Deatails_TestStep_API(proObject);
			Response res=	http.Get_BusinessRating_Details_UnVerifiedExternalID("AnOutgoingcomingJobOffer","QA_Token");
			System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
				System.out.println(res.asString());
				Assert.assertEquals(400,res.getStatusCode());
		}
		@Test(priority=3)
		// This Api allows Business to Verify that if user enter invalid API Key then user is not able to get the business rating of that business
		public void Get_BusinessRating_Details_InValidExternalBusinessID() throws IOException{
			String basePath = System.getProperty("user.dir");
			Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
			Get_BusinessRating_Deatails_TestStep_API http = new Get_BusinessRating_Deatails_TestStep_API(proObject);
			Response res=	http.Get_BusinessRating_Details_InValidExternalID("AnOutgoingcomingJobOffer","QA_Token");
			System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
				System.out.println(res.asString());
				Assert.assertEquals(400,res.getStatusCode());
		}
		@Test(priority=4)
		// This Api allows Business to Verify that if there is no rating of that business then a message is displayed "No Ratings Yet"
		public void Get_BusinessRating_Details_ExternalBusinessID() throws IOException{
			String basePath = System.getProperty("user.dir");
			Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
			Get_BusinessRating_Deatails_TestStep_API http = new Get_BusinessRating_Deatails_TestStep_API(proObject);
			Response res=	http.Get_BusinessRating_Details_Null_ExternalBusinessID("AnOutgoingcomingJobOffer","QA_Token");
			System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
				System.out.println(res.asString());
				Assert.assertEquals(200,res.getStatusCode());
		}
	
	

}
