[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Smart Tourist Booking System
---

## Problem Statement (max 150 words)
This project aims to solve the problem of managing tourist bookings efficiently. 
Traditional systems are manual, time-consuming, and error-prone. Users often face difficulty in selecting destinations, booking trips, and managing travel plans.
The Smart Tourist Booking System provides a digital solution where users can browse tourist spots, make bookings, and manage their trips easily. 
It improves accuracy, saves time, and enhances user experience.
---

## Target User
- Tourists planning trips
- Travel agencies
---

## Core Features
- User registration and management
- Tourist spot selection
- Booking system
- View bookings
- File handling
- Exception handling
---

## OOP Concepts Used

- Abstraction: The project uses abstraction by separating logic into different layers such as service, repository, and model, hiding implementation details from the user.
  
- Exception Handling: Custom exception (BookingException) is used to handle errors like invalid inputs and booking failures.

- Collections: Java Collections such as ArrayList are used to store and manage user and booking data efficiently.
---

## Proposed Architecture Description

The project follows a layered architecture pattern to organize the code into separate responsibilities.

- The **Main layer** acts as the entry point of the application and handles user interaction through the console.
- The **Model layer** contains data classes such as User, Booking, and TouristSpot, which represent the core entities of the system.
- The **Service layer** handles the business logic, such as processing bookings and managing operations.
- The **Repository layer** is responsible for storing and retrieving data, acting as a bridge between the service layer and data source.
- The **Utility layer** provides helper functionalities such as file handling and common operations.
- The **Exception layer** manages error handling using custom exceptions like BookingException.
This layered approach improves code organization, modularity, and makes the system easier to maintain and extend.
---

## How to Run
1. Open the project in VS Code
2. Open terminal in VS Code  
   (Terminal → New Terminal)
3. Navigate to src folder:
   cd src
4. Compile the program:
   javac main/Main.java
5. Run the program:
   java main.Main
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
