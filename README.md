# Bank Account Management System

## Overview

The **Bank Account Management System** is an enterprise-grade application built with Java and Spring Boot. This system follows a microservices architecture to manage bank accounts, customers, and transactions. It leverages Docker for containerization and Spring Cloud Gateway for API routing.

## Architecture

The project consists of the following microservices:

- **Account Service**: Manages bank account operations.
- **Customer Service**: Handles customer data.
- **Transaction Service**: Manages transactions.
- **API Gateway**: Routes requests to appropriate services.

## Getting Started

### Prerequisites

- **Docker**: Ensure Docker is installed on your machine.
- **Java 17+**: Required for running the services.

### Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/bank-account-management.git
   cd bank-account-management

2. **Build and Run Services**

Using Docker Compose, you can build and run all services:

    docker-compose up --build

   
3. **Access the Application**

- API Gateway: http://localhost:8080
- Services are internally routed by the API Gateway.

### API Endpoints

**Account Service:**

- POST /accounts - Create an account
- POST /accounts/{id}/deposit - Deposit funds
- POST /accounts/{id}/withdraw - Withdraw funds
- POST /accounts/{sourceId}/transfer/{targetId} - Transfer funds

**Customer Service:**

- POST /customers - Create a customer
- GET /customers/{id} - Get customer details

**Transaction Service:**

- POST /transactions - Create a transaction

### Future Enhancements
- Security: Integrate OAuth2 and JWT for secure API access.
- Monitoring: Implement distributed tracing and monitoring using tools like Zipkin and Prometheus.
- CI/CD: Set up continuous integration and deployment pipelines using Jenkins or GitHub Actions.

Contributions are welcome! Please open an issue or submit a pull request with your changes.

### Acknowledgments
Thanks to the Spring Boot, Docker, and Spring Cloud communities for their support and tools.
vbnet


### Notes

- **Docker and Docker Compose** are used for containerizing the services and managing dependencies.
- **Spring Cloud Gateway** is used to route requests to the appropriate services.
- **Microservices**: Each service has its own database, adhering to the principle of microservices architecture.

