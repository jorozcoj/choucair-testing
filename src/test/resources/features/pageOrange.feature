Feature: Hired person process
  As a user
  Want to enter the orangeHRM page
  To hire a person

  Scenario Outline: Enter to page orangeHRM to hire a person
    Given That the user enter home page and login
    |userName   |password  |
    |<userName> |<password>|
    When Full form to register a new candidate
    |firstName  |lastName  |email  |contactNumber|
    |<firstName>|<lastName>|<email>|<contactNumber>|
    Then Validate candidate status to be hired

    Examples:
    |userName|password|firstName|lastName|email|contactNumber|
    | admin | admin123|Jhorman  | Orozco |jhorman@hotmail.com| 3209022|

