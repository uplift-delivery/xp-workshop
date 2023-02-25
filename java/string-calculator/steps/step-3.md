# Step 3

```gherkin
Feature: String Calculator

  Scenario Outline: Support Newline Delimiter
    When string has "<numbers>"
    Then returns <sum>
    Examples:
      | numbers          | sum |
      | "3,4\n10"        | 17  |
      | "12,5\n8,1\n7,9" | 42  |
```

# [Continue to Step 4](./step-4.md)