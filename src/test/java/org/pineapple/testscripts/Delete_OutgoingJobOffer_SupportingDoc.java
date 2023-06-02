package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.pineapple.test_steps.Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod;
import io.restassured.response.Response;
//Code Status-- OK
public class Delete_OutgoingJobOffer_SupportingDoc {
	@Test()
	 //Verify that I am able to remove a scope document 
    public  void Delete_OutgoingJobOffer_SupportingDocument() throws IOException{
        String basePath = System.getProperty("user.dir");
        Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
        Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod http=new Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(proObject);
        Response res =http.Delete_httpMethod_OutgoingJobOffer_SupportingDocument("DeleteSupportingDocDetails", "QA_Token");
        System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.getStatusCode());
}
//Verify that user should not be able to remove a scope document if user enter an invalid external business Id
	@Test(priority=2)
	  public  void Delete_invalidbusinessId_SupportingDocument() throws IOException{
	        String basePath = System.getProperty("user.dir");
	        Properties proObject =    PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
	        Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod http=new Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(proObject);
	        Response res =http.Delete_httpMethod_InvalidExternalBusinessId_SupportingDocument("DeleteSupportingDocDetails", "QA_Token");
	        System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
	        System.out.println(res.asString());
	        AssertJUnit.assertEquals(400,res.getStatusCode());
	}
	//Verify that user should not be able to remove a scope document if user enter an invalid Job Offer Id
	@Test(priority=3)
	  public  void Delete_InvalidJobOffer_SupportingDocument() throws IOException{
	        String basePath = System.getProperty("user.dir");
	        Properties proObject =    PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
	        Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod http=new Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(proObject);
	        Response res =http.Delete_httpMethod_InvalidJobofferId_SupportingDocument("DeleteSupportingDocDetails", "QA_Token");
	        System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
	        System.out.println(res.asString());
	        AssertJUnit.assertEquals(400,res.getStatusCode());
	}
	//Verify that user should not be able to remove a scope document if user enter an invalid external business Id and  invalid Job Offer Id
	
	@Test(priority=4)
	  public  void Delete_Invalidexternal_InvalidjobofferId_SupportingDocument() throws IOException{
	        String basePath = System.getProperty("user.dir");
	        Properties proObject =    PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
	        Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod http=new Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(proObject);
	        Response res =http.Delete_httpMethod_InvalidexternalBusiness_InvalidJobofferId_SupportingDocument("DeleteSupportingDocDetails", "QA_Token");
	        System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
	        System.out.println(res.asString());
	        AssertJUnit.assertEquals(400,res.getStatusCode());
	}
	//Verify that user should not be able to remove a scope document if  user don't enter the docID/attach document
	@Test(priority=5)
	  public  void RemoveDocID_SupportingDocument() throws IOException{
	        String basePath = System.getProperty("user.dir");
	        Properties proObject =    PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
	        Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod http=new Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(proObject);
	        Response res =http.Delete_httpMethod_RemoveDocId_SupportingDocument("DeleteSupportingDocDetails", "QA_Token");
	        System.out.println(Constant.Response_Status_code);
	        System.out.println(res.statusCode());
	        System.out.println(Constant.Response_Data);
	        System.out.println(res.asString());
	        AssertJUnit.assertEquals(400,res.getStatusCode());
	}
	}
