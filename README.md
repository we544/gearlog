# GearLog

## The problem
Churches and youth groups lend out shared equipment (sound systems, tents, chairs) but track it in notebooks or by memory. Items go out without a record, come back late, and nobody knows who has what. GearLog records every loan, sets a due date by equipment type, blocks double lending, and calculates late fees.

## How to run
Requirements: Java 17+ and Maven (or open the folder in IntelliJ IDEA and run `App.java`).

    mvn compile exec:java

Then open http://localhost:7070. Data is saved in `data/gearlog.txt` and survives a restart.

## Classes
- `Equipment` (abstract): id, name, availability; due date and late fee calculation.
- `SoundEquipment`, `Furniture`, `Tent`: extend `Equipment` with their own loan days and late fee (polymorphism).
- `Borrower`: id, name, phone, group.
- `Loan`: links an item to a borrower; dates, overdue check, late fee.
- `LendingService`: holds the collections, applies the rules, saves and loads the file.
- `ItemAlreadyLentException`: our own exception for lending an item that is already out.
- `App`: Javalin endpoints and error handling.

## Endpoints
| Method | Path | Purpose |

## Team

| No. | Full Name | Student Number | Part built |
|-----|-----------|----------------|------------|
| 1 | David Mwape | 2410681 | Equipment, SoundEquipment, Furniture, Tent |
| 2 |Katongo Mulenga  | 2300016 | Borrower, Loan |
| 3 |Howard Phiri  |2410167  | LendingService, ItemAlreadyLentException |
| 4 |KAZEMBE JAMES  |  2410097 | App, LendingRequest |
| 5 | Faith Samukonga  | 2410278 | Front end, README |



| GET | /api/equipment | List equipment |
| POST | /api/equipment | Register an item |
| GET | /api/borrowers | List borrowers |
| POST | /api/borrowers | Register a borrower |
| GET | /api/loans | List loans |
| POST | /api/loans | Lend an item |
| PUT | /api/loans/{id}/return | Record a return |
| GET | /api/overdue | List overdue loans |

