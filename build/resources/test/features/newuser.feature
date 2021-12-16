#Autor: Neyla Martinez

@stories
Feature: Choucair Academy Technical Challenge
  I want to fill out the registration form in Utest in order to create my user.
  @scenario1
  Scenario: Create my user on Utest.com
    Given nelima wants to create her username on Utest.com
    When nelima registers the form data - about you
      | strName | strLastName | strEmail             | strLanguage | strBirthMonth | strBirthDay | strBirthYear |
      | Fabio   | Rojas    | fabiorojas7@hotmail.com | Spanish     | January       | 9           | 1981         |
    And nelima registers the form data - your address
      | strCity     | strCodePostal| strCountry |
      | Cúcuta      | 540001       | Colombia   |
    And nelima registers the form data - your devices
      | strComputer| strVersion| strPcLanguage | strMovil| strMovilModel |strMovilModelSO|
      | Windows    | 10        | Spanish       | Realme  | C3            | Android 10    |
    And nelima registers the form data - Password and checks
      | strPassword  | strCheckUpdate | booleanCheckTermOfUser | booleanPrivacy|
      | UtestNelima86| true           | true                   | true          |
    Then nelima creates her username
      | strMsgWelcome                                                          |
      | Welcome to the world's largest community of freelance software testers!|