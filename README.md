#  StudyHub+

### Microservices-Based Course & Student Management Platform

---

##  Overview

**StudyHub+** is an enterprise-level Learning Management System (LMS) built using **Spring Boot microservices architecture**. It enables students to enroll in courses, instructors to manage learning content, and administrators to control the system through secure, role-based access.

This project is developed as part of **SECT-4221 — Enterprise Application Development**.

---

##  Objectives

* Transform a monolithic system into a **microservices-based architecture**
* Implement **secure, scalable backend services** using Spring Boot
* Demonstrate **enterprise application design principles**
* Apply **REST API standards, security, and testing practices**

---

##  System Architecture

The system follows a **microservices architecture** with an API Gateway acting as the entry point.

```
Client (Frontend)
        ↓
   API Gateway
        ↓
-----------------------------------------
| Auth Service        (Authentication)   |
| User Service        (User Management)  |
| Course Service      (Courses & Lessons)|
| Enrollment Service  (Enrollment Logic) |
| Notification Service (Optional)        |
-----------------------------------------
```

---

## ️ Tech Stack

### 🔹 Backend

* Java 21
* Spring Boot 3.x
* Spring Data JPA
* Spring Security + JWT

### 🔹 Database

* PostgreSQL
* Flyway (Database migrations)

### 🔹 Testing

* JUnit 5
* Mockito
* Testcontainers

### 🔹 Deployment

* Docker
* Docker Compose

### 🔹 API Documentation

* SpringDoc OpenAPI (Swagger UI)

---

##  User Roles

| Role           | Description                                      |
| -------------- | ------------------------------------------------ |
| **ADMIN**      | Manages users, courses, and system configuration |
| **INSTRUCTOR** | Creates and manages courses and lessons          |
| **STUDENT**    | Enrolls in courses and tracks progress           |

---

##  Core Features

*  JWT-based authentication and authorization
*  Course and lesson management
*  Student enrollment system
*  Progress tracking
*  Search and filtering of courses
*  Pagination for large datasets
*  Global exception handling

---

## ️ Project Structure

```
studyhub-plus/
│
├── api-gateway/
├── auth-service/
├── user-service/
├── course-service/
├── enrollment-service/
├── notification-service/
│
├── docker-compose.yml
└── README.md
```

---

##  API Overview

| Service            | Base Path        |
| ------------------ | ---------------- |
| Auth Service       | /api/auth        |
| User Service       | /api/users       |
| Course Service     | /api/courses     |
| Enrollment Service | /api/enrollments |

Swagger UI will be available at:

```
http://localhost:8080/swagger-ui.html
```

---

##  Security

* JWT-based authentication
* BCrypt password hashing
* Role-based access control using `@PreAuthorize`
* Stateless session management

---

##  Testing Strategy

* Unit tests for service layer
* Controller tests using MockMvc
* Repository tests using Testcontainers
* Security tests for role-based access

Minimum target: **70% test coverage**

---

##  Running the Project

### Prerequisites

* Java 21
* Maven
* Docker & Docker Compose

### Run with Docker

```bash
docker-compose up --build
```

---

##  Development Setup

```bash
# Clone repository
git clone https://github.com/your-username/se4801-group-___

# Navigate to project
cd studyhub-plus

# Build project
mvn clean install
```

---

##  Documentation

* API documentation available via Swagger
* ER Diagram and system design included in project report
* Flyway scripts manage schema evolution

---

## ️ Important Notes

* No hardcoded secrets — environment variables are used
* Entities are not exposed directly (DTO pattern used)
* Controllers do not contain business logic

---

##  Project Status

 In Development — Active Phase
