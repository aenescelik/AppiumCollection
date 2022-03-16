@longPress
Feature: Api demos
  Scenario: expandable list test
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Views" tiklasin
    When kullanici "Expandable Lists" tiklasin
    When kullanici "1. Custom Adapter" tiklasin
    When kullanici "People Names" tiklasin
    And kullanici 3 saniye bekler
    When kullanici Chuck basili tuttugunda
    Then popup ciktigini onayla