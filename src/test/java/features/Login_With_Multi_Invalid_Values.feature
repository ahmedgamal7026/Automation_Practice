
Feature: Validating Login Function With Multi Values
 
 Scenario Outline: check login is successfull with valid Data only and not the invalid Data
 

    Given the user is navigated to the website
    When the user enters invalid "<Username>",invalid "<Password>"
    Then A validation message will be displayed
    
    Examples: 
      | Username        |     Password      |
      | Admin           |    InvalidPass    |
      | InvalidUserName |     admin123      |
      |									|										|
