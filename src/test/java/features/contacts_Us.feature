@test123
Feature: WebDriver University- Contact Us Page

  Scenario: Validate successfull submission- Unique data
    Given I access the webdriver university contact us page
    When user enters the text "webdriver" in the firstname
    And user enters the text "webdriver" in the lastname
    And user enters the text "test123@test.com" in the emailaddress
    And user enters the text "comments" in the comments
    And user enters the text "webdriver" in the lastname
    When user clicks in the "Contacts_Page.submit_button"
    And the text message displays as "Thank You for your Message!"
