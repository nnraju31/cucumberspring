@feature2
Feature: This is feature 2 of our project
  Background: back ground executes before every scenario and it is optional
    Given I have logged into my application or I have set up test region
  @scenario1
    Scenario: This scenario is to call a Rest URL and validate the response code
      Given I got all details required to call rest service
      When I will call the rest URL
      Then Call should be successful and response body should have valid data
