@TestToRunNext   @lateef
Feature: UKBA Test automation
  As a Tourist/StudentI want to know if I require Visa to come to the UK from my country.
  So that I can make a decision before I travel
  Country and Study
  Country(A) and Tourism
  Country(B) and Tourismhttps://www.gov.uk/check-uk-visa/y

  Background:
    Given I am on UKBA website"https://www.gov.uk/check-uk-visa/y"
@AA
  Scenario: 1_Country and Study
#    Given I provide a nationality of Japan
    Given I provide a nationality of "Japan"
    When I click on Continue button
    And I select the reason as Study
    And I click on Continue button
    And I state that I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You’ll need a visa to study in the UK"

  Scenario: 2_CountryA and Tourism
#    Given I provide a nationality of Japan
    Given I provide a nationality of "Japan"
    When I click on Continue button
    And I select the reason as Tourism
    And I click on Continue button
    Then I should be informed that "You will not need a visa to come to the UK"

  @CountryB
  Scenario: 3_CountryB and Tourism
    Given I provide a nationality of "Russia"
    When I click on Continue button
    And I select the reason as Tourism
    And I click on Continue button
    And I state I am not travelling or visiting a partner or family
    And I click on Continue button
    Then I should be informed that "You’ll need a visa to come to the UK"

#Using Examples
#  @AAA
  Scenario Outline: 4_Country and Study with Outline and Examples
    Given I provide a nationality of "<CountryName>"
    When I click on Continue button
    And I select the reason as Study
    And I click on Continue button
    And I state that I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You’ll need a visa to study in the UK"
    Examples:
      | CountryName |
      | Japan       |
      | Australia   |
      | Canada      |
      | USA         |
#  @AAA
  Scenario Outline: 5_CountryA and Tourism with Outline and Examples
#    Given I provide a nationality of Japan
    Given I provide a nationality of "<CountryName>"
    When I click on Continue button
    And I select the reason as Tourism
    And I click on Continue button
    Then I should be informed that "You will not need a visa to come to the UK"
    Examples:
      | CountryName |
      | Japan       |
      | USA         |
      | Canada      |
      | Malaysia    |
      | Australia   |
  @AAA
  Scenario Outline: 6_CountryB and Tourism with Outline and Exmaples
    Given I provide a nationality of "<CountryName>"
    When I click on Continue button
    And I select the reason as Tourism
    And I click on Continue button
    And I state I am not travelling or visiting a partner or family
    And I click on Continue button
    Then I should be informed that "You’ll need a visa to come to the UK"
    Examples:
      | CountryName |
#      | Russia       |
#      | Cuba         |
      | Belarus      |
      | South Korea    |
#      | Hong Kong   |