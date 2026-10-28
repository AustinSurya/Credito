
Credito – Fintech Loan Management Application

Credito is a Java-based fintech application built with Spring Boot. The project is intended to provide REST APIs for managing customer information as a foundation for a loan and credit management platform.

## Project Goals

- Build RESTful APIs using Java and Spring Boot.
- Organize application logic into controller, service, repository, and model layers.
- Persist customer records in a MySQL database using Spring Data JPA.
- Practice API development, database integration, and backend application design.

## Technology Stack

- **Language:** Java
- **Backend Framework:** Spring Boot
- **Data Access:** Spring Data JPA / Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Postman
- **IDE:** Eclipse

## Current Functionality

- Create customer records through a REST endpoint.
- Retrieve the list of customers.
- Retrieve a customer by ID.
- Store customer data in MySQL through JPA.

> Note: These features reflect the functionality described for the current project. Update this section as you implement and test additional features.

## Application Structure

The application follows a layered structure:

- `model` – customer entity and its database mapping.
- `repo` – repository interface for database operations.
- `service` – business logic and data retrieval.
- `controller` – REST endpoints that receive HTTP requests.
- `CreditoApplication` – Spring Boot application entry point.

## Prerequisites

- Java and a compatible JDK
- Maven
- MySQL Server
- Postman or another REST client

## Setup

1. Clone this repository:
   ```bash
   git clone <your-repository-url>
   cd <repository-folder>
   ```

2. Create a MySQL database named `creditodb`.

3. Configure your database connection in `src/main/resources/application.properties`. Set the database URL, username, and password to match your local MySQL setup. Do not commit real credentials.

4. Ensure the required Spring Boot dependencies are included in `pom.xml`, including the web, Spring Data JPA, and MySQL driver dependencies used by the project.

5. Run the application from your IDE or with Maven:
   ```bash
   mvn spring-boot:run
   ```

6. If your local configuration uses port `9999`, the application base URL is:
   `http://localhost:9999`

## API Endpoints

The following endpoints reflect the routes described in the current implementation. Confirm them against your controller before publishing.

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/Customer/CreateCustomer` | Create a customer |
| GET | `/Customer/GAS` | Retrieve all customers |
| GET | `/Customer/getcustomerbyid/{loanid}` | Retrieve a customer by ID |

For the POST endpoint, send a JSON request body containing the customer fields defined by your `Customer` entity, such as `customerName` and `email`. Test the endpoints in Postman.

## Future Enhancements

Potential next steps for the project include:

- Update and delete customer records.
- Input validation and consistent error responses.
- DTOs and centralized exception handling.
- Authentication and role-based authorization.
- Loan application, eligibility, and repayment workflows.
- Unit and integration tests.
- Deployment and API documentation.

## Author

**Austin Surya**

GitHub: https://github.com/AustinSurya

---

This project is a learning and portfolio project. Document only the features that are implemented and tested in the repository.
