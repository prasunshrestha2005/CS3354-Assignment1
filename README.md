# CS3354 Assignment 1 – Grocery Management System

## Overview
A Java console application that manages a grocery inventory using parallel arrays.
Data for item names, prices, and stock quantities is stored across three synchronized arrays
where the same index refers to the same item.

## Features
- View current inventory
- Restock items by name
- Interactive menu-driven interface

## Project Structure
```
CS3354-Assignment1/
├── GroceryManagement.java   # Main source file
├── docs/                    # Generated Javadoc documentation
└── README.md
```

## How to Compile and Run
```bash
javac GroceryManagement.java
java GroceryManagement
```

## Menu Options
| Option | Action |
|--------|--------|
| 1 | View Inventory |
| 2 | Restock an Item |
| 3 | Exit |

## Javadoc
Pre-generated documentation is available in the `docs/` folder.
Open `docs/index.html` in a browser to view it.

## Git Workflow
Each team member worked on a separate branch:

| Branch | Task |
|--------|------|
| `feature-display` | Task 1 – Inventory Display (`printInventory`) |
| `feature-restock` | Task 2 – Restock & Search (`restockItem`) |
| `feature-menu` | Task 3 – User Menu (main method) |

All branches were merged into `main`.

## Team
CS3354 – Group Assignment
