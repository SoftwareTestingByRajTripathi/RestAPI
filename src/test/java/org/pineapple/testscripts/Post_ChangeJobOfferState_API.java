package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_httpMethod_ChangeJobOfferState_Test;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_ChangeJobOfferState_API {
	@Test(priority=0)
	public  void Post_ChangeJobOfferDraftToOpenState() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"ChangeJoOfferState.json");

		Post_httpMethod_ChangeJobOfferState_Test http=new Post_httpMethod_ChangeJobOfferState_Test(proObject);
		Response res=http.Post_ChangeJobofferState_ValidBusinessId(bodydata,"ChangeJobOfferState_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	///Rakhi code---///InvalidRequest
	@Test(priority=1)
	public  void Post_ChangeJobOfferDraftToOpenState_InvalidSubeezId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
        String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"ChangeOfferState_InvalidSubeezID.json");
		Post_httpMethod_ChangeJobOfferState_Test http=new Post_httpMethod_ChangeJobOfferState_Test(proObject);
		Response res=http.Post_ChangeJobofferState_InValidBusinessId(bodydata,"ChangeJobOfferState_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	@Test(priority=2)
	public  void Post_ChangeJobOfferOpenToAwardState() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"ChangeOffer_OpenToAward.json");
		Post_httpMethod_ChangeJobOfferState_Test http=new Post_httpMethod_ChangeJobOfferState_Test(proObject);
		Response res=http.Post_ChangeJobofferState_OpenToAwardState(bodydata,"ChangeJobOfferState_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
}
}