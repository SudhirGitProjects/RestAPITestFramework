package com.cs.TestNGrunners;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	
	@CucumberOptions(features = "src/test/resources/featuresFile", 
	glue = { "com.cs.stepDefination" }, 
	tags = { "@TestId_Validate_01" }, 
	monochrome = true,
	plugin = { 
		"pretty", 
		"pretty:target/cucumber-report/Smoke/pretty.txt",
		"html:target/cucumber-report/Smoke",
		"json:target/cucumber-report/Smoke/cucumber.json",
		"junit:target/cucumber-report/Smoke/cucumber-junitreport.xml",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/Smoke/report.html"})



	public class RunCucumberTests extends AbstractTestNGCucumberTests {

	static Logger log;


	static {
		log = Logger.getLogger(RunCucumberTests.class);
	}

	@AfterTest
	private void test() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", "Windows 10");
        Reporter.setSystemInfo("3.7.1", "Selenium");
        Reporter.setSystemInfo("3.3.9", "Maven");
        Reporter.setSystemInfo("1.8.0_141", "Java Version");
        Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	}
	
}
