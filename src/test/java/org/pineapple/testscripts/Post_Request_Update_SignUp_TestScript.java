package org.pineapple.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Properties;
import org.pineapple.test_steps.Post_Update_SignUP_TestMethod;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import io.restassured.response.Response;
public class Post_Request_Update_SignUp_TestScript {
	//This is the API for making Registration (Post API function) in Subeez application
	@Test(priority=1)
    public void SignUP() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
        String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Signup.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
   }
	
	
	//This is the API for making Registration (Post API function) in Subeez application..all mandatory parameter
	@Test(priority=2)
	public void SignUP_AllMandatoryParameter() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
        String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_Parameter.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
   }
	//This is the API for making Registration (Post API function) in Subeez application..Invalid-token
	@Test(priority=3)
	public void SignUP1_InvalidToken() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_Parameter.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","Inavalid-QAToken");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(401,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..OnlyContactorEmail
	@Test(priority=4)
	
	public void SignUP_OnlyContactorEmail() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_ContractorEmail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
	//This is the API for making Registration (Post API function) in Subeez application..SameInviteEmail
	@Test(priority=5)
	public void SignUP_SameInviteEmail() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_sameInviteEmail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
	}
        
       //This is the API for making Registration (Post API function) in Subeez application..business name
   
	@Test(priority=6)
	public void SignUP_BusinessName() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_BusinessName.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
	
	//This is the API for making Registration (Post API function) in Subeez application..CountryCode
@Test(priority=7)
	
	public void SignUP_CountryCode() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"PassOnlyCountryCode.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
//This is the API for making Registration (Post API function) in Subeez application..BusinessABN
@Test(priority=8)

public void SignUP_BusinessABN() throws IOException {
    String basePath = System.getProperty("user.dir");
    Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
     String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_OnlyBusinessABN.json");
    Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
    Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
    System.out.println(Constant.Response_Status_code+res.statusCode());
    System.out.println(Constant.Response_Data);
    System.out.println(res.asString());
    AssertJUnit.assertEquals(400,res.statusCode());
}
//This is the API for making Registration (Post API function) in Subeez application..email already signup
@Test(priority=12)

public void SignUP_AlreadySignUp() throws IOException {
    String basePath = System.getProperty("user.dir");
    Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
     String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"EmailAreadySignUp.json");
    Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
    Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
    System.out.println(Constant.Response_Status_code+res.statusCode());
    System.out.println(Constant.Response_Data);
    System.out.println(res.asString());
    AssertJUnit.assertEquals(200,res.statusCode());
}

	
	//This is the API for making Registration (Post API function) in Subeez application..webhook notification
	@Test(priority=9)
	public void SignUP_WebhookNotification() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_Webhooknotification.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
   }
	
	
	//This is the API for making Registration (Post API function) in Subeez application..invalid email
	@Test(priority=10)
	public void SignUP_InvalidEmail() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_InvalidEmail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
	//This is the API for making Registration (Post API function) in Subeez application..only business code
	@Test(priority=11)
	public void SignUP_OnlyBusinessCode() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_BusinessCode.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
	
	//This is the API for making Registration (Post API function) in Subeez application..SendInvitation
	@Test(priority=13)
	public void SignUP_SendInvitaton() throws IOException {
		
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_sendInvitation.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
   }
	
	//This is the API for making Registration (Post API function) in Subeez application..InvalidEmailID
	@Test(priority=14)
	public void SignUp_InvalidEmailId() throws IOException {
		
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_InvalidEmail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
   }
	
	//This is the API for making Registration (Post API function) in Subeez application..100InviteEmail
	@Test(priority=15)
	public void SignUP_100InviteEmail() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100InviteMail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..100ContractorEmail
	@Test(priority=16)
	public void SignUP_100ContractorEmail() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"signUp_100ContractorMail.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..100Charracter Of Contractor First Name
	@Test(priority=17)
	public void SignUP_100CharContractorFname() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100CharOfContractorFname.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	//This is the API for making Registration (Post API function) in Subeez application..100Character Of Contractor Middle Name
	@Test(priority=18)
	public void SignUP_100CharContractorMname() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100CharContractorMname.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	//This is the API for making Registration (Post API function) in Subeez application..100Character Of Contractor Of Last Name
	@Test(priority=19)
	public void SignUP_100CharContractorLname() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100CharContractorLname.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..100 Character Of Contractor Phone No.
	@Test(priority=20)
	public void SignUP_100CharContractorPhone() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100CharContractorPhone.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..100 Character Of Contractor Business Name
	@Test(priority=21)
	public void SignUP_100CharContractorBname() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_100CharContractorBname.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	//This is the API for making Registration (Post API function) in Subeez application..Wrong Business Code
	@Test(priority=23)
	public void SignUP_WrongBusinessCode() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject= PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_WrongBusinessCode.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	//This is the API for making Registration (Post API function) in Subeez application..More than 25 character Busniess ABN
	@Test(priority=24)
	public void SignUP_25CharBusinessABN() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_25CharBusinessABN.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..More than 25 character Busniess ACN
	@Test(priority=25)
	public void SignUP_25CharBusinessACN() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_25CharBusinessACN.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(400,res.statusCode());
	}
	
	//This is the API for making Registration (Post API function) in Subeez application..More than 25 character Busniess Address
	@Test(priority=26)
	public void SignUp_500CharContractorBusinessAddress() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_500CharContractorBusinessAddress.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
	}	
	
	//This is the API for making Registration (Post API function) in Subeez application..Enter value in all the parameter 
	@Test(priority=26)
	public void SignUp_AllParameter() throws IOException {
        String basePath = System.getProperty("user.dir");
        Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
         String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_500CharContractorBusinessAddress.json");
        Post_Update_SignUP_TestMethod http = new Post_Update_SignUP_TestMethod(proObject);
        Response res =    http.PostRequest_SignUP_API(bodydata,"signMeendURI","QA_Token");
        System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
        System.out.println(res.asString());
        AssertJUnit.assertEquals(200,res.statusCode());
	}	

}