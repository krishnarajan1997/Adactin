Feature: Checking the adactin hotel booking website

Scenario: Going to check the login page	with valid data
Given user in the login page
When user enter the username and password
And to click the login button
Then verify the page is working


  Scenario: To check searchHotel page
    Given User in the search page of adactin hotel
    When User enter the location and Hotel and RoomType
    And User enter the no of room check in and check out  date
    And User enter the adults and children per room
    Then user Click Search and outcome


  Scenario: To check Select Hotel page
    Given User in the select page of adactin hotel
    When User click button icon in the page
    And click the continue button
    Then User check the outcome

  Scenario: To check Book Hotel page
    Given User send the First Last name and address
    When User send the Credit card no and card Type
    And user set the Expiry month date and CVV no
    And click Book now
    Then user get the invoice no

