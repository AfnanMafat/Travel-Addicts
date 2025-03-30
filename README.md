**Travel Addicts 🌍✈️  **
-Tour Booking System with Tiered Packages

-https://github.com/user-attachments/assets/5450ea5f-4efb-4368-965d-a924d79b511d


**Project Overview**
A full-stack travel booking platform built with Java/Spring Boot that allows users to:  
- Book **4-tier packages** (Bronze, Silver, Gold, Platinum) across **8+ global destinations**  
- Manage flight bookings, meals, accommodation, and transportation services  
- Handle user authentication and booking history  

**Destinations**:  
🇮🇳 Gujarat | 🇫🇷 Paris | 🇯🇵 Kanagawa | 🇩🇪 Cologne  
🇦🇪 Dubai | 🇺🇸 New York | 🇮🇳 Andaman | 🇮🇹 Rome  

## ✨ **Key Features**  
### **Booking System**  
- Tier-based package customization (Bronze to Platinum)  
- Service add-ons: Flights 🛫, Meals 🍽️, Hostels 🏨, Guides 🧭  
- Real-time booking availability check  
- PDF ticket generation  

### **User Management**  
- Spring Security authentication 🔒  
- Booking history tracking 📆  
- Profile customization  

### **Admin Panel**  
- Manage destinations/packages 📌  
- View bookings/reports 📊  
- Update pricing/services ⚙️  


## 🛠️ **Tech Stack**  
**Backend**:  
- Java 21
- Spring Boot 3.4.4 
- Spring Data JPA/Hibernate   
- MySQL Database  

**Frontend**:  
- Thymeleaf templates  
- Bootstrap 5 + CSS3  
- JavaScript/jQuery  

**Tools**:  
- Maven  
- Hibernate Validator  
- Lombok  
- Tomcat Server  

## 📦 **Database Schema**  
![Database Schema](https://via.placeholder.com/600x400) *Add ER diagram here*  
Key Entities:  
- `booking_seq`  
- `query`
- `query_seq`
- `user` (Travelers/Admins) 
- `user_seq` 


## 🏁 **Getting Started**  

### **Prerequisites**  
- Java 21+  
- MySQL 8+  
- Maven  

Access at: `http://localhost:8080`


## 🧩 **Project Structure**  

src/main/java  
├── config/               # Spring configurations  
├── controller/           # MVC controllers  
├── model/                # JPA entities  
├── repository/           # Spring Data repositories               
└── service/              # Business logic 

src/main/resources  
├── static/               # CSS/JS/images  
├── templates/            # Thymeleaf pages  
└── application.properties  


## 🌟 **Acknowledgements**  
- Spring Initializr for project bootstrap  
- Bootstrap for UI components  
- MySQL for relational data management  

**Built with by Afnan Mafat**  

