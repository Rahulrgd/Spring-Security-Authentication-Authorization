# Spring Boot 3.0 Security with JWT Implementation

This project demonstrates the implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT). It includes the following features:

- User registration and login with JWT authentication
- Password encryption using BCrypt
- Role-based authorization with Spring Security
- Customized access denied handling
- Logout mechanism
- Refresh token

## Technologies Used

- Spring Boot 3.0
- Spring Security
- JSON Web Tokens (JWT)
- BCrypt
- Maven
- MySQL

## Getting Started

To get started with this project, you will need to have the following installed on your local machine:

- JDK 17+
- Maven 3+
- MySQL

Follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/Rahulrgd/Spring-Security-Authentication-Authorization.git
   ```

2. Navigate to the project directory:
   ```
   cd "project-folder"
   ```

3. Add a database named "spring_jwt" to MySQL.

4. Build the project:
   ```
   mvn clean install
   ```

5. Run the project:
   ```
   mvn spring-boot:run
   ```

The application will be available at [http://localhost:8080](http://localhost:8080).