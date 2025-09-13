# Gift Card API

A **robust and consistent Gift Card API** built with Spring Boot, designed as a **monolithic application**. This API provides endpoints for managing gift cards, featuring database migrations, in-memory caching, and Kafka integration for event-driven communication.  

---

## Features

- **Monolithic Architecture** – simple and maintainable structure.  
- **Spring Boot** – fast setup with REST endpoints.  
- **Flyway Migrations** – reliable database version control.  
- **Caffeine Cache** – in-memory caching for faster reads and reduced DB load.  
- **PostgreSQL Support** – persistent relational database.  
- **Kafka Integration** – event-driven messaging for async processes and notifications.  
- **Consistent API** – designed for stability and predictable behavior.  

---

## Technology Stack

| Layer        | Technology |
|-------------|------------|
| Framework    | Spring Boot |
| Database     | PostgreSQL |
| Migration    | Flyway |
| Cache        | Caffeine (in-memory) |
| Messaging    | Apache Kafka |
| Java Version | 17 |

---

## Setup & Run

1. **Clone the repository**
```bash
git clone <repo-url>
cd gift-card-api
