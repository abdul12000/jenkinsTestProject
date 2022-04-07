Feature:

  Scenario Outline:
    Given I am in "<location>"
    When I travel by "<transportType>"
    Then I am in "<newLocation>" from "<location>"
    Examples:
      | location   | transportType | newLocation |
      | London     | road          | Portsmouth  |
      | Manchester | train         | Newcastle   |


  Scenario:
    Given I am in "London"
    When I travel by "road"
    Then I am in "Portsmouth"