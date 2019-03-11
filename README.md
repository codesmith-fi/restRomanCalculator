Spring Boot REST service to convert between integers and Roman Numerals

This is a simple training practise with Spring Boot and Gradle. Implements 
two controllers to handle GET requests for conversion operations.

This is one of the first training practises with Spring Boot for me so this
is very incomplete. I did not do this with TDD because at this point I don't
know how to test the Controllers and actions properly. Next step for me is
to learn how to do testing in this environment.

Compile with gradle
    ./gradlew build

Run with
    java -jar build/libs/rest-romancalculator-1.0.0.jar

    (There is a gradle task 'bootRun' but it does not work at this point)

Note! This works in my Linux Ubuntu 18 environment 
(openjdk version "10.0.2" 2018-07-17) but for some reason on Windows I 
could not get it to work. Compiling works but accessing the service URIs
causes an error telling that the request mapping does not work. 
This probably means that Spring Application can't find the controllers even
they (and other classes) are located in the same package. One of the
things I have to learn :-)


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
