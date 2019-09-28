$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sajju/eclipse-workspace/Cucumber/features/SignUpMap.feature");
formatter.feature({
  "line": 1,
  "name": "Test FaceBook Sign Up MAP Page",
  "description": "",
  "id": "test-facebook-sign-up-map-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test with FB Sign Up MAP",
  "description": "",
  "id": "test-facebook-sign-up-map-page;test-with-fb-sign-up-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "we write firname and lasname",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 6
    },
    {
      "cells": [
        "sajju",
        "shrestha"
      ],
      "line": 7
    },
    {
      "cells": [
        "cheri",
        "guna"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be able to signup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpMap.open_chrome()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpMap.we_write_firname_and_lasname(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpMap.I_should_be_able_to_signup()"
});
formatter.result({
  "status": "skipped"
});
});