Feature: BlazeDemo purchase flights

  @Blaze
  Scenario Outline:  Choosing Departure and destination Cities and finding flights
    Given I am on the Welcome to Simple Travel Agency landing page
    When I choose the "<departureCity>" and "<destinationCity>" from the drop down
    Then I should be able to see "<departureCity>" and "<destinationCity>" on the BlazeDemo reserve page
    Examples:
      | departureCity | destinationCity |
      | Boston        | Rome            |
      | Boston        | New York        |
      | Portland      | Cairo           |

  @Blaze
  Scenario Outline:  TASK -- Purchase flights
    Given I am on the Welcome to Simple Travel Agency landing page
    When I choose the "<departureCity>" and "<destinationCity>" from the drop down on the landing page
    And I choose the first fligh from the reserve page
    And I click Purchase Flight button on the Purchase page
    Then "Thank you for your purchase today!" message is displayed on the confirmation page
    Examples:
      | departureCity | destinationCity |
      | Portland      | London          |
