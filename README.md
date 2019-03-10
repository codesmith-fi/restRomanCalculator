Spring Boot REST service to convert between integers and Roman Numerals

This is a simple training practise with Spring Boot and Gradle. Implements 
two controllers to handle GET requests for conversion operations.

Compile with gradle
    ./gradlew build

Run with
    ./gradlew bootRun
    or
    java -jar build/libs/rest-romancalculator-1.0.0.jar

Responds to requests in '/roman' and '/integer' with parameter 'value=[source]'

For example:
    http://localhost:8080/roman?value=XIV
    result JSON:
        result	"14"
        source	"XIV"

    http://localhost:8080/integer?value=14
    result JSON:
        result	"XIV"
        source	"14"

Author: Erno Pakarinen (erpakari@gmail.com)
