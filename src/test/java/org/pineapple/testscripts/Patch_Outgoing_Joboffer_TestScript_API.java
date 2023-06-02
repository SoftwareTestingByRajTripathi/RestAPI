package org.pineapple.testscripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import org.testng.annotations.Test;

import org.pineapple.test_steps.Patch_HTTPMethod_JobOffers_TestMethod;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Patch_Outgoing_Joboffer_TestScript_API {
	//verify that as an external platform User can update the details of an quotes sent
	//InputParameters-Enter Job address, Title, Customer Name, Customer Contact Details, Job start date, Job Completion Date, Description, etc.
	@Test(priority=2)
	public void Patch_QoutesSent_JobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Joboffer_valid.json");

		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_Details_jobOffer_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//User can update all the mandatory field values details of an quotes sent
	@Test(priority=1)
	public void Patch_QoutesSent_AllMandatoryfieldJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Patch_Joboffer2.json");

		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_Details_jobOffer2_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//User can not update all the field values without entering manadatory field values details of an quotes sent
	//don't enter any data in these fields- Job address, Customer Name, Customer Contact Details.
	@Test(priority=1)
	public void Patch_QoutesSent_WithoutMandatoryfieldJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Patch_deleteMandatoryFields_joboffer.json");

		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_Details_jobOffer3_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//User can update all the optional field values details of an quotes sent 
	@Test(priority=1)
	public void Patch_QoutesSent_OptionalfieldValuesJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Patch_OptionalfieldValue.json");
		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_OptionalfieldValue_jobOffer_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test()
	public void Patch_QoutesSent_ReadOnlyValuesJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Patch_OptionalfieldValue.json");
		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_userReadOnlyValue_jobOffer_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//User can edit and Update  the "Offer Question Close Date" of an quotes sent
	@Test()
	public void Patch_QuestionCloseDate_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Q&A.json");

		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_QuestionCloseDate_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//User can edit and Update  the "OfferClose Date" of an quotes sent
	@Test(priority=1)
	public void Patch_OfferCloseDate_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"OfferClose.json");
		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_OfferCloseDate_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//Verify that as an external platform User can edit the "Offer Close Date" of an quotes sent

	//User can edit the "Charge Option" of an quotes sent
	//Update "Labour and Material" Charge
	@Test(priority=1)
	public void Patch_OfferCharge_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"ChargeOption.json");
		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_OfferCloseDate_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	//Verify that as an external platform User can edit Offer Commitment Time out of Outgoing Job Offer details.
	@Test(priority=1)
	public void Patch_ChargrOption_DraftOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath + Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Chargeoption_DraftOffer.json");
		Patch_HTTPMethod_JobOffers_TestMethod http = new Patch_HTTPMethod_JobOffers_TestMethod(proObject);
		Response res=	http.Patch_chargeOption_Draftoffer_AnOutgoing_JobOffer("Joboffer_Details_JobOffer","QA_Token", bodydata);
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	
	
	
	


	


}
