package com.cs.Restapi;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebServiceHandler {
	
	
	static String bodyOfApi;
	static String endPointUrl;
	static Map<String, String> headers;
	
	public static void setBody(String obtaineddata) {
		 bodyOfApi=obtaineddata;
		
		
	}

	public static void setHeader(List<String> header) {
		
		headers = new HashMap<String, String>();
		header.stream().map(elem -> elem.split(",")).forEach(elem -> headers.put(elem[0], elem[1]));
			
	
	}

	public static void setEndPointUrl(String obtaineddata) {
		endPointUrl=obtaineddata;
		
		
	}
	public static Response postrestcalls(){
	RestAssured.useRelaxedHTTPSValidation();	
	Response response=given().
	auth().none().body(bodyOfApi).headers(headers).
	when().post(endPointUrl).
	then().extract().response();


	//JsonPath jsonPathEvaluator=response.jsonPath();
	//String onemore=jsonPathEvaluator.getString("PromoSearchResponse.PromoSearchResult.PromoSearchResultItem.PromoStartDate");
	//System.out.print(onemore);
	response.prettyPrint();

	return response;

	}







}



