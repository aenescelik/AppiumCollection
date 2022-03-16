@x
Feature: apidemis
  Scenario: hazir method kullanimi
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Preference" tiklasin
    When kullanici "3. Preference dependencies" tiklasin
    And kullanici checkbox tik atsin
    When kullanici "WiFi settings" tiklasin
    And kullanici kutiya yazi gondersin "test"
    And kullanici 2 saniye bekler
    Then kullanici OK tiklasin
    And kullanici sayfayi kapatir