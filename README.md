# Bank Management System

A console-based Bank Management System developed in Java that simulates core banking operations such as account creation, deposits, withdrawals, fund transfers, and transaction tracking.

The project demonstrates Object-Oriented Programming (OOP) principles, Java Collections Framework, abstraction, interfaces, and transaction management. It is being extended with exception handling, persistence, multithreading, and database integration.

---

## Key Features

### Account Management
- Open new bank accounts
- Search accounts by account number
- Display account details
- Close existing accounts

### Banking Operations
- Deposit funds
- Withdraw funds
- Transfer money between accounts
- Balance validation before transactions

### Transaction Tracking
- Maintain transaction history for each account
- Record deposits, withdrawals, and transfers
- Timestamp-based transaction logs using Java Time API

### Account Types
- **Savings Account**
    - Interest calculation support
- **Current Account**
    - Overdraft-enabled withdrawal handling

---

## Object-Oriented Design

### Encapsulation
Account data is protected using private fields and accessed through controlled methods.

### Inheritance
Specialized account types extend a common abstract `Account` class.

### Polymorphism
Account-specific behaviors such as withdrawal handling and interest calculation are implemented through method overriding.

### Abstraction
The `Account` class defines common banking behavior while allowing subclasses to provide specific implementations.

### Interface-Based Design
The `Transactable` interface enforces a common contract for deposit and withdrawal operations.

---

## Technologies Used

- Java 17+
- Java Collections Framework (`ArrayList`)
- Java Time API (`LocalDateTime`)
- OOP Principles

### Planned Technologies
- JDBC
- MySQL
- Java Serialization
- Multithreading

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
        └── service/
            └── Bank.java
```

---

## Core Classes

### Account
Abstract base class containing:

- Account Number
- Account Holder Name
- Balance
- Transaction History

Provides:

- Deposit
- Withdraw
- Balance Management
- Transaction Tracking

### SavingsAccount
Extends `Account` and provides savings-specific interest calculations.

### CurrentAccount
Extends `Account` and supports overdraft functionality.

### Bank
Acts as the service layer responsible for:

- Opening accounts
- Searching accounts
- Closing accounts
- Managing multiple accounts
- Fund transfers

---

## Sample Workflow

```text
Open Account
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

## Future Enhancements

- Custom Exception Handling
- Input Validation using Regex
- File-Based Persistence
- MySQL Database Integration (JDBC)
- Concurrent Transaction Processing
- Menu-Driven Command Line Interface
- Unit Testing with JUnit

---

## Learning Outcomes

This project demonstrates practical experience with:

- Object-Oriented Programming
- Collections Framework
- Interface-Based Design
- Transaction Management
- Java Best Practices
- Clean Code Structure
- Service Layer Architecture

---

## Author

**Soumitra Das**  
B.Tech Computer Science & Engineering

Java-based portfolio project focused on building real-world backend programming skills and understanding software design fundamentals.