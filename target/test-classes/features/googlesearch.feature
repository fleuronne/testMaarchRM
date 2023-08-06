@google_search
Feature: Google Search
  As a user I want to test google search function

  Background: pre-requisites
    Given I open google search page

  Scenario: Basic Search

    When I lookup The word "selenium"
    Then search rewrite display the word "selenium"
