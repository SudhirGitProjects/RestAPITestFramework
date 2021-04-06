package com.cs.stepDefination;

import org.apache.log4j.Logger;

import com.cs.ExcelRead.ExcelRead;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
		static Logger log;
	

	static {
		log = Logger.getLogger(CucumberHooks.class);
	}

	@Before
	public void intialiseTags(Scenario scenario) {
		ExcelRead.tagNames(scenario);
	
}
	@After
	public void resetTags(Scenario scenario) {
		ExcelRead.tags.clear();
		ExcelRead.testIdNumber.clear();
	
}
}
