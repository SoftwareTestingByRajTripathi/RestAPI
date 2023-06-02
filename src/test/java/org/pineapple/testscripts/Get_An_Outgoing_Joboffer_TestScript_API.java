package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_An_Outgoing_Joboffer_TestScript_API {
	@Test(priority=1)
	public void Get_An_OutgoingJobOfferDetails_VaildExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods http = new Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods(proObject);
		Response res=	http.Get_Details_An_Outgoing_JobOffer("AnOutgoingcomingJobOffer","QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=2)
	public void Get_An_OutgoingJobOfferDetails_InvaildExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods http = new Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods(proObject);
		Response res=	http.Get_Details_An_Outgoing_JobOffer_InvalidExternalID("AnOutgoingcomingJobOffer","QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}


}
