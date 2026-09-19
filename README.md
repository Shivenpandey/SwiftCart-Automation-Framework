eCommerce-POM-Automation

📌 About The Project
A production-grade hybrid test automation framework built completely from scratch using Selenium 4 + Java + TestNG following Page Object Model design pattern. Automates complete eCommerce flows on SauceDemo (https://www.saucedemo.com) including Login, Products, Cart and end-to-end Checkout with REST API validation using RestAssured.

🛠 Tech Stack
Technology	Version	Purpose
Java	11	Programming Language
Selenium WebDriver	4.x	UI Automation
TestNG	7.x	Test Framework
RestAssured	5.x	API Testing
Maven	3.x	Build Tool
Extent Reports	5.x	HTML Reporting
WebDriverManager	5.x	Driver Management
Git + GitHub	-	Version Control

📁 Project Structure
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
│   │   └── pojo/UserPojo.java
│   └── utils/
│       ├── ConfigReader.java
│       ├── ExtentReportManager.java
│       ├── ScreenshotUtils.java
│       └── TestListener.java
│
├── src/test/resources/config.properties
├── testng.xml
├── pom.xml
└── README.md

✅ Test Coverage
UI Tests — SauceDemo.com
Module	Test Cases	Status
Login	Valid login, Invalid login, Locked user, Empty fields	✅ 4 Tests
Products	Page load, Add to cart, Sort A-Z, Sort Z-A, Sort by price, Multiple items	✅ 6 Tests
Cart	Verify item, Remove item, Item count, Continue shopping	✅ 4 Tests
Checkout	Complete E2E, Empty first name, Empty last name, Empty postal, Order summary	✅ 5 Tests

API Tests — reqres.in
Method	Endpoint	Test Case	Status
GET	/users	Get all users	✅ Pass
GET	/users/2	Get single user	✅ Pass
GET	/users/999	User not found	✅ Pass
POST	/users	Create user	✅ Pass
POST	/login	Login success	✅ Pass
POST	/login	Login failed	✅ Pass
PUT	/users/2	Update user	✅ Pass
PATCH	/users/2	Partial update	✅ Pass
DELETE	/users/2	Delete user	✅ Pass
GET	/users/2	Extract response	✅ Pass

Total Test Summary
Type	Count	Status
UI Tests	19	✅ All Pass
API Tests	10	✅ All Pass
Total	29	✅ All Pass
Failures	0	✅ Zero

🔑 Key Features
✅ Page Object Model with PageFactory
✅ ThreadLocal WebDriver for parallel execution
✅ Config driven via config.properties
✅ Chrome popup and notification disabled
✅ Explicit waits for synchronization
✅ REST API testing with RestAssured
✅ POJO based JSON serialization
✅ Extent Reports with dark theme
✅ Screenshot capture on failure
✅ TestNG groups smoke and regression
✅ Reusable utility classes
✅ Maven build management

🚀 How to Run
Clone the Repository
git clone https://github.com/Shivenpandey/eCommerce-POM-Automation.git
cd eCommerce-POM-Automation

Run All Tests via Maven
mvn clean test

Run via TestNG Suite
Right click testng.xml → Run As → TestNG Suite

Run Only API Tests
mvn test -Dtest=ApiTest

👨‍💻 Author
Shiven Pandey
QA Automation Engineer
LinkedIn: https://www.linkedin.com/in/shivenpandey
GitHub: https://github.com/Shivenpandey


