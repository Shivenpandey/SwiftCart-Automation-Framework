# eCommerce-POM-Automation

![Java](https://img.shields.io/badge/Java-11-orange?style=for-the-badge)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-7.x-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-3.x-blue?style=for-the-badge)
![RestAssured](https://img.shields.io/badge/RestAssured-5.x-green?style=for-the-badge)
![ExtentReports](https://img.shields.io/badge/ExtentReports-5.x-purple?style=for-the-badge)

## 📌 About The Project

A production-grade hybrid test automation framework built completely from scratch using Selenium 4 + Java + TestNG following Page Object Model design pattern. Automates complete eCommerce flows on [SauceDemo](https://www.saucedemo.com) including Login, Products, Cart and end-to-end Checkout with REST API validation using RestAssured.

---

## 🛠 Tech Stack

| Technology | Version | Purpose |
|-----------|---------|---------|
| Java | 11 | Programming Language |
| Selenium WebDriver | 4.x | UI Automation |
| TestNG | 7.x | Test Framework |
| RestAssured | 5.x | API Testing |
| Maven | 3.x | Build Tool |
| Extent Reports | 5.x | HTML Reporting |
| WebDriverManager | 5.x | Driver Management |
| Git + GitHub | - | Version Control |

---

## 📁 Project Structure

```
eCommerce-POM-Automation/
│
├── src/main/java/
│   ├── base/
│   │   ├── DriverFactory.java
│   │   └── BasePage.java
│   └── pages/
│       ├── LoginPage.java
│       ├── ProductsPage.java
│       ├── CartPage.java
│       └── CheckoutPage.java
│
├── src/test/java/
│   ├── base/
│   │   └── BaseTest.java
│   ├── tests/
│   │   ├── LoginTest.java
│   │   ├── ProductTest.java
│   │   ├── CartTest.java
│   │   └── CheckoutTest.java
│   ├── api/
│   │   ├── ApiConfig.java
│   │   ├── ApiTest.java
│   │   └── pojo/
│   │       └── UserPojo.java
│   └── utils/
│       ├── ConfigReader.java
│       ├── ExtentReportManager.java
│       ├── ScreenshotUtils.java
│       └── TestListener.java
│
├── src/test/resources/
│   └── config.properties
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## ✅ Test Coverage

### UI Tests — SauceDemo.com

| Module | Test Cases | Count | Status |
|--------|-----------|-------|--------|
| Login | Valid login, Invalid login, Locked user, Empty fields | 4 | ✅ |
| Products | Page load, Add to cart, Sort A-Z, Sort Z-A, Sort by price, Multiple items | 6 | ✅ |
| Cart | Verify item, Remove item, Item count, Continue shopping | 4 | ✅ |
| Checkout | Complete E2E, Empty first name, Empty last name, Empty postal, Order summary | 5 | ✅ |

### API Tests — reqres.in

| Method | Endpoint | Test Case | Status |
|--------|---------|-----------|--------|
| GET | /users | Get all users | ✅ |
| GET | /users/2 | Get single user | ✅ |
| GET | /users/999 | User not found | ✅ |
| POST | /users | Create user | ✅ |
| POST | /login | Login success | ✅ |
| POST | /login | Login failed | ✅ |
| PUT | /users/2 | Update user | ✅ |
| PATCH | /users/2 | Partial update | ✅ |
| DELETE | /users/2 | Delete user | ✅ |
| GET | /users/2 | Extract response | ✅ |

### Total Test Summary

| Type | Count | Status |
|------|-------|--------|
| UI Tests | 19 | ✅ All Pass |
| API Tests | 10 | ✅ All Pass |
| **Total** | **29** | ✅ All Pass |
| Failures | 0 | ✅ Zero |

---

## 🏗 Framework Architecture

```
┌─────────────────────────────────┐
│           Test Layer            │
│  LoginTest  ProductTest  etc.   │
└──────────────┬──────────────────┘
               │
┌──────────────▼──────────────────┐
│        Page Layer (POM)         │
│  LoginPage  ProductsPage  etc.  │
└──────────────┬──────────────────┘
               │
┌──────────────▼──────────────────┐
│          Base Layer             │
│  DriverFactory  BaseTest        │
│  BasePage  ConfigReader         │
└──────────────┬──────────────────┘
               │
┌──────────────▼──────────────────┐
│          Utils Layer            │
│  ExtentReports  Screenshot      │
│  TestListener   ExcelUtils      │
└─────────────────────────────────┘
```

---

## ⚙️ Prerequisites

- Java JDK 11 or higher
- Maven 3.x
- Chrome Browser (latest)
- Eclipse IDE
- Git

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/Shivenpandey/eCommerce-POM-Automation.git
cd eCommerce-POM-Automation
```

### Run All Tests via Maven

```bash
mvn clean test
```

### Run via TestNG Suite

```
Right click testng.xml → Run As → TestNG Suite
```

### Run Only UI Tests

```bash
mvn test -Dgroups=smoke
```

### Run Only API Tests

```bash
mvn test -Dtest=ApiTest
```

---

## 📊 Test Reports

After running tests, open report at:

```
reports/TestReport.html
```

Report Features:
- ✅ Dark theme HTML report
- ✅ Pass/Fail/Skip status per test
- ✅ Execution time per test
- ✅ Screenshot on test failure
- ✅ System info (Browser, Environment, Tester)
- ✅ Test description

---

## 🔑 Key Features

- ✅ Page Object Model with PageFactory
- ✅ ThreadLocal WebDriver for parallel execution
- ✅ Config driven via config.properties
- ✅ Chrome popup and notification disabled
- ✅ Explicit waits for synchronization
- ✅ REST API testing with RestAssured
- ✅ POJO based JSON serialization
- ✅ Extent Reports with dark theme
- ✅ Screenshot capture on failure
- ✅ TestNG groups smoke and regression
- ✅ Reusable utility classes
- ✅ Maven build management

---

## 📝 Design Patterns Used

**1. Page Object Model (POM)**
Separates locators from test logic for easy maintenance. Single place to update when UI changes.

**2. Factory Pattern**
DriverFactory manages WebDriver lifecycle with ThreadLocal for thread-safe parallel execution.

**3. Singleton Pattern**
ExtentReportManager maintains single instance ensuring unified HTML report for all tests.

---

## 🌿 Git Branching Strategy

```
main      ← stable, production ready
│
├── develop          ← integration branch
│   ├── feature/login-tests
│   ├── feature/api-tests
│   └── feature/reports
```

---

## 👨‍💻 Author

**Shiven Pandey**
Senior QA Automation Engineer

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/shivenpandey)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?style=for-the-badge&logo=github)](https://github.com/Shivenpandey)

---

