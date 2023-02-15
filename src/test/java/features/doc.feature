Feature: Test leaf test case

Scenario: 001_Login functionality

Given Load browser and enter URL
And Enter username as DemoCSR
And Enter password as crmsfa
When Click login button 
Then Click CRMSFA link

Scenario Outline: 002_Creat Lead

Given Click CreatLead link
And Enter Companyname as <cname>
When Enter First Name as <fname>
And Enter Last name as <lname>
Then Choose Direct Mail as Source
And Click Creat Lead link button 

Examples:
|cname|fname|lname|
|abc|Hema|Mali|
|XYX|Harish|Manik|