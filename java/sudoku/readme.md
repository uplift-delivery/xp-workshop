# Sudoku

## Scenarios

```gherkin
Scenario: Empty Board
   Given a sudoku board with all zeros
   When the board is checked
   Then the solution is invalid

Scenario: Partially Completed Board
   Given a sudoku board with some zeros
   When the board is checked 
   Then the solution is invalid

Scenario: Completed Board w/ Duplicate Numbers in Column
   Given a sudoku board with duplicate numbers in a column
   When the board is checked
   Then the solution is invalid

Scenario: Completed Board w/ Duplicate Numbers in Row
   Given a sudoku board with duplicate numbers in a row
   When the board is checked
   Then the solution is invalid

Scenario: Completed Board w/ Duplicate Numbers in a 3x3 group
   Given a sudoku board with duplicate numbers in a 3x3 group
   When the board is checked
   Then the solution is invalid

Scenario: Completed Board w/ Duplicate Numbers in Row
   Given a sudoku board with unique numbers in each column
   And unique numbers in each row
   And unique numbers in each 3x3 group
   When the board is checked
   Then the solution is valid
```

## Rules

1. Grid shall be 9x9
2. The grid shall contain 9 - 3x3 grids
3. Players must place the numbers 1-9 in each:
   1. Column
   2. Row
   3. 3x3 Grid
4. Players may not repeat any single number in any:
   1. Column
   2. Row
   3. 3x3 Grid

## Sample Board

![](/Users/bryce/projects/uplift/xp-workshop/java/sudoku/sample_board.jpg)