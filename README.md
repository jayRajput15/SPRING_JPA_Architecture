# 🏥 Hospital Management System

A backend application built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL** to model a real-world hospital management system. This project was developed to gain hands-on experience with Hibernate ORM, relational database design, transaction management, and advanced JPA concepts.

---

## 🚀 Tech Stack

- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- PostgreSQL
- Maven
- Lombok
- JUnit 5

---

# 📌 Features

- Patient Management
- Doctor Management
- Department Management
- Appointment Scheduling
- Insurance Management
- Entity Relationship Management
- Transactional Service Layer
- Repository Pattern
- Integration Testing

---

# 🏗️ Architecture

```
Controller
     │
     ▼
Service Layer (@Transactional)
     │
     ▼
Repository Layer (Spring Data JPA)
     │
     ▼
Hibernate ORM
     │
     ▼
PostgreSQL
```

---

# 📂 Entity Relationships

### One-to-One
- Patient ↔ Insurance
- Department ↔ Head Doctor

### One-to-Many / Many-to-One
- Doctor ↔ Appointments
- Patient ↔ Appointments

### Many-to-Many
- Department ↔ Doctors

Implemented using JPA annotations with proper foreign key and join table mappings.

---

# 🔍 Spring Data JPA Features Implemented

- Entity Mapping
- Repository Interfaces
- Dynamic Query Methods
- JPQL Queries
- Pagination
- Sorting
- DTO Projection
- Interface Projection
- Constructor Projection
- Transaction Management
- Integration Testing

---

# 🧠 Hibernate Concepts Demonstrated

This project was built to understand the internals of Hibernate rather than only implementing CRUD operations.

Concepts explored include:

- Entity Lifecycle
    - Transient
    - Managed
    - Detached
    - Removed

- Persistence Context

- Dirty Checking

- First-Level Cache

- Automatic SQL Generation

- Flush vs Commit

- Transaction Boundaries

- Cascade Operations
    - PERSIST
    - MERGE
    - REMOVE
    - ALL

- Relationship Synchronization

- Join Table Management

---

# ⚙️ Business Logic Implemented

Some of the service operations include:

- Creating appointments for patients with doctors
- Assigning doctors to departments
- Updating department head
- Managing patient insurance
- Maintaining entity relationships inside transactional boundaries

Example:

```java
assignDoctor(
    departmentId,
    headDoctorId,
    doctorIds
);
```

---

# 🧪 Testing

Implemented integration tests using **SpringBootTest** to verify:

- Entity persistence
- Relationship mappings
- Transaction behavior
- Repository operations
- Service layer functionality

---

# 📚 Key Learnings

This project strengthened my understanding of:

- Object Relational Mapping (ORM)
- Spring Data JPA
- Hibernate Internals
- Relational Database Design
- Entity Relationships
- Transaction Management
- Persistence Context
- Dirty Checking
- Cascading
- JPQL
- Pagination & Sorting
- DTO Mapping
- Integration Testing

---

# 🚀 Future Enhancements

- FetchType Optimization
- Orphan Removal
- N+1 Query Optimization
- Criteria API
- Specifications
- Entity Graph
- Auditing
- Spring Security
- JWT Authentication
- Swagger/OpenAPI Documentation
- Docker Deployment

---

# 💡 Project Objective

The objective of this project was to build a production-style backend while developing a strong understanding of Hibernate and Spring Data JPA. Beyond CRUD operations, the focus was on mastering entity relationships, persistence context, transaction management, and how Hibernate translates object-oriented code into efficient SQL operations.
