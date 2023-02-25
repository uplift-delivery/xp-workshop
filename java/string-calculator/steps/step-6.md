# Step 6

```gherkin
Feature: String Calculator

  Scenario Outline: Ignore Large Numbers
    When string has "<numbers>"
    Then throws <sum>
    Examples:
      | numbers                     | sum |
      | "3,1000,10"                 | 13  |
      | "//;\n12;5\n1000,1\n7;1000" | 25  |
```

# [Continue to Step 7](./step-7.md)