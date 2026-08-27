# Bank Management System (Java)

A console-based Bank Management System built in Java, developed incrementally to practice core OOP concepts — one concept learned and applied per day, from classes and objects up through collections, exception handling, file/DB persistence, and multithreading.

> 🚧 **Status:** In progress — currently through Day 4 (Polymorphism) of a 12-day build plan.

---

## Features (so far)

- Create accounts with a constructor-based setup, including an overloaded constructor for default opening balance
- Encapsulated account state — no direct field access, all changes go through validated methods
- Two account types via inheritance: `SavingsAccount` (interest-bearing) and `CurrentAccount` (overdraft-enabled)
- Polymorphic behavior — each account type calculates interest and handles withdrawals differently
- Overloaded deposit method supporting an optional remark

**Planned (upcoming days):**
- Abstract base class + `Transactable` interface
- Centralized `Bank` service managing all accounts via a `HashMap`
- Custom exceptions for invalid operations (`InsufficientFundsException`, `AccountNotFoundException`)
- Input validation via regex, auto-generated account numbers
- Persistent storage — file serialization, then JDBC/MySQL
- Thread-safe transactions with `synchronized`
- Menu-driven CLI tying everything together

---

## Tech Stack

- **Language:** Java (JDK 17+ recommended)
- **Build:** plain `javac`/`java` (no build tool required yet)
- **Planned:** MySQL + JDBC for persistence (Day 10)

---

## Project Structure

```
BankManagementSystem/
├── src/
│   └── com/
│       └── bank/
│           ├── Main.java
│           └── model/
│               ├── Account.java
│               ├── SavingsAccount.java
│               └── CurrentAccount.java
├── data/              # (added Day 9 — file persistence)
├── lib/               # (added Day 10 — JDBC driver)
└── README.md
```

---

## How to Run

```bash
# from the src/ directory
javac com/bank/Main.java com/bank/model/*.java
java com.bank.Main
```

---

## Sample Output

```
Deposited 1000.0. New balance: 6000.0
Remark: Salary credit
Interest: 270.0
Withdrew 11500.0. New balance: -1500.0
Account No: CA1001
Holder: Riya
Balance: -1500.0
```

---

## Development Log

| Day | Concept | Added |
|---|---|---|
| 1 | Classes, Objects, Constructors | `Account` base class |
| 2 | Encapsulation | Private fields, getters, validated `deposit()`/`withdraw()` |
| 3 | Inheritance | `SavingsAccount`, `CurrentAccount` |
| 4 | Polymorphism | Overridden `withdraw()`/`calculateInterest()`, overloaded `deposit()` |
| 5 | Abstraction | *coming up* |
| 6 | Collections | *coming up* |
| 7 | Exception Handling | *coming up* |
| 8 | Strings & Validation | *coming up* |
| 9 | File I/O | *coming up* |
| 10 | JDBC | *coming up* |
| 11 | Multithreading | *coming up* |
| 12 | CLI Integration | *coming up* |

---

## Author

Soumitra Das — B.Tech CSE student, built as a portfolio/learning project.