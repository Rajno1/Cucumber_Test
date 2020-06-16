$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:com.features/login.feature");
formatter.feature({
  "name": "cheching login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "checking the login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "Given "
});
formatter.match({
  "location": "login_Steps.user_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "login_Steps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "login_Steps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user account will direct to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login_Steps.user_account_will_direct_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});