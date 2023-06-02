package org.pineapple.testscripts;
import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import 	org.pineapple.test_steps.Get_BusinessEmailID_AwardedBusiness_TestMethod;
public class Get_BusinessEmailID_AwardedBusiness_Test_API {
	@Test(priority=0)
	//This API displays the business Email address of the business (functions as sub-contractor) who has been awarded the Job Offer (quote)
	public  void Get_BusinessEmailID_AwardedBusiness_Test_API_ValidOfferID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_BusinessEmailID_AwardedBusiness_TestMethod http = new Get_BusinessEmailID_AwardedBusiness_TestMethod(proObject);
		Response res=http.Get_BusinessEmailID_AwardedBusiness("getAwardedBusinessID","QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());

	}

	//This API displays the business Email address of the business (functions as sub-contractor) who has been awarded the Job Offer (quote)....InvalidOfferId
	@Test(priority=1)
	public  void Get_BusinessEmailID_AwardedBusiness_Test_API_InvalidOfferID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_BusinessEmailID_AwardedBusiness_TestMethod http = new Get_BusinessEmailID_AwardedBusiness_TestMethod(proObject);
		Response res=http.Get_BusinessEmailID_AwardedBusiness("getAwardedBusinessID","QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
}