$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dhiva/eclipse-workspace/AmazonBDDwithPOM/src/main/java/com/qa/features/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Login Feature",
  "description": "",
  "id": "amazon-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon Login Test_scenario",
  "description": "",
  "id": "amazon-login-feature;amazon-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters mobile",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on password page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 7204942966,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.title_of_login_page_is_Amazon()"
});
formatter.result({
  "duration": 36331551,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enters_mobile()"
});
formatter.result({
  "duration": 531343,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat com.qa.pages.LoginPage.Button(LoginPage.java:34)\r\n\tat com.qa.StepDefinition.LoginStep.user_enters_mobile(LoginStep.java:40)\r\n\tat ✽.Then user enters mobile(C:/Users/dhiva/eclipse-workspace/AmazonBDDwithPOM/src/main/java/com/qa/features/amazon.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStep.user_is_on_password_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});