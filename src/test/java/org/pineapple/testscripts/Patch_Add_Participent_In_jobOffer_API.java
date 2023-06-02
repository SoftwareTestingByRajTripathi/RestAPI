package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.pineapple.utility.RandomData;
import org.pineapple.utility.VariableReplacement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Patch_Add_Participent_In_jobOffer_API {
	@Test(priority=1)
	public void AddPrticipent_InJoboffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"AddParticipentInJoboffer.json");
		bodydata = VariableReplacement.variableValue(bodydata, "id",RandomData.randomNo().toString());
		Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps http = new Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps(proObject);
		Response res=	http.Patch_AddParticipent_AnOutgoing_JobOffer_ValidExternalBusinessID(bodydata,"Add_Prticipent","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200, res.statusCode());
	}
	@Test(priority=2)
	public void AddPrticipent_InJoboffer_InvalidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"AddParticipentInJoboffer.json");
		bodydata = VariableReplacement.variableValue(bodydata, "id",RandomData.randomNo().toString());
		Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps http = new Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps(proObject);
		Response res=	http.Patch_AddParticipent_AnOutgoing_JobOffer_InvalidExternalBusinessID(bodydata,"Add_Prticipent","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());


	}


}
