Spring Boot REST service to convert between integers and Roman Numerals

This is a simple training practise with Spring Boot and Gradle. Implements 
two controllers to handle GET requests for conversion operations.

Compile with gradle
    ./gradlew build

Run with
    java -jar build/libs/rest-romancalculator-1.0.0.jar

Responds to requests in '/roman' and '/integer'. Value to be converted should be given as path parameter.

For example:
    http://localhost:8080/roman/XVI
    result JSON:
        result	"14"
        source	"XIV"

    http://localhost:8080/integer/14
    result JSON:
        result	"XIV"
        source	"14"

If no value given in path, returns result with "undefined" in both fields.

Author: Erno Pakarinen (erpakari@gmail.com)
