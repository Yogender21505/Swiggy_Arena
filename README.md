# Swiggy Arena

## Overview

Swiggy Arena is a Java application that simulates a Magical Arena where players engage in turn-based combat. Each player has attributes such as health, strength, and attack, and they battle using dice rolls to determine damage and defense.

## Project Structure


- Swiggy_Arena/
  - src/
    - main/
      - com/
        - swiggy_arena/
          - Player.java
          - Die.java
          - Arena.java
          - Main.java
    - test/
      - com/
        - swiggy_arena/
          - PlayerTest.java
          - DieTest.java
          - ArenaTest.java

## Tech Stack

- **Language**: Java
- **Testing Framework**: JUnit

## How to Run

### Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)

### Steps to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Yogender21505/Swiggy_Arena.git
   cd Swiggy_Arena
2. **Compile the Java files:**
      ```bash
   # Compile main classes
    javac src/main/com/swiggy_arena/*.java

    # Compile test classes (if needed)
    javac -cp src/main src/test/com/swiggy_arena/*.java
3. **Run the application:**
      ```bash
      java -cp src/main com.swiggy_arena.Main
  This will execute the Swiggy Arena simulation.

## Running Unit Tests

### Steps to Run Tests

1. **Compile test classes (if not already compiled):**

   ```bash
   javac -cp src/main src/test/com/swiggy_arena/*.java
2. **Run all unit tests:**
      ```bash
   java -cp src/main:src/test org.junit.runner.JUnitCore com.swiggy_arena.PlayerTest com.swiggy_arena.DieTest com.swiggy_arena.ArenaTest

## Successfull Test Cases

Successfully passed unit tests will be indicated by the following output:
1. **PlayerTest:**
   
   ![image](https://github.com/Yogender21505/Swiggy_Arena/assets/104339650/ae1aab07-d9cf-46ce-962a-94273a6c15e0)

3. **DieTest:**
   
   ![image](https://github.com/Yogender21505/Swiggy_Arena/assets/104339650/e5a1906b-10c2-48ff-bd7b-f1441a345fdd)

5. **ArenaTest**
   
   ![image](https://github.com/Yogender21505/Swiggy_Arena/assets/104339650/15739c4d-999b-4a44-91ad-2807c31c46d2)
### Thank you so much for visiting in my repository.
