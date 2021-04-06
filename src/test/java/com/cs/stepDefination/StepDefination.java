package com.cs.stepDefination;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.cs.ExcelRead.DataSourceDecider;
import com.cs.ExcelRead.ExcelRead;
import com.cs.Restapi.WebServiceHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class StepDefination {
	static Logger log =LogManager.getLogger(StepDefination.class);
	@Given("^user load the data from Excel sheet \"([^\"]*)\"$")
	public void user_load_the_data_from_Excel_sheet(String arg1) throws Throwable {
		ExcelRead.loadExcelFileData(arg1);
	   
	}

	@Given("^body is loaded from the excel \"([^\"]*)\"$")
	public void body_is_loaded_from_the_excel(String arg1) throws Throwable {
		String Obtaineddata =DataSourceDecider.dataFinder(arg1);
		WebServiceHandler.setBody(Obtaineddata);
	}

	@Given("^headers is loaded from the excel \"([^\"]*)\" and \"([^\"]*)\"$")
	public void headers_is_loaded_from_the_excel_and(String arg1, String arg2) throws Throwable {
		List<String> header= new ArrayList<String>();
		String Obtaineddata =DataSourceDecider.dataFinder(arg1);
		String Obtaineddata1 =DataSourceDecider.dataFinder(arg2);
		header.add(Obtaineddata);
		header.add(Obtaineddata1);
		WebServiceHandler.setHeader(header);
		
	}

	@When("^user perform the post rest call \"([^\"]*)\"$")
	public void user_perform_the_post_rest_call(String arg1) throws Throwable {
		String Obtaineddata =DataSourceDecider.dataFinder(arg1);
		WebServiceHandler.setEndPointUrl(Obtaineddata);
		WebServiceHandler.postrestcalls();
	 
	}
	@Then("^user verify actual and expected response$")
	public void user_verify_actual_and_expected_response() throws Throwable {
	
		Response response=WebServiceHandler.postrestcalls();
		response.getBody().jsonPath().get("status").equals("SUCCESS");
		try {
		response.getBody().jsonPath().get("messages").equals(null);}
		catch(NullPointerException n) {
			log.info(n.toString());
		}
		
	}

}
