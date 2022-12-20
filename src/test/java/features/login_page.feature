@test123

Feature: user wants to login the page with credentials

  Background:
    Given user is on the login page

  Scenario: Enter Valid credentials

    And user enters the text "webdriver" in the username
    And user enters the text "webdriver123" in the password
    And user clicks the "submit_button"
    Then the "validation succeeded" text displays
    And user enters the text "webdriver" in the "Login_Page.name_textBox"
    And user enters the text "webdriver123" in the "Login_Page.password_textBox"




  Scenario: Enter Invalid Credentials
    And user enters the text "webdriverInvalid" in the username
    And user enters the text "webdriver1234" in the password
    And user clicks the "submit_button"
    Then the "validation failed" text displays
##    And user enters the text "userdoesnotexits" in the username
##    And user enters the text "webdriver123" in the password
##    And user clicks the "submit_button"
##    Then the "validation failed" text displays

#
##  @smoke
    Scenario Outline: Check some other scenario for login button
      And user enters the text <username> in the username
      And user enters the text <password> in the password
      And user clicks the "submit_button"
      Then the <logintextmessage> text displays
##      Given user is on the login page
##      And user enters the text <username> in the username
##      And user enters the text <password> in the password
##      And user clicks the "submit_button"
##      Then the <logintextmessage> text displays
#
#

      Examples:
      |username|password|logintextmessage|
      |"qwerty"|"12345"|"validation failed"|
      |""|"12345rw"|"validation failed"|
#      |"sdsdasd"|""|"validation failed"|
#     |"dsasdas"|"dsssd"|"validation failed"|
#      |""|""|"validation failed"|






