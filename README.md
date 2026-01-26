# Testing_UiTestingPlayGround

This project is an automated UI testing setup for a UI Playground web application built using Selenium and Selenium WebDriver, with support for Selenium Grid and continuous integration via GitHub Actions.

To get started, clone the repository and install the project dependencies using the package manager or build tool defined in the project (for example npm install, mvn test, gradle test, or pip install -r requirements.txt). Make sure a supported browser is installed and that the UI Playground application is accessible before running any tests.

Tests can be executed locally from the terminal using the standard test command for the project (such as npm test, mvn test, gradle test, or pytest). These tests run using a local WebDriver instance on your machine.

To run tests using Selenium Grid, first start a Grid instance and configure the tests to use a remote WebDriver URL, commonly http://localhost:4444. This can be done via environment variables or a configuration file, after which the same test command can be used to execute the tests from the terminal.

Selenium Grid can be downloaded as a standalone Selenium Server JAR from the official Selenium releases. It can be started locally in standalone mode using java -jar selenium-server-<version>.jar standalone, which launches both the hub and node and provides access to the Grid UI at http://localhost:4444/ui. Alternatively, the Grid can be run in hub and node mode by starting the hub first and then connecting one or more nodes to it.

The project also includes a GitHub Actions workflow that automatically runs the test suite on pushes and pull requests, providing continuous integration and fast feedback on test results.