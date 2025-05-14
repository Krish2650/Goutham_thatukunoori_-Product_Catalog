# Goutham_thatukunoori_-Product_Catalog
Sutram Solutions Pvt Ltd assignment product catalog
# 🛍️ Product Catalog Application

A simple **Spring Boot CRUD** application for managing a product catalog. It supports adding, updating, viewing, and deleting products. Each product has a name, description, price, and image URL.

## 🚀 Features

- Add a new product
- Get a list of all products
- Update product details
- Delete a product
- JSP-based frontend view
- MySQL database integration

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- JSP
- Maven

## 🗂️ Project Structure

📁 src
└── 📁 main
├── 📁 java
│ └── 📁 com
│ └── 📁 web
│ ├── Application.java
│ ├── 📁 controller
│ │ └── ProductController.java
│ ├── 📁 model
│ │ └── Product.java
│ ├── 📁 repository
│ │ └── ProductRepository.java
│ └── 📁 service
│ └── ProductService.java
└── 📁 resources
├── application.properties
└── 📁 views
└── index.jsp

📁 test
└── 📁 java
└── 📁 com
└── 📁 web
└── ApplicationTests.java

markdown
Copy code

## ⚙️ How to Run

1. **Clone the repository**
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

markdown
Copy code

2. **Configure MySQL**
Create a database named `ProductCatalog` and update `application.properties` with your MySQL credentials.

3. **Run the Application**
- Via terminal:
  ```
  ./mvnw spring-boot:run
  ```
- Or run `Application.java` from your IDE

4. **Access the app**
Open your browser and go to:  
`http://localhost:8084/`

## 📬 API Endpoints

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/get/{id}`        | Get all products    |
| POST   | `/api/products`    | Add a product       |
| PUT    | `/{id}`            | Update a product    |
| DELETE | `/{id}`            | Delete a product    |

## 🧪 Test

Run unit tests using:
