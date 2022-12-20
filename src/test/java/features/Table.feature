 Feature: user navigates to table page of wedriver university

    Scenario: user finds  in the table
      Given user is on table page
#      When user finds the heading "Firstname" in the table page
#      When user finds the heading "Lastname" in the table page
#      When user finds the heading "Age" in the table page
     # When user finds the heading "Firstname" in the table page just for test
      And user finds the heading "Firstname" in the "table_firstname"
      When user finds the heading "Lastname" in the "table_lastname"
      And user finds the heading "Age" in the "table_age"

    Scenario: user finds  a first name and last name in a list with age
       And user "John Smith" present in the page
       And user "John Smith" age is "45"


    Scenario: Pagination functionality
       And user is on pagination "2"
       And user is on pagination "3"
       And user is on pagination "Next"
       And user is on pagination "4"


