$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Test leaf test case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "001_Login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Load browser and enter URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.load_browser_and_enter_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_username_as_DemoCSR()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_password_as_crmsfa()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.Test.enter_password_as_crmsfa(Test.java:32)\r\n\tat ✽.Enter password as crmsfa(file:src/test/java/features/doc.feature:7)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Test.click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click CRMSFA link",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.click_CRMSFA_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "002_Creat Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click CreatLead link",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter Companyname as \u003ccname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter First Name as \u003cfname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Last name as \u003clname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Choose Direct Mail as Source",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Creat Lead link button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "cname",
        "fname",
        "lname"
      ]
    },
    {
      "cells": [
        "abc",
        "Hema",
        "Mali"
      ]
    },
    {
      "cells": [
        "XYX",
        "Harish",
        "Manik"
      ]
    }
  ]
});
formatter.scenario({
  "name": "002_Creat Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click CreatLead link",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.click_CreatLead_link()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.Test.click_CreatLead_link(Test.java:50)\r\n\tat ✽.Click CreatLead link(file:src/test/java/features/doc.feature:13)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Enter Companyname as abc",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_Companyname_as_cname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter First Name as Hema",
  "keyword": "When "
});
formatter.match({
  "location": "Test.enter_First_Name_as_fname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Last name as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_Last_name_as_lname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choose Direct Mail as Source",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.choose_Direct_Mail_as_Source()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Creat Lead link button",
  "keyword": "And "
});
formatter.match({
  "location": "Test.click_Creat_Lead_link_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "002_Creat Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click CreatLead link",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.click_CreatLead_link()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.Test.click_CreatLead_link(Test.java:50)\r\n\tat ✽.Click CreatLead link(file:src/test/java/features/doc.feature:13)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Enter Companyname as XYX",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_Companyname_as_cname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter First Name as Harish",
  "keyword": "When "
});
formatter.match({
  "location": "Test.enter_First_Name_as_fname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Last name as Manik",
  "keyword": "And "
});
formatter.match({
  "location": "Test.enter_Last_name_as_lname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choose Direct Mail as Source",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.choose_Direct_Mail_as_Source()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Creat Lead link button",
  "keyword": "And "
});
formatter.match({
  "location": "Test.click_Creat_Lead_link_button()"
});
formatter.result({
  "status": "skipped"
});
});