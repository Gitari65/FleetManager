

# Fleet Management System

This is a simple Fleet Management System built using Spring Boot.

## Overview

The Fleet Management System allows users to manage vehicles, including adding, updating, and deleting vehicles. It also provides endpoints to retrieve vehicles by make and model.

## Features

- Add a new vehicle
- Update vehicle details
- Delete a vehicle
- Retrieve vehicles by make and model

## Technologies Used

- Java
- Spring Boot
- Maven/Gradle (Dependency Management)
- MySQL (Database)
- Swagger (API Documentation)

## Setup

1. **Clone the repository:**

   ```
   git clone <repository-url>
   ```

2. **Build the project:**

   ```
   cd manager
   mvn clean install
   ```

3. **Database Configuration:**

   - Configure the database connection details in `application.properties`.

4. **Run the application:**

   ```
   mvn spring-boot:run
   ```

5. **Access the application:**

   ```
  currently i haven't hosted yet
   ```

## API Documentation

- Swagger documentation is available at `/swagger-ui.html`.

## Endpoints

- `GET /api/vehicles`: Retrieve all vehicles
- `GET /api/vehicles/{vehicleId}`: Retrieve a vehicle by ID
- `POST /api/vehicles`: Add a new vehicle
- `PUT /api/vehicles/{vehicleId}`: Update a vehicle
- `DELETE /api/vehicles/{vehicleId}`: Delete a vehicle
- `GET /api/vehicles/byMake`: Retrieve vehicles by make
- `GET /api/vehicles/byModel`: Retrieve vehicles by model

## Contributors

- Alex Gitari (https://github.com/Gitari65)

