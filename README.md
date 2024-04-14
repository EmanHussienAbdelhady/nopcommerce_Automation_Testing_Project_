# nopcommerce_Automation_Testing_Project_
 Automate e-commerce website testing with Selenium &amp; Cucumber BDD. Validate registration, login, search, Wishlist features. POM design ensures maintainability. Contributions welcome!
**Project Description**
This project aims to automate various features of an e-commerce website using Selenium WebDriver and Cucumber BDD framework. Each feature is implemented as a separate scenario and is thoroughly documented to facilitate understanding and review.

**Features**
Registration Feature
Enables users to register with valid account details. Verifies successful registration and validates the displayed success message and its color.

Login Feature
Allows users to log in with valid and invalid credentials. Validates successful and unsuccessful login attempts.

Currencies Feature
Enables users to select different currencies from a dropdown list. Validates that the selected currency symbol is displayed correctly on the products displayed.

Search Feature
Allows users to search for products by name or SKU. Verifies that search results are relevant and contain the searched keyword. Additionally, verifies the SKU of the product displayed.

Hover Categories Feature
Enables users to navigate through main categories and sub-categories by selecting random categories. Validates that the selected sub-category page title matches the chosen sub-category.

Home Sliders Feature
Allows users to navigate through home sliders by clicking on them. Verifies that the user is redirected to the correct product page.

Follow Us Feature
Allows users to follow social media links. Verifies that each social media link opens in a new tab.

Wishlist Feature
Enables users to add products to their wishlist. Verifies that the success message is displayed and its background color is green.

**Repository Structure**
src/main/resources/features: Contains feature files for each feature.
src/test/java/org.example/stepDefs: Contains step definition classes for each feature.
src/test/java/org.example/pages: Contains page classes to apply the Page Object Model (POM) design pattern.
**Running the Tests**
Clone the repository to your local machine.
Set up the Selenium WebDriver and Cucumber dependencies in your project.
Configure your test environment (e.g., WebDriver configurations).
Run the tests using your preferred test runner or IDE.
[Eman Hussien] - [www.linkedin.com/in/eman-hussien-b102a6228]
Feel free to contribute to the project by submitting pull requests or reporting issues.
