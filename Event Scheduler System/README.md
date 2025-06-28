Run a Application

Import the Project
- Open Eclipse IDE.
- Go to `File` → `Import`.
- Choose `Existing Maven Projects` → Click `Next`.
- Browse to the project folder → Click `Finish`.

Configure the Application
- Open `application.properties`
- give a database configuration.

  Run the Application
  In the src/main/java folder, open the main class:
  EventApplication.java

  Right-click → Run As → Java Application
  Tomcat started on port(s): 8081



Dependencies

Spring Web

Spring Data JPA

H2 Database / MySQL

Lombok

Spring Boot DevTools



API Endpoints (Poastman)

GET     /events              – list all scheduled events

GET     /events/{id}         – get details of a specific event

POST    /events              – create a new event  

PUT     /events/{id}         – update an existing event 

DELETE  /events/{id}         – delete an event


GitHub repository URL - https://github.com/lavanya372/Event-Scheduler-System.git
