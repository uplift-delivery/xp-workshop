# Step 1

```gherkin
Feature: String Calculator

  Scenario: Empty String
    When string is empty
    Then returns zero

  Scenario Outline: Single Number in String
    When string has a single "<number>"
    Then returns <sum>
    Examples:
      | number | sum |
      | "5"    | 5   |
      | "12"   | 12  |

  Scenario Outline: Two Numbers in String
    When string has "<numbers>"
    Then returns <sum>
    Examples:
      | numbers | sum |
      | "3,4"   | 7   |
      | "12,5"  | 17  |
```

# [Continue to Step 2](./step-2.md)