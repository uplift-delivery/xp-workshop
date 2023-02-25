# Step 2

```gherkin
Feature: String Calculator

  Scenario Outline: Unlimited Amount of Numbers
    When string has "<numbers>"
    Then returns <sum>
    Examples:
      | numbers        | sum |
      | "3,4,10"       | 17  |
      | "12,5,8,1,7,9" | 42  |
```