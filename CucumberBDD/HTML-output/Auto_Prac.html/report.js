$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/AutoPrac.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in to automationPractice website",
  "description": "\nDescription: create an account  and sign in successfully at AutomationPractice",
  "id": "sign-in-to-automationpractice-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2460519652,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create an account",
  "description": "",
  "id": "sign-in-to-automationpractice-website;create-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the signIn",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enter\u0027s vaild email to create an account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user fill up the personal information Form",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the register button",
  "keyword": "And "
});
formatter.match({
  "location": "AutoPrac_StepDef.enter_the_url()"
});
formatter.result({
  "duration": 4289532319,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 48033825,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_clicks_on_the_signIn()"
});
formatter.result({
  "duration": 2404143024,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_enter_s_vaild_email_to_create_an_account()"
});
formatter.result({
  "duration": 202427633,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_clicks_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 92666201,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_fill_up_the_personal_information_Form()"
});
formatter.result({
  "duration": 5047344539,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#id_gender1\"}\n  (Session info: chrome\u003d89.0.4389.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MohammadRifatAmins-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:18ae:93a4:c0f0:693e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.82, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: /var/folders/4f/cc1_058d1bn...}, goog:chromeOptions: {debuggerAddress: localhost:54329}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bab302467c90a4ebf762d026421836cc\n*** Element info: {Using\u003did, value\u003did_gender1}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.stepDef.AutoPrac_StepDef.user_fill_up_the_personal_information_Form(AutoPrac_StepDef.java:61)\n\tat ✽.Then user fill up the personal information Form(/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/AutoPrac.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_clicks_on_the_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 137822135,
  "status": "passed"
});
formatter.before({
  "duration": 1444024547,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login to an account",
  "description": "",
  "id": "sign-in-to-automationpractice-website;login-to-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user clicks on the signIn",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enter\u0027s valid email and password",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on the sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoPrac_StepDef.enter_the_url()"
});
formatter.result({
  "duration": 5719314755,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_clicks_on_the_signIn()"
});
formatter.result({
  "duration": 2820572240,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_enter_s_valid_email_and_password()"
});
formatter.result({
  "duration": 334750338,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "duration": 2144809932,
  "status": "passed"
});
formatter.match({
  "location": "AutoPrac_StepDef.login_should_be_successful()"
});
formatter.result({
  "duration": 10111961679,
  "status": "passed"
});
formatter.after({
  "duration": 122745787,
  "status": "passed"
});
});