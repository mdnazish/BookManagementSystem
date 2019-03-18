# BookManagementSystem
Building Restful CRUD API for a simple Book-Manage application using Spring MVC, Mysql and Hibernate.

Requirements
Java - 1.8.x
Maven - 3.3.9
MySQL - 5.7.12

Steps to Setup
1. Clone the application
- git clone https://github.com/mdnazish/BookManagementSystem.git

2. Create Mysql database
- create database bookdb

3. Change mysql username and password as per your installation
- open src/main/resources/db.properties
- change mysql.user and mysql.password as per your mysql installation

4. Build and run the app using maven

- mvn package
A new WAR file will be generated at project/target/bookapi-0.0.1-SNAPSHOT.war, just copy and deploy to your Tomcat.

The app will start running at http://localhost:8585/bookapi/.

Explore Rest APIs
The app defines following CRUD APIs.

GET /api/book  - Select Operation

POST /api/book - Create Operation

GET /api/book/{bookId} - Search By book_id

PUT /api/book/{bookId} - Updated selected record

DELETE /api/book/{bookId} - Delete selected record

Note : You can test them using postman or any other rest client.
