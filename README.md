# Static Calculator
Through the terminal interface, the user can enter integer values, and the calculator returns the following results: sum, arithmetic mean, geometric mean, variance, standard deviation, range, and a randomly selected number among the values entered by the user.

Additionally, the user can specify the quantity of numbers to generate using the following algorithms: Fibonacci, factorial, and prime numbers.


## Concepts Studied
- Interfaces
- Abstract Classes
- Collections
- CLI interaction


## Classes and Interfaces
**Main** -
Entry point of the application. Responsible for starting the program and initializing the menu.

**Menu** -
Handles the CLI interaction with the user. Displays options and routes user input to the appropriate functionality.

**StatisticsCalculator** -
Responsible for performing statistical calculations such as sum, arithmetic mean, geometric mean, variance, standard deviation, and range.

**StatisticsUtils** -
Utility class containing helper methods used by the statistical calculations.

**NumberGenerator** - 
Interface that defines the contract for number generation algorithms such as Fibonacci, factorial, and prime numbers.

**AbstractNumberGenerator** -
Abstract class that provides shared behavior and validation for number generation algorithms.

**FibonacciGenerator** -
Implementation of the NumberGenerator interface that generates the Fibonacci sequence.

**FactorialGenerator** -
Implementation responsible for generating factorial values.

**PrimeNumberGenerator** -
Implementation responsible for generating prime numbers.

**RandomSelector** -
Responsible for selecting a random number from the values entered by the user.



## Program Flow
1. User enters integer values in the terminal
2. Values are stored in a collection
3. The calculator performs statistical calculations
4. The user can also generate numbers using:
   - Fibonacci
   - Factorial
   - Prime numbers


## Program Structure
```
src/
 ├── app/
 │    └── Main.java
 │
 ├── cli/
 │    └── Menu.java
 │
 ├── statistics/
 │    ├── StatisticsCalculator.java
 │    └── StatisticsUtils.java
 │
 ├── generators/
 │    ├── NumberGenerator.java
 │    ├── AbstractNumberGenerator.java
 │    ├── FibonacciGenerator.java
 │    ├── FactorialGenerator.java
 │    └── PrimeNumberGenerator.java
 │
 └── utils/
      └── RandomSelector.java
```


## Development Log
You can follow the project development here:
[Development Log](DEVELOPMENT_LOG.md)