Feature: demo for background

Background: Launch the DemoWebShop XY
Given Application is launched by user XY

Scenario: user access to register XY
  
    Given user click on register XY
    And provides the valid data to register
    Then click on the register button
    
    Scenario Outline: user access for Login
   
    Given user enters va;id username "<uname">
    And user enters valid password "<paswd">
    Then verify the login status

    Examples: 
      | uname                   | paswd     |
      | hfgvd456@gmail.com      | sayali    |
      | mayuri@gmail.com        |    123456 |
      | sayalidandare@gmail.com | sayali123 |
