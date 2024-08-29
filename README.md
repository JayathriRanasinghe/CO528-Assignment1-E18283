
# CO528-Assignment1-E18283

**A REST Service Application using Spring Boot**

## Overview

This project is a RESTful service application built with Spring Boot. It allows you to manage student records via a set of RESTful APIs.

---

## Commands

To build and run the application using Docker:

```bash
# Navigate to the project directory
cd CO528-assignment1

# Build the Docker image
docker build -t co528-assignment1 .

# Start the application using Docker Compose
docker-compose up
```

---

## Dummy Data for Testing

Use the following JSON data to add a new student to the database:

```json
{
    "firstName": "James",
    "lastName": "Garcia",
    "contactNumber": "555-6543",
    "email": "james.garcia@example.com",
    "startDate": "2024-06-18"
}
```

---

## REST API Endpoints

### Get All Students
```http
GET /students/all-students
```
- **Description**: Retrieve a list of all students.

### Add a New Student
```http
POST /students/add-student
```
- **Description**: Add a new student to the database.

### Get a Student by ID
```http
GET /students/student/{id}
```
- **Example**: 
  ```http
  GET /students/student/1
  ```
- **Description**: Retrieve details of a student by their ID.

### Update a Student by ID
```http
PUT /students/update-student/{id}
```
- **Example**: 
  ```http
  PUT /students/update-student/1
  ```
- **Description**: Update the details of a student by their ID.

### Delete a Student by ID
```http
DELETE /students/delete-record/{id}
```
- **Example**: 
  ```http
  DELETE /students/delete-record/1
  ```
- **Description**: Delete a student record by their ID.
