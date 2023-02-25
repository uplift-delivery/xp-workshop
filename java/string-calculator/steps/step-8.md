# Step 8

```gherkin
Feature: String Calculator

  Scenario Outline: Multiple Delimiters
    When string has "<numbers>"
    Then throws <sum>
    Examples:
      | numbers                                    | sum |
      | "//[the][kata]\n3the1000kata10"            | 13  |
      | "//[*****][!!]\n12!!5\n1000,1\n7*****1000" | 25  |
```