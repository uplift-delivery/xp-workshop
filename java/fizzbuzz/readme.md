# FizzBuzz

## Rules

```gherkin
Scenario: Divisible by 3
When number is 6
Then result is 'Fizz'
  
Scenario: Divisible by 5
When number is 10
Then result is 'Buzz'

Scenario: Divisible by 3 and 5
When number is 15
Then result is 'FizzBuzz'
  
Scenario: Other Numbers
When number is 4
Then result is '4'
```