@smoke
Feature: Courses Test
  As user I want to search the courses

  Scenario:User should navigate to courses page successfully
    Given I am on homepage
    When I mouse hover on courses tab
    And I click on courses search
    Then I should navigate to courses page successfully

  Scenario: User should search and apply course successfully
    Given I am on homepage
    When I mouse hover on courses tab
    And I click on courses search
    And I search course "Immunology"
    And I should search courses successfully
    And I click on Undergraduate Certificate in Immunology
    And I click on apply now
    And I enter email
    And I enter password
    Then I click on login



#  Scenario: User should search and apply course successfully
#    Given I am on homepage
#    When I mouse hover on courses tab
#    And I click on courses search
#    And I search course "Immunology"
#    And I should search courses successfully
#    And I click on Undergraduate Certificate in Immunology
#    And I click on apply now
#    And I click on register
#    And I fill the register form
#    Then I click to complete Register






