# Bank Management System

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Datavase Schema](#database-schema)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)


## Features

- User-Friendly Web Interface: 
- Authentication and Authorization: 
- Account Support: 
- Comprehensive Account Details:
- Efficient Transaction Handling:


## Installation

To run the Bank Management System locally, you will need the following:
- Java 11 or higher
- Maven
- PostgreSQL

Once you have the required tools installed, follow these steps to install the Bank Management System:


1. Edit the database configurations in application.properties file.
3. Navigate to the project directory:
    ```shell
    cd bank-management-system-springboot
    ```
4. Build and run the application using Maven
    ```shell
    mvn spring-boot:run
    ```
5. Explore the Application: Once the application is up and running, open your web browser and access it at: `http://localhost:8080`
6. Access API Documentation: Additionally, you can explore the API documentation by navigating to: `http://localhost:8080/swagger-ui.html`. 


## Usage

- Customer Actions:
   - Account Creation: As a customer, you have the privilege of creating multiple accounts tailored to your financial needs.
   - View Account Details: Easily access comprehensive details about your accounts, empowering you with insights into your balances and transactions.

- Transaction Operations:
  - Deposit Funds: Any interface can conveniently utilize the `/transaction/deposit` endpoint to securely deposit funds into specified accounts.
  - Withdraw Funds: Similarly, the `/transaction/withdraw` endpoint is available for withdrawing funds from accounts, ensuring your transactions are seamless and accurate.