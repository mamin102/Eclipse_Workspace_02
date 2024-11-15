$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to facebook with current credential",
  "description": "",
  "id": "facebook-login;login-to-facebook-with-current-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "titile of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters current UserName and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_forFacebookLogin.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 5392872160,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_forFacebookLogin.titile_of_login_page_is_Facebook()"
});
formatter.result({
  "duration": 16114310,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_forFacebookLogin.user_enters_current_UserName_and_password()"
});
formatter.result({
  "duration": 426233638,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_forFacebookLogin.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 129505575,
  "status": "passed"
});
});