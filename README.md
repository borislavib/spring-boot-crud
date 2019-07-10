# Basic CRUD application with Spring Boot

Spring Boot simple project with branches for different tasks


Running the application

    ./mvnw clean spring-boot:run

or

    mvn clean spring-boot:run


Adding new record

    curl -X POST localhost:3000/plants/2 -H 'Content-type:application/json' -d  '{ "genus": "Nolina", "subfamily": "Nolinoideae", "distribution": "S America" }'

Listing all records

    curl -v localhost:3000/plants

Delete a record

    curl -X DELETE localhost:3000/plants/2

Update

    curl -X PUT localhost:3000/plants/2 -H 'Content-type:application/json' -d  '{ "genus": "Nolina", "subfamily": "Nolinoideae", "distribution": "South America" }'

