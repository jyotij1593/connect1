#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Welcome To Maveric Connect
  
Scenario: launch browser
Given The user is in connect login page

  @tag1
  Scenario Outline: Login to connect
    Given The user enter username as "<username>" and password as "<password>" 
    When The user click the login button
    Then The user enter to connect homepage
    And click the logout button
    #And The user quit the connect
    
   
    Examples: 
      | username  | password |
      |salmasultanam |Maveric@956611051|
      |jyotij|jo@connect2210|
