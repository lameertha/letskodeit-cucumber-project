$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/learn/letskodeit/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Profile functionality",
  "description": "As a user I want to SignUp Profile successfully in letskodit",
  "id": "signup-profile-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20519828800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should Edit Profile successfully",
  "description": "",
  "id": "signup-profile-functionality;user-should-edit-profile-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on sing Up Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I  enter the below credentials",
  "rows": [
    {
      "cells": [
        "Lameertha Thevarajah",
        "lameethev7@yahoo.co.uk",
        "Lamee@1988",
        "Lamee@1988"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on set teams button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on signUp Button",
  "keyword": "Then "
});
formatter.match({
  "location": "SingUpStepdefs.iAmOnLoginPage()"
});
formatter.result({
  "duration": 1052582300,
  "status": "passed"
});
formatter.match({
  "location": "SingUpStepdefs.iClickOnSingUpPage()"
});
formatter.result({
  "duration": 535829400,
  "status": "passed"
});
formatter.match({
  "location": "SingUpStepdefs.iEnterTheBelowCredentials(DataTable)"
});
formatter.result({
  "duration": 12082273300,
  "status": "passed"
});
formatter.match({
  "location": "SingUpStepdefs.iClickOnSetTeamsButton()"
});
formatter.result({
  "duration": 175664800,
  "status": "passed"
});
formatter.match({
  "location": "SingUpStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 36005866400,
  "status": "passed"
});
formatter.after({
  "duration": 823790000,
  "status": "passed"
});
});