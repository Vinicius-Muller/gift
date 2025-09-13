
<div align="center">
  <img width="300" height="300" alt="aws_logo" src="https://github.com/user-attachments/assets/8adc3a6a-0245-4773-acfe-b73741304557" />
  <img width="300" height="300" alt="kfk_logo" src="https://github.com/user-attachments/assets/d7afdcdd-f04c-4a5a-8164-bc060094a1c9" />
  <img width="300" height="300" alt="spring_logo" src="https://github.com/user-attachments/assets/b23f1cc6-8b67-487b-a068-b8d6699bb8b0" />
</div>




# Spring Playground

A **robust and consistent Spring Playground API** built with Spring Boot, designed as a **monolithic application**. This API provides endpoints for managing gift cards, featuring database migrations, in-memory caching, and Kafka integration for event-driven communication.  

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
