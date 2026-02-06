# 🧪 Testing_UiTestingPlayGround

A **Java-based UI automation project** built around the **UI Testing Playground** website using **Selenium WebDriver**, **Selenium Grid**, and **GitHub Actions CI**.

The main purpose of this repository is **not only automation**, but to simulate real-world testing challenges — including tricky UI behaviors, unstable elements, and features that are intentionally harder to test. The goal is to gain practical experience solving problems testers commonly face in real projects.

---

## 🚀 Overview

This project demonstrates a clean and practical UI testing setup that supports:

* ✅ Local execution with Selenium WebDriver
* 🌐 Distributed execution with Selenium Grid
* 🔄 Continuous testing via GitHub Actions
* 🧩 Practice with difficult UI testing scenarios

Rather than being a “perfect” test suite, this project focuses on learning how to handle **edge cases, dynamic UI elements, and real testing obstacles**.

---

## 🧰 Tech Stack

* Java
* Selenium WebDriver
* Selenium Grid
* GitHub Actions

---

## ⚙️ Getting Started

Clone the repository:

```
git clone <your-repository-url>
cd Testing_UiTestingPlayGround
```

Install dependencies using your build tool:

```
mvn install
```

Make sure a supported browser is installed and the UI Playground application is accessible before running tests.

---

## ▶️ Running Tests Locally

Run the test suite from the terminal:

```
mvn test
```

Tests will execute using a **local WebDriver instance**.

---

## 🌐 Running Tests with Selenium Grid

Start a Selenium Grid instance first.

**Standalone mode:**

```
java -jar selenium-server-<version>.jar standalone
```

Grid UI will be available at:

```
http://localhost:4444/ui
```

Configure the project to use the remote WebDriver URL:

```
http://localhost:4444
```

Then run:

```
mvn test
```
