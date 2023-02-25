# Step 4

```gherkin
Feature: String Calculator

  Scenario Outline: Support Custom Delimiter
    When string has "<numbers>"
    Then returns <sum>
    Examples:
      | numbers               | sum |
      | "//c\n3c4c10"         | 17  |
      | "//;\n12;5\n8,1\n7;9" | 42  |
```

# [Continue to Step 5](./step-5.md)