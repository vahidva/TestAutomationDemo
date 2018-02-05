@demo.domain

Feature: As a user I should be able to navigate to all pages

@demo.domain.navigate
Scenario: Navigate to all pages
  Given I launch the "Domain" website

  When I navigate to "Rent" page
  And I navigate to "Buy" page
  When I navigate to "New Homes" page
  And I wait for 2 seconds
  Then I select New House and Land
  And I wait for 2 seconds
  And I select Land
  And I wait for 2 seconds
  And I select New Home Designs
  And I wait for 2 seconds
  And I select Townhouses
  And I wait for 2 seconds
  And I navigate to "Sold" page
  And I navigate to "Commercial" page
  And I navigate back
  And I navigate to "News" page from News Menu
  And I navigate to "Advice" page from News Menu
  And I navigate to "Living" page from News Menu
  And I navigate to "Money & Markets" page from News Menu
  And I navigate to "Video" page from News Menu
  And I navigate back
  And I navigate to "Agents" page
  And I navigate to "Share" page from More Menu

  @demo.domain.user
  Scenario: Navigate to all pages
    Given I launch the "Domain" website
    And I navigate to "Sign in" page
    When I sign in with username "vahidtestemail@mailinator.com" and passwork "Domain1234"
    Then I sign out
