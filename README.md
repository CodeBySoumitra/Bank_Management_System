# Bank Management System (Java)

A console-based Bank Management System built in Java, developed incrementally to practice core OOP concepts — one concept learned and applied per day, from classes and objects up through collections, exception handling, file/DB persistence, and multithreading.

> 🚧 **Status:** In progress — currently through Day 6 (Collections) of a 12-day build plan.

---

## Features (so far)

- Create accounts with a constructor-based setup, including an overloaded constructor for default opening balance
- Encapsulated account state — no direct field access, all changes go through validated methods (via a protected `adjustBalance()` helper)
- Two account types via inheritance: `SavingsAccount` (interest-bearing) and `CurrentAccount` (overdraft-enabled)
- Polymorphic behavior — each account type calculates interest and handles withdrawals differently
- Overloaded deposit method supporting an optional remark
- `Account` is abstract and implements a `Transactable` interface (`deposit`/`withdraw` contract)
- Centralized `Bank` service managing multiple accounts of mixed types in an `ArrayList<Account>` — supports opening, finding, closing, and listing all accounts

**Planned (upcoming days):**
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
│           ├── model/
│           │   ├── Account.java          # abstract
│           │   ├── SavingsAccount.java
│           │   └── CurrentAccount.java
│           ├── interfaces/
│           │   └── Transactable.java
│           └── service/
│               └── Bank.java              # manages accounts via ArrayList
├── data/              # (added Day 9 — file persistence)
├── lib/               # (added Day 10 — JDBC driver)
└── README.md
```

---

## How to Run

```bash
# from the src/ directory
javac com/bank/Main.java com/bank/model/*.java com/bank/interfaces/*.java com/bank/service/*.java
java com.bank.Main
```

---

## Sample Output

```
Account opened: SB1001
Account opened: CA1001
Account No: SB1001
Holder: Leo
Balance: 5000.0
---
Account No: CA1001
Holder: Riya
Balance: 10000.0
---
Deposited 500.0. New balance: 5500.0
Account closed: CA1001
Account No: SB1001
Holder: Leo
Balance: 5500.0
---
```

---

## Development Log

| Day | Concept | Added |
|---|---|---|
| 1 | Classes, Objects, Constructors | `Account` base class |
| 2 | Encapsulation | Private fields, getters, validated `deposit()`/`withdraw()` |
| 3 | Inheritance | `SavingsAccount`, `CurrentAccount` |
| 4 | Polymorphism | Overridden `withdraw()`/`calculateInterest()`, overloaded `deposit()` |
| 5 | Abstraction | Abstract `Account`, `Transactable` interface, fixed overdraft bug via `adjustBalance()` |
| 6 | Collections | `Bank` service class managing accounts via `ArrayList<Account>` |
| 7 | Exception Handling | *coming up* |
| 8 | Strings & Validation | *coming up* |
| 9 | File I/O | *coming up* |
| 10 | JDBC | *coming up* |
| 11 | Multithreading | *coming up* |
| 12 | CLI Integration | *coming up* |

---

## Author

Leo — B.Tech CSE student, built as a portfolio/learning project.