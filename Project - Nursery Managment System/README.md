# **Project : Nursery Management System**
In the following documentation I have added my approach to complete this project
## 1.Understanding the Problem
### What the system supposed to do?
- customer can buy plants   
- Nursery Manager can manage plants
- Inventory of plants
- Generate monthly sales reports

### Main Actors
Customer, manager, Plant
### Operations
- customer can getPlantList, buy a plant
- manager can add, remove or update a plant data
- monthly reports can be generated

## 2.Identification of classes and objects
**Classes:** Plant (indoor or outdoor plants), Customer, Manager, Order, Inventory, Report Generator

## 3.Finding Relationships
- **Is-a (inheritance)**
Plant -> IndoorPlant, OutdoorPlant
- **Has-a()**
- **Uses()**
Manager -> Plant, ReportGenerator, Inventory

## 4.Defining properties and methods
#### Plant
**properties:** name, price, category
**methods:** displayInfo()
#### Customer 
**properties:** email, ID
**methods:** orderHistory()
#### Order 
**properties:** date, amount, customerId,  
**methods:** placeOrder()
#### NurseryManager 
**properties:**
**methods:** addPlant(), removePlant(), updatePlant()
#### Inventory
**properties:** amountOfPlants, totalOutdoorPlants, totalIndoorPlants
**methods:** getIndoorPlants(), getOutdoorPlants()
#### ReportGenerator
**properties:**
**methods:** generateSales(), generateInventoryReport(), getIndoorPlants(), getOutdoorPlants()
#### IndoorPlant
**properties:** lightRequirement, temperature, maintainencelevel 
**methods:** displayInfo()
#### OutdoorPlant
**properties:** lightRequirement, wateringFrequency 
**methods:** displayInfo()

## Applying Design Principles

## Sequence Diagrams
### Diagram 1 - Customer interaction
[!Sequence Diagram 1](assets/Sequence%20diagram%202.png)

### Diagram 2 - Nursery Manager interaction
[!Sequence Diagram 1](assets/Sequence%20diagram%201.png)