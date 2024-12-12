Feature: Hired person process
  As a user
  Want to enter the orangeHRM page
  To hire a person

  Scenario Outline: Enter to page orangeHRM to hire a person
    Given That the user enter home page and login
      | userName   | password   |
      | <userName> | <password> |
    When Full form to register a new candidate
      | firstName   | middleName   | lastName   | email   | contactNumber   | keyWords   | notesAdd   |
      | <firstName> | <middleName> | <lastName> | <email> | <contactNumber> | <keyWords> | <notesAdd> |
    And the candidate continues with the hired process
      | interviewTitle   | interviewer   | date   | notesInterview   |
      | <interviewTitle> | <interviewer> | <date> | <notesInterview> |
    Then Validate candidate status to be hired

    Examples:
      | userName | password | firstName | middleName | lastName | email             | contactNumber | keyWords  | notesAdd | interviewTitle | interviewer | date       | notesInterview   |
      | admin    | admin123 | Test      | test2      | test3    | human@hotmail.com | 3209022       | Candidate | Offered  | Test           | Orange      | 2024-22-12 | Continue Process |


