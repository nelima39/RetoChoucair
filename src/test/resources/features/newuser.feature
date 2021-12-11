#Autor: Neyla Martinez
#Languaje:es

@stories
Feature: Choucair Academy Technical Challenge
  I want to fill out the registration form in Utest in order to create my username.
  @scenario1
  Scenario: Create my username
    Given nelima wants to fill out the registration form
    When nelima enter the form data - about yourself
      | strName | strLastName | strEmail             | strLanguage | strBirthMonth | strBirthDay | strBirthYear |
      | Neyla   | Martinez    | nelima39@hotmail.com | Spanish     | November      | 28          | 1986         |
    And nelima enter the form data - your address
      | strCity    | strCodePostal| strCountry |
      | Bucaramanga| 680001       | Colombia   |
    Then nelima creates her username
