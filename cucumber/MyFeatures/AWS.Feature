Feature: my validation on DemoWebShop

  Background: Launch the DemoWebShop XY
    Given Application is launched by user XY

  Scenario: user access to register
    Then user click on register
    And provides the valid data
    Then clicks on the register button

  Scenario Outline: user access to Login
    When user enters valid username "<uname>"
    And user enters valid password "<paswd>"
    

    Examples: 
      | uname                   | paswd     |
      | hfgvd456@gmail.com      | sayali    |
      | mayuri@gmail.com        | p123456   |
      | sayalidandare@gmail.com | sayali123 |
