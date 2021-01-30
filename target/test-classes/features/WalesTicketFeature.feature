Feature: NHS Wales Test Ticket page

  @test
  Scenario: To get NHS Costs Free or Not
    Given I go to url https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start
    When the user clicks on the Start button
    And the user select the Country as Wales and click on the next button
    And The user enter valid date of birth as '16 01 1988'
    And The user Select live with a partner option as Yes and click on next button
    And The user select claim any benefits or tax credits option as No and click on next button
    And The user selects pregnancy option as No and click on next option
    And The user Selects Illness caused by serving in armed forces as No and click on Next
    And The user Selects Having Diabetes option as No and Click on Next Button
    And The user Selects Having Glaucoma option as No and click on Next Button
    And The user select they Live in Care Homes Permanently option as No
    And The user Selects Savings investments option as No and click on Next Button
    Then Should get help from the NHS costs ' You get help with NHS costs '
#..




