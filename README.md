# 🏠 Hostel Room Allotment & Maintenance Management System

A full-featured Spring Boot web application designed to automate hostel operations including room allotment, maintenance tracking, user management, notifications, and reporting.

This system ensures structured administration with secure role-based access and efficient workflow handling.

---

## 🚀 Project Overview

The Hostel Management System streamlines hostel administration by digitizing:

- Room allocation processes
- Maintenance issue tracking
- Notification management
- User role management (Student, Warden, Admin)
- System report generation

The application follows a layered architecture with Controller, Service, Repository, and Entity separation to maintain clean backend design principles.

---

## ✨ Key Features

### 👥 User Management
- Add, view, and delete users
- Role-based access control
- Secure authentication (Login/Signup)

### 🏠 Room Allotment
- Create new room allotments
- Track check-in and check-out dates
- View and manage active allocations

### 🔧 Maintenance Management
- Report room maintenance issues
- Set priority levels (LOW, MEDIUM, HIGH, URGENT)
- Track issue status (PENDING → COMPLETED)
- Assign maintenance responsibility

### 🔔 Notifications
- Send system notifications
- Track read/unread status
- Manage expiry-based alerts

### 📊 Reports
- Generate administrative reports
- Store structured report data
- Maintain report history

---

## 🛠️ Tech Stack

| Layer        | Technology |
|-------------|------------|
| Backend     | Spring Boot 3.5.6 |
| Language    | Java 17 |
| Database    | MySQL 8.0 |
| ORM         | Spring Data JPA (Hibernate) |
| Frontend    | HTML5, CSS3, Thymeleaf |
| Build Tool  | Gradle |
| Server      | Embedded Tomcat |

---

## 🏗️ Architecture

The project follows a structured multi-layered architecture:


Controller Layer → Service Layer → Repository Layer → Database


This ensures:
- Clean separation of concerns
- Maintainable backend structure
- Scalable development

---

## 🗄️ Database Design

The system includes the following major tables:

- Users
- Rooms
- Allotments
- Maintenance
- Notifications
- Reports

Each table is relationally mapped with foreign key constraints to maintain data integrity.

---

## ⚙️ Installation & Setup

### Prerequisites
- JDK 17+
- MySQL 8.0
- Gradle
- IntelliJ IDEA (recommended)

---

### 1️⃣ Clone the Repository

git clone https://github.com/Arunkumar-1129/hostelAllotment.git
cd hostelAllotment


2️⃣ Create Database
CREATE DATABASE hostel;


3️⃣ Configure Database Connection

Edit src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/hostel
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080


4️⃣ Build the Project
./gradlew clean build


5️⃣ Run the Application
./gradlew bootRun


6️⃣ Access Application
http://localhost:8080/login



**🔗 Core Functional Routes**

          /login – Authentication
          
          /ui/dashboard – Admin Dashboard
          
          /ui/allusers – User Management
          
          /ui/allallotments – Room Allotments
          
          /ui/allmaintenances – Maintenance Tracking
          
          /ui/allnotifications – Notification System
          
          /ui/allreports – Report Management

**📸 Application Modules**

            Login & Authentication
            
            Dashboard Overview
            
            User Management Panel
            
            Room Allocation Interface
            
            Maintenance Tracking System
            
            Notification Center
            
            Reports Management
**
🎯 Key Learning Outcomes**
            
            Spring Boot application structuring
            
            RESTful endpoint handling
            
            Database relationship mapping
            
            Role-based system design
            
            Clean layered backend architecture
            
            Real-world CRUD system implementation

👨‍💻 Author

Arun Kumar P
B.E Electronics and Communication Engineering (2024–2028)
Full Stack Developer | Backend Systems | AI Enthusiast
