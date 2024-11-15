$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/target.feature");
formatter.feature({
  "line": 1,
  "name": "Search items",
  "description": "",
  "id": "search-items",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5627079206,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "open browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Given user opens the chrome browser"
    }
  ],
  "line": 5,
  "name": "user is on the homepage of target",
  "keyword": "When "
});
formatter.match({
  "location": "Target_StepDefinition.user_is_on_the_homepage_of_target()"
});
formatter.result({
  "duration": 11465786590,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "search item from home page",
  "description": "",
  "id": "search-items;search-item-from-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    },
    {
      "line": 7,
      "name": "@RegressionTest"
    },
    {
      "line": 7,
      "name": "@End2EndTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user enters the currect url",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "search desire item on search box",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be on the searched page",
  "keyword": "Then "
});
formatter.match({
  "location": "Target_StepDefinition.user_enters_the_currect_url()"
});
formatter.result({
  "duration": 791855843,
  "status": "passed"
});
formatter.match({
  "location": "Target_StepDefinition.search_desire_item_on_search_box()"
});
formatter.result({
  "duration": 1538015846,
  "status": "passed"
});
formatter.match({
  "location": "Target_StepDefinition.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 752461447,
  "status": "passed"
});
formatter.match({
  "location": "Target_StepDefinition.user_should_be_on_the_searched_page()"
});
formatter.result({
  "duration": 6192152787,
  "status": "passed"
});
formatter.after({
  "duration": 410109041,
  "status": "passed"
});
});