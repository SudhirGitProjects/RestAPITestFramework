$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test1.feature");
formatter.feature({
  "line": 1,
  "name": "testing api of trade tool",
  "description": "",
  "id": "testing-api-of-trade-tool",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10989127,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Loading excel file",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user load the data from Excel sheet \"src\\test\\resources\\fixtureFile\\TestData.xlsx\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "src\\test\\resources\\fixtureFile\\TestData.xlsx",
      "offset": 37
    }
  ],
  "location": "StepDefination.user_load_the_data_from_Excel_sheet(String)"
});
formatter.result({
  "duration": 7148857666,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate the trade",
  "description": "",
  "id": "testing-api-of-trade-tool;validate-the-trade",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@TestId_Validate_01"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "body is loaded from the excel \"#Body\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "headers is loaded from the excel \"#Header1\" and \"#Header2\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user perform the post rest call \"#endPoint_Url\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user verify actual and expected response",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "#Body",
      "offset": 31
    }
  ],
  "location": "StepDefination.body_is_loaded_from_the_excel(String)"
});
