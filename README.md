# Bank Management System

A console-based Bank Management System developed in Java that simulates core banking operations such as account creation, deposits, withdrawals, fund transfers, and transaction tracking.

The project is designed using Object-Oriented Programming principles and demonstrates concepts including inheritance, polymorphism, abstraction, interfaces, collections, and custom exception handling.

---

## Features

### Account Management
- Open new bank accounts
- Search accounts using account number
- Display account details
- Close existing accounts

### Banking Operations
- Deposit funds
- Withdraw funds
- Transfer money between accounts
- Balance validation before transactions

### Transaction Tracking
- Maintain transaction history for every account
- Record deposits, withdrawals, and transfers
- Timestamp-based transaction logs using `LocalDateTime`

### Account Types
#### Savings Account
- Interest calculation support

#### Current Account
- Overdraft-enabled withdrawal functionality

### Exception Handling
- Custom business exceptions
- Graceful error handling
- Validation of banking operations

Implemented custom exceptions:

- `InvalidAmountException`
- `InsufficientFundsException`
- `AccountNotFoundException`

---

## OOP Concepts Demonstrated

### Encapsulation
Sensitive account information is protected using private fields and controlled access methods.

### Inheritance
`SavingsAccount` and `CurrentAccount` inherit common functionality from the abstract `Account` class.

### Polymorphism
Account-specific behaviors are implemented through method overriding.

### Abstraction
The abstract `Account` class defines shared banking operations while allowing specialized implementations.

### Interfaces
The `Transactable` interface enforces a common contract for deposit and withdrawal operations.

### Exception Handling
Business rule violations are handled through custom exceptions instead of generic error messages.

---

## Technologies Used

- Java 17+
- Java Collections Framework (`ArrayList`)
- Java Time API (`LocalDateTime`)
- Custom Exception Handling
- Object-Oriented Programming

### Planned Technologies

- File Handling (Serialization)
- JDBC
- MySQL
- Multithreading
- JUnit Testing

---

## Project Structure

```text
src/
└── com/
    └── bank/
        ├── Main.java
        │
        ├── model/
        │   ├── Account.java
        │   ├── SavingsAccount.java
        │   └── CurrentAccount.java
        │
        ├── interfaces/
        │   └── Transactable.java
        │
        ├── service/
        │   └── Bank.java
        │
        └── exception/
            ├── InvalidAmountException.java
            ├── InsufficientFundsException.java
            └── AccountNotFoundException.java
```

---

## Core Components

### Account
Abstract base class responsible for:

- Account information
- Balance management
- Transaction history
- Deposit and withdrawal operations

### SavingsAccount
Provides savings-specific interest calculation.

### CurrentAccount
Supports overdraft functionality and current-account-specific behavior.

### Bank
Acts as the service layer responsible for:

- Opening accounts
- Searching accounts
- Closing accounts
- Managing multiple accounts
- Fund transfers

### Custom Exceptions
Provide meaningful business-level error reporting and improve system reliability.

---

## Sample Workflow

```text
Create Account
      ↓
Deposit Funds
      ↓
Withdraw Funds
      ↓
Transfer Funds
      ↓
View Transaction History
      ↓
Close Account
```

---

## Exception Scenarios

### Invalid Deposit

```java
acc.deposit(-500);
```

Output:

```text
InvalidAmountException:
Deposit amount must be greater than zero
```

### Insufficient Balance

```java
acc.withdraw(50000);
```

Output:

```text
InsufficientFundsException:
Insufficient balance
```

### Invalid Account Transfer

```java
bank.fundTransfer(
    "SB999",
    "CA101",
    1000
);
```

Output:

```text
AccountNotFoundException:
Sender account not found
```

---

## Learning Outcomes

This project demonstrates practical understanding of:

- Object-Oriented Programming
- Collections Framework
- Service Layer Design
- Interface-Based Architecture
- Transaction Management
- Custom Exception Handling
- Clean Code Practices
- Banking Domain Logic

---

## Future Enhancements

- Regex-based input validation
- Auto-generated account numbers
- File-based persistence
- MySQL database integration using JDBC
- Concurrent transaction processing
- Menu-driven command-line interface
- Unit testing with JUnit

---

## Development Progress

| Day | Concept | Status |
|------|----------|----------|
| 1 | Classes, Objects, Constructors | ✅ |
| 2 | Encapsulation | ✅ |
| 3 | Inheritance | ✅ |
| 4 | Polymorphism | ✅ |
| 5 | Abstraction & Interfaces | ✅ |
| 6 | Collections, Fund Transfer & Transaction History | ✅ |
| 7 | Custom Exception Handling | ✅ |
| 8 | Strings & Validation | ⏳ |
| 9 | File I/O | ⏳ |
| 10 | JDBC & MySQL | ⏳ |
| 11 | Multithreading | ⏳ |
| 12 | CLI Integration | ⏳ |

---

## Author

**Soumitra Das**  
B.Tech Computer Science & Engineering

A Java-based portfolio project focused on applying software engineering principles and backend development concepts through a real-world banking system.