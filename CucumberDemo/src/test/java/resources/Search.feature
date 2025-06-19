Feature: Validate search functionality

  Scenario: Search a product
    Given User is on the Amazon homepage
    And Amazon searchbox is displayed
    When User search for product "Apple MacBook Pro"
    Then Product with name "Apple MacBook Pro" should be displayed


Scenario: Book Uber
    Given User is on the Uber App
    When User give pickup location as "Rajabazar" and drop location as "Hataira"
    When User select "Go" car and price is 500
    Then User is able to book cab successfully


