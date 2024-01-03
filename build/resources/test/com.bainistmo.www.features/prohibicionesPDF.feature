Feature: the user validate the PDF

  Scenario Outline: User wants to test the website
    Given that user access successfully to the <website>
    When the user go to the fee and fees section
    Then validates that pdf is correct <urlPDF>
    Examples:
      | website                                                | urlPDF                                                                                                                                                                    |
      | https://www.banistmo.com/wps/portal/banistmo/personas/ | https://www.banistmo.com/wps/wcm/connect/www.banistmo.com11237/7b900517-9baa-4eac-aa23-3adeb561600e/ProhibicionesSuperIntendenciaDeBancosSIB.pdf?MOD=AJPERES&CVID=lPXjRcF |