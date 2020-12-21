$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Featurefile/OrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "user login into OrangeHRM application",
  "description": "",
  "id": "user-login-into-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registered user try to login into the application successfully",
  "description": "",
  "id": "user-login-into-orangehrm-application;registered-user-try-to-login-into-the-application-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user hits the application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user hits the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should see the login name as expected",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-login-into-orangehrm-application;registered-user-try-to-login-into-the-application-successfully;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "user-login-into-orangehrm-application;registered-user-try-to-login-into-the-application-successfully;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 11,
      "id": "user-login-into-orangehrm-application;registered-user-try-to-login-into-the-application-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Registered user try to login into the application successfully",
  "description": "",
  "id": "user-login-into-orangehrm-application;registered-user-try-to-login-into-the-application-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user hits the application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the username \"Admin\" and password \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user hits the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should see the login name as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.openbrowser()"
});
formatter.result({
  "duration": 8680328400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 26
    },
    {
      "val": "admin123",
      "offset": 47
    }
  ],
  "location": "Stepdefination.user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 512386200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_hits_the_login_button()"
});
formatter.result({
  "duration": 1869803800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.loginusername()"
});
formatter.result({
  "duration": 504335700,
  "status": "passed"
});
});