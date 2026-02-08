# 🧪 UI Testing Playground Automation Framework

A **containerized UI automation framework** built with **Java**, **Selenium WebDriver**, and **Selenium Grid**, designed to practice solving real-world automation challenges using the [UI Testing Playground](https://uitestingplayground.com/).

This repository demonstrates how to design and run UI tests in **local**, **distributed**, and **CI environments** while handling intentionally difficult UI scenarios such as dynamic elements, unstable locators, and timing issues.

---

## 🚀 Project Highlights

- 🔹 Java + Selenium WebDriver automation framework
- 🔹 Selenium Grid support for remote execution
- 🔹 Dockerized test environment (reproducible setup)
- 🔹 Headless browser execution
- 🔹 GitHub Actions CI integration
- 🔹 Focus on real testing problems instead of “happy path” demos

This project emphasizes **practical automation engineering**, not just writing passing tests.

---

## 🧰 Tech Stack

- Java
- Selenium WebDriver
- Selenium Grid
- Docker & Docker Compose
- Maven
- GitHub Actions

---

## 🏗️ Architecture Overview

The framework supports multiple execution strategies:

| Mode | Description |
|---|---|
| Local WebDriver | Runs tests using a locally installed browser |
| Selenium Grid | Executes tests remotely via Grid |
| Dockerized Execution | Runs Selenium + tests in isolated containers |
| CI Pipeline | Automated runs through GitHub Actions |

Tests automatically switch between **local** and **remote** drivers based on configuration.

---

## ⚙️ Setup

Clone the repository:

```bash
git clone <your-repository-url>
cd Testing_UiTestingPlayGround
```

Install dependencies:

```bash
mvn install
```

---

## ▶️ Run Tests Locally

```bash
mvn test
```

Uses a local WebDriver instance.

---

## 🌐 Run with Selenium Grid

Start Selenium Grid:

```bash
java -jar selenium-server-<version>.jar standalone
```

Grid UI:

```
http://localhost:4444/ui
```

Run tests:

```bash
mvn test
```

---

## 🐳 Run with Docker (Recommended)

The project includes a fully containerized execution setup.

### Requirements

- Docker Desktop

### Run tests

```bash
docker compose up --build --abort-on-container-exit
```

This command will:

- build the Maven test container
- start Selenium Chrome
- execute the full test suite

### Cleanup

```bash
docker compose down
```

No local browser or driver installation is required.

---

## 🔄 Continuous Integration

GitHub Actions runs the automation suite in a CI pipeline to simulate real-world workflows:

- headless execution
- remote WebDriver usage
- automated verification on push

---

## 🎯 Goals of the Project

Unlike demo automation projects, this repository focuses on developing skills needed for real QA automation roles:

- Handling unstable UI behaviors
- Designing resilient locators
- Managing synchronization issues
- Running tests in distributed environments
- Creating reproducible execution setups

---

## 📌 Why This Project Exists

UI Testing Playground intentionally provides challenging automation scenarios.  
This framework serves as a sandbox for experimenting with:

- advanced Selenium techniques
- automation architecture decisions
- CI/CD integration
- containerized testing workflows

---

## 👨‍💻 Author

Created as part of a continuous learning journey in automation engineering and test framework design.
