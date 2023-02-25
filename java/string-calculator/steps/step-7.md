# Step 7

```gherkin
Feature: String Calculator

  Scenario Outline: Multi-Character Delimiters
    When string has "<numbers>"
    Then throws <sum>
    Examples:
      | numbers                                   | sum |
      | "//[the]\n3the1000the10"                  | 13  |
      | "//[*****]\n12*****5\n1000,1\n7*****1000" | 25  |
```

# [Continue to Step 8](./step-8.md)