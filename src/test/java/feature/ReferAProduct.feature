Feature: Refer product
  As a user, I want to refer build your own computer to a friend
  @regression

  Scenario: User should be able to refer a product to a friend successfully

    Given user is already registered
    When user selects computers
    And user selects desktops
    And user selects build your own computer
    And user clicks on email a friend
    And user fills up friends email
    And user click on send email button
    Then user should be able to see the email has been sent

