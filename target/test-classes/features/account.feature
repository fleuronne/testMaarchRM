@account
Feature: Account
  As a visitor of the maaarch website
  I want to be able to see and update my account details

  Background: pre-requisites
    Given i open maarch page

  @acc01
  Scenario Outline: acc01 - Login
#    When User clicks sign in button
    When User enters name address "<name>"
    When User enters password "<password>"
    When User clicks to the login button
    Then Verify that the user is connected
    Examples:
      | name | password |
      |  superadmin   |   superadmin      |

#  @acc02
#  Scenario: acc02 - Logout
#    Given I am logged in on the site with <"superadmin"> and <"superadmin">
#    When I click the Log out button
#    Then I receive feedback that I am logged out
#    And I cannot visit my account page anymore



