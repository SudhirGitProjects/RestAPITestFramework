Feature: testing api of trade tool
  
  Background: Loading excel file 
   Given user load the data from Excel sheet "src\test\resources\fixtureFile\TestData.xlsx"
 
 @TestId_Validate_01
  Scenario: Validate the trade
   
    Given body is loaded from the excel "#Body"
    Given headers is loaded from the excel "#Header1" and "#Header2"
    When user perform the post rest call "#endPoint_Url"
    Then user verify actual and expected response

 
