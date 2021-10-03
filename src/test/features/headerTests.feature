Feature: Header links
  As a user
  I should get directed appropriately from header

  @headerLink
  Scenario: verify My account link re-direction
    Given I'm on home Page "http://www.next.co.uk"
    When I click on My Account Link
    Then I should get re-directed appropriatley with title "Sign In"

  @headerLink
  Scenario: verify Help link re-direction
    Given I'm on home Page "http://www.next.co.uk"
    When I click on Help Link
    Then I should get re-directed appropriatley with title "Help"

  @headerLink
  Scenario: verify Store Locator link re-direction
    Given I'm on home Page "http://www.next.co.uk"
    When I click on Store Locator Link
    Then I should get re-directed appropriatley with title "Store Locator"