package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;


import org.testng.Assert;
import org.testng.annotations.Test;

import org.pineapple.test_steps.Post_OfferChangeLocation_joboffers;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import io.restassured.response.Response;

public class Post_An_Outgoing_ChangeOfferLocationInJobOffer_API {
	@Test()
	public void GetOfferLocationJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"ChangeLocationjoboffers.json");
		Post_OfferChangeLocation_joboffers http = new Post_OfferChangeLocation_joboffers(proObject);
		Response res=	http.Post_Details_ChangeofferLocation_validJobOffer("JobOffer_Details","QA_Token",bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}

}
