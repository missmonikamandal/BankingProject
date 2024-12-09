# BankingProject Introduction 
In the Banking Application Project,I have built REST APIs for the banking domain. The application supports creating bank accounts, fetching account details, making deposits and withdrawals, transferring funds between accounts, and viewing transaction histories.
Dependency - Spring Web, Spring data JPA, Lombok, MySql Driver
Technologies - SpringBoot, MVC, JPA Hibernate
Language - Java, MySQL
Platform - IntelliJ IDE , MySQL Workbench, Postman Client API
Project Structure- 
src/
├── main/
│   ├── java/
│   │   └── com.example.foodfrenzy/
│   │       ├── controller/      # Contains all controllers
│   │       ├── entity/           # Contains entity classes
│   │       ├── repository/      # Repository interfaces for database interaction
│   │       ├── dto/              # Data Transfer Object class
│   │       ├── mapper/          # converts entity to dto and vice versa
│   │       ├── exception/      # handles specific and generic exceptions
│   │       └── service/         # Service layer with business logic
│   ├── resources/
│       ├── templates/           # Thymeleaf templates for views
│       ├── static/              # Static assets (CSS, JavaScript)
│       └── application.properties  # Project configuration
│   
└── test/                        # Test cases for unit testing
