# My Spring Boot H2 CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built with Spring Boot and H2 Database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven

### Installing

1. Clone the repository
2. Navigate to the project directory and run the application with the following command:

```
mvn spring-boot:run
```

The application will start on port 8080.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 Database](https://www.h2database.com/html/main.html)

## Functionality

This application provides a simple user management system where you can perform the following operations:

- Create a User
- Read User Information
- Update User Information
- Delete User

## API Endpoints

- POST /users
- GET /users
- GET /users/{id}
- PUT /users/{id}
- DELETE /users/{id}

## Authors

- [Your Name]

## License

This project is licensed under the MIT License.