# Vendor Management System

This is a **Spring Boot** project for managing vendor-related operations, built as part of the **Assessment_Project** repository.

## 🚀 Features
- Add, update, delete, and retrieve vendor details.
- RESTful API endpoints for vendor management.
- Spring Boot framework with Maven build support.
- h2 integration for data storage.
- Exception handling and validation.
- Swagger-ui for documentation.

## 🛠 Tech Stack
- **Backend**: Java, Spring Boot
- **Database**: h2
- **Build Tool**: Maven
- **Swagger**: 3.00
- **Version Control**: Git & GitHub

## 📂 Project Structure
```
Assessment_Project/
│── Spring_boot/
│   ├── vender/
│   │   ├── src/main/java/com/example/vender/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   ├── src/main/resources/
│   │   │   ├── application.properties
│   │   ├── pom.xml
```

## 🔧 Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/AnantSagar01/Assessment_Project.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Assessment_Project/Spring_boot/vender
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Configure database settings in `src/main/resources/application.properties`.
5. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

## 📌 API Endpoints
| HTTP Method | Endpoint       | Description |
|------------|---------------|-------------|
| GET        | `/vendors`     | Get all vendors |
| GET        | `/vendors/{id}` | Get vendor by ID |
| POST       | `/vendors`     | Add a new vendor |
| PUT        | `/vendors/{id}` | Update vendor details |
| DELETE     | `/vendors/{id}` | Delete vendor |

## 📝 License
This project is licensed under the MIT License.

## 🤝 Contributing
Feel free to fork this repository and submit pull requests.

## 📧 Contact
For any queries, reach out at: [anantsagar0000@gmail.com](mailto:anantsagar0000@gmail.com)
