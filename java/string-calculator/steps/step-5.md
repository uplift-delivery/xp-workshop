# Step 5

```gherkin
Feature: String Calculator

  Scenario Outline: Negative Numbers are not Allowed
    When string has "<numbers>"
    Then throws <error>
    Examples:
      | numbers                 | error                          |
      | "3,-4,10"               | "negatives not allowed: -4"    |
      | "//;\n12;-5\n8,1\n-7;9" | "negatives not allowed: -5,-7" |
```

# [Continue to Step 6](./step-6.md)