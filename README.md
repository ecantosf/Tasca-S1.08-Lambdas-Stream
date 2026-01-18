# Lambdas & Stream Exercises 

## Description
Lambda expressions and the Streams API are two of the most powerful additions 
introduced in Java 8. These features enable the writing of more concise, expressive, 
and declarative code, making data manipulation clearer and more efficient.

In this task, you will learn to transform, filter, and sort collections using lambda 
expressions, as well as how to utilize functional interfaces to define reusable 
behaviors. You will also discover how to combine these tools to write functional and 
readable code, bringing you closer to widely adopted paradigms in modern development.
  
## Exercise Statement
Level 1: At this level you will become familiar with lambda expressions and the basic 
use of the Streams API for working with collections. You will learn to filter, 
transform, and sort data in a much more concise way than with traditional loops. You 
will also begin to understand how Functional Interfaces allow behaviors to be 
encapsulated. This is the first step toward thinking in more declarative code.
For all exercises, the Java 8+ Lambdas and Streams API must be used.

### Implementation
 - Ex.1: Use filter(country -> country.toLowerCase().contains("o")) and forEach() 
 to display countries with 'o'.
- Ex.2: Chain filter() with conditions country.toLowerCase().contains("o") && 
country.length() == 5.
- Ex.3: Use forEach(month -> System.out.println(month)) to iterate through 
months list.
- Ex.4: Replace lambda with method reference forEach(System.out::println).
- Ex.5: Implement PiValueProvider interface with lambda: () -> 3.1415.
- Ex.6: Sort with sort((o1, o2) -> Integer.compare(o1.toString().length(), 
o2.toString().length())).
- Ex.7: Reverse comparator parameters: sort((o1, o2) -> Integer.compare
(o2.toString().length(), o1.toString().length())).

### Key concepts demostrated
- Ex.1: Stream filtering with lambda predicates and forEach terminal operation.
- Ex.2: Multiple filter conditions with logical operators in lambda expressions.
- Ex.3: Lambda expressions as Consumer parameter for forEach iteration.
- Ex.4: Method references as concise alternative to simple lambdas.
- Ex.5: Custom functional interface implementation using lambda expressions.
- Ex.6: Custom comparator using lambda for sorting by string length.
- Ex.7: Descending order sorting by swapping comparator parameters.
- Ex.8: Functional interface with parameter and return value using lambda.

## Features
- Interactive console menu for exercise selection and execution
- Complete implementation of all 8 Level 1 exercises
- Reusable functional interfaces for common operations
- Clean separation of data generation, processing, and presentation
- Input validation and user-friendly interface
- Option to run all exercises sequentially

## Technologies
- Language: Java
- IDE: IntelliJ IDEA (Community Extension version)
- Version Control: Git

## Installation and Execution
1. Create GitHub repository
2. Open the project in IntelliJ IDEA.
3. Configure JDK (Java 21 or later recommended).
4. Run the main class of each exercise directly from the IDE.
5. To run tests (if applicable)

## Demo
No aplicable.

## Diagrams and Technical Decisions
No aplicable.