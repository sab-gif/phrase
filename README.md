Phrases API
A simple RESTful API built with Spring Boot, Java 21, and MySQL for managing inspirational, joke, and Lorem Ipsum phrases. This project demonstrates a 3-layer MVC architecture and supports full CRUD operations.

🚀 Features
List all phrases

View a phrase by ID

Add a new phrase

Edit an existing phrase

Delete a phrase

Filter by category (inspirational, joke, lorem) (optional)

Follows best practices for REST APIs

🛠️ Tech Stack
Java 21

Spring Boot

Spring Data JPA

MySQL

Maven

Postman (for testing)

IntelliJ IDEA (recommended)

📦 Getting Started
1. Creat the project in Sprint Boot
2. Open the project in Intellij
3. Conecting the project to the GitHub
   bash
   git remote add origin https://github.com/sab-gif/phrases-api.git
4. Configure the Database
   Create a MySQL database:

sql
CREATE DATABASE phrases_db;
Update src/main/resources/application.properties with your MySQL username and password:

text
spring.datasource.url=jdbc:mysql://localhost:3306/phrases_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_mysql_user
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
5. Build and Run the Application
   bash
   ./mvnw spring-boot:run
   or

bash
mvn spring-boot:run
The API will be available at http://localhost:8080/api/phrases.

📚 API Endpoints
Method	Endpoint	Description	Body Example (JSON)
GET	/api/phrases	List all phrases
GET	/api/phrases/{id}	Get phrase by ID
POST	/api/phrases	Create a new phrase	{ "text": "Carpe diem", "author": "Horace", "topic": "inspirational" }
PUT	/api/phrases/{id}	Update a phrase	{ "text": "Updated text", "author": "New Author", "topic": "joke" }
DELETE	/api/phrases/{id}	Delete a phrase
🧪 Testing with Postman
Import the endpoints into Postman.

For POST/PUT, use the "Body" tab and select "raw" > "JSON".

Example POST body:

json
{
"text": "The only limit is your mind.",
"author": "Anonymous",
"topic": "inspirational"
}
🏛️ Project Structure
text
src
└── main
├── java
│   └── com.example.phrases
│       ├── controller
│       ├── model
│       ├── repository
│       └── service
└── resources
└── application.properties
📄 License
This project is licensed under the MIT License.

🙋‍♀️ Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

✨ Acknowledgments
My bootcamp instructors and classmates, for teaching and supporting me through the coding and Postman lessons.

The coding class provided by the bootcamp, which guided me step-by-step in building and testing the API.

Happy Coding! 🚀

Let me know if you want a version with badges, a contributors section, or more detailed setup instructions!