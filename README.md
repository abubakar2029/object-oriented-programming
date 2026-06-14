# Nursery Management System

## About This Project

I designed and built this system myself over several days. I started by understanding what the nursery needed to do, which entities belonged in the model, and how they related to each other. I iterated on the design over time — refining classes, relationships, and diagrams as my understanding of object-oriented programming grew. This was a passion project to learn OOP properly, not a tutorial follow-along.

**What it does:** customers browse and buy plants; a nursery manager maintains inventory; the system generates inventory and sales reports.

**Core entities:** `Plant` (with `IndoorPlant` / `OutdoorPlant`), `Customer`, `Order`, `Inventory`, `NurseryManager`, `ReportGenerator`

**OOP concepts used:** inheritance, polymorphism, encapsulation, singleton pattern, enums, and class associations.

## Diagrams

![Class Diagram](./Project%20-%20Nursery%20Management%20System/assets/classDiagram.png)

![Customer flow](./Project%20-%20Nursery%20Management%20System/assets/Sequence%20diagram%202.png) ![Manager flow](./Project%20-%20Nursery%20Management%20System/assets/Sequence%20diagram%201.png)

## How to Run

```bash
cd "Project - Nursery Management System/src"
javac Main.java models/*.java enums/*.java
java Main
```

![User Interface](./Project%20-%20Nursery%20Management%20System/assets/interface.png)

## OOP Learning Notes

This repo also includes my personal OOP study modules under `OOP Learning/` — covering the four pillars, generics, exceptions, interfaces, and design patterns.
