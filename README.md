# Selenium Flight Automation Framework

This repository contains a Selenium automation framework built using **Java, Maven, TestNG, and the Page Object Model (POM)** design pattern.  
The project automates a complete flight search flow on a static travel website and demonstrates core UI automation concepts.

---

## 🔧 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

---

## 📌 Automated Test Scenario

The following flow is automated:

1. Navigate to the flight booking application
2. Select source and destination cities
3. Search for available flights
4. Extract and print the **cheapest** and **second cheapest** flight prices
5. Open a new browser tab within the same session and navigate to Google

---

## 🌐 Website Used

A **static demo travel website** was used for automation to ensure:
- Stable execution
- No flakiness due to popups or dynamic overlays
- Clear demonstration of Selenium fundamentals

> Note: Dynamic real-world travel websites were explored initially to understand practical challenges, but a static site was chosen for reliable automation and clean demonstration of concepts.

---

## 🧱 Framework Design

The framework follows the **Page Object Model (POM)**:

