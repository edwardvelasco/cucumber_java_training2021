$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Cucumber_Java_Training/src/test/java/Features/LoginToFB.feature");
formatter.feature({
  "line": 1,
  "name": "Login to FaceBook - Story Card",
  "description": "Description user input",
  "id": "login-to-facebook---story-card",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to FB and Validate Welcome message",
  "description": "",
  "id": "login-to-facebook---story-card;login-to-fb-and-validate-welcome-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user validate welcome message",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout to FB 1",
  "keyword": "* "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "* "
});
formatter.match({
  "location": "LoginToFBSteps.user_is_on_Facebook_login_page()"
});
formatter.result({
  "duration": 6243094880,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFBSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 10620901913,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFBSteps.user_clicks_login_button()"
});
formatter.result({
  "duration": 5572161695,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFBSteps.user_validate_welcome_message()"
});
formatter.result({
  "duration": 5569510361,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginToFBSteps.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});