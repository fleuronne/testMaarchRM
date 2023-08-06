@adduser
Feature: add user
  the user have possibilities to create user in the system

  Background: pre-requisites
    Given i open maarch page
  @adduser01
  Scenario Outline: add user in system
#    Given User is on the home page
    When User enters name login "<nom>"
    And User enters password login "<pwd>"
    And User clicks to the login button login
    And User click in administrateur
#    When User click in securite
#    When User click in user
#    When User enters name login "<nom>"
#    When User enters password login "<pwd>"
#    When User clicks to the login button login
    And USer click in button add
    And user enter identifiant "<ident>"
    And User enters password "<password>"
    And User confirm password "<confirm>"
    And User enters name "<name>"
    And User click plus button name
    And User enters address "<mail>"
    And User click to role users
    And User select role
    And User click in service
    And User choice service"<service>"
    And User click plus button service
    When User click in save button
#    Then User see a list users
#    And User can open user to see list user
    Examples:
      |nom|pwd|ident|password|confirm|name|mail|service|
      |superadmin|superadmin|1123|1234| 1234 |vinny |vinny@gmail.com|dev|