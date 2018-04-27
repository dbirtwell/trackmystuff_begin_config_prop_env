This is a sample Demo/Test Program to Play With Spring Boot and REST

This one is to show how to handle
Configuration
Property files based upon the setting:
spring.profiles.active=dev

which is etither in:
1) aapplication.properties (the default property file)
2) Passed in via the command line as -Dspring.profiles.active=dev


NOTES:
-Dspring.profiles.active=dev

Generated using spring boot initializr

see the screenshot --> SpringBootInitializr.PNG

Changed the following in the build.gradle file -->
	compile('org.springframework.boot:spring-boot-starter')
To
	compile('org.springframework.boot:spring-boot-starter-web')
So w this project would support a REST application

1) Renamed
TrackmystuffBeginApplication to Application

Can also use the following at the command line to set the "active" profile
-Dspring.profiles.active=dev

To view the REST enoints for configuration go to:

http://localhost:8080/trackmystuff/
http://localhost:8080/trackmystuff/message

-----
TODO:
-----
Use Optional


