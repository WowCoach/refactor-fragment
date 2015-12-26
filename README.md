refactor-fragment
=================

give examples to show how to refactor properly

## [MarsRover Docs](./docs/ROVER.md)



## [Code Smells](https://sourcemaking.com/refactoring/smells)
##### Bloaters
- Long Method
- Large Class
- Primitive Obsession
- Long Parameter List
- Data Clumps

##### Object-Orientation Abusers
- Switch Statements
- Temporary Field
- Refused Bequest
- Alternative Classes with Different Interfaces

##### Change Preventers
- Divergent Change
- Shotgun Surgery
- Parallel Inheritance Hierarchies

##### Dispensables
- Comments
- Duplicate Code
- Lazy Class
- Data Class
- Dead Code
- Speculative Generality

##### Couplers
- Feature Envy
- Inappropriate Intimacy
- Message Chains
- Middle Man
- Incomplete Library Class


## [Refactorings](https://sourcemaking.com/refactoring)
##### Composing Methods
- Extract Method
- Inline Method
- Inline Temp
- Introduce Explaining Variable
- Remove Assignments to Parameters
- Replace Method with Method Object
- Replace Temp with Query
- Split Temporary Variable
- Substitute Algorithm

##### Moving Features Between Objects
- Extract Class
- Hide Delegate
- Inline Class
- Introduce Foreign Method
- Introduce Local Extension
- Move Field
- Move Method
- Remove Middle Man

##### Organizing Data
- Change Bidirectional Association to Unidirectional
- Change Reference to Value
- Change Unidirectional Association to Bidirectional
- Change Value to Reference
- Duplicate Observed Data
- Encapsulate Collection
- Encapsulate Field
- Replace Array with Object
- Replace Data Value with Object
- Replace Magic Number with Symbolic Constant
- Replace Record with Data Class
- Replace Subclass with Fields
- Replace Type Code with Class
- Replace Type Code with State/Strategy
- Replace Type Code with Subclasses
- Self Encapsulate Field

##### Simplifying Conditional Expressions
- Consolidate Conditional Expression
- Consolidate Duplicate Conditional Fragments
- Decompose Conditional
- Introduce Assertion
- Introduce Null Object
- Remove Control Flag
- Replace Conditional with Polymorphism
- Replace Nested Conditional with Guard Clauses

##### Making Method Calls Simpler
- Add Parameter
- Encapsulate Downcast
- Hide Method
- Introduce Parameter Object
- Parameterize Method
- Preserve Whole Object
- Remove Parameter
- Remove Setting Method
- Rename Method
- Replace Constructor with Factory Method
- Replace Error Code with Exception
- Replace Exception with Test
- Replace Parameter with Explicit Methods
- Replace Parameter with Method
- Separate Query from Modifier

##### Dealing with Generalization
- Collapse Hierarchy
- Extract Interface
- Extract Subclass
- Extract Superclass
- Form Template Method
- Pull Up Constructor Body
- Pull Up Field
- Pull Up Method
- Push Down Field
- Push Down Method
- Replace Delegation with Inheritance
- Replace Inheritance with Delegation
