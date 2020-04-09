$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/webtest.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8236714970,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Prerequisite for executing your scenarios within this feature file"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Browser is triggered",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Check if browser is started",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Home page is launched",
  "keyword": "And "
});
formatter.match({
  "location": "preRequisite.validate_the_browser()"
});
formatter.result({
  "duration": 2993400311,
  "status": "passed"
});
formatter.match({
  "location": "preRequisite.browser_is_triggered()"
});
formatter.result({
  "duration": 2746040848,
  "status": "passed"
});
formatter.match({
  "location": "preRequisite.check_if_browser_is_started()"
});
formatter.result({
  "duration": 432214,
  "status": "passed"
});
formatter.match({
  "location": "preRequisite.home_page_is_launched()"
});
formatter.result({
  "duration": 105813,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#using tags"
    }
  ],
  "line": 14,
  "name": "Login using Username and Pwd",
  "description": "",
  "id": "login-to-application;login-using-username-and-pwd",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Makemytrip"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on Main page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "enter \"Username\" and \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Payment successful page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Username displayed on the top right corner",
  "keyword": "And "
});
formatter.match({
  "location": "webTestSteps.user_is_on_Main_page()"
});
formatter.result({
  "duration": 2714030,
  "status": "passed"
});
formatter.match({
  "location": "webTestSteps.user_click_on_Login_button()"
});
formatter.result({
  "duration": 26454,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "webTestSteps.payment_successful_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "webTestSteps.username_displayed_on_the_top_right_corner()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 90027,
  "status": "passed"
});
});