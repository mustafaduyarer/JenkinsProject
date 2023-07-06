$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_013.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "US",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user sayafaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US_013.userSayafayaGider()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});