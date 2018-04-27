# Trackmystuff

This is a sample project written in Spring Boot using Gradle 4.0 (or later) and Java 8. The application is a REST Service to track "stuff" you might own (basically, where your stuff is kept).

This is a starting point to show how to add environment-specific properies to your application.

These properties are shown through creating simple Spring Boot REST controller.

Currently there is no exception handling. This is just a simple proof-of-concept starting point. 

## Getting Started

I have included a README.txt file which I include some notes on how I created this application and my intentions.

### Prerequisites

You will need Java 8 installed and running on your system.

You will need Gradle 4.0 (or later).

Since this was build with the Spring Intitialzr, Gradle Wrapper files are also contained in this project.

### Installing

This Gradle Project includes the default Gradle tasks and runs on port 8080 (the default Spring Boot Application port).

gradle clean build
gradle bootRun

then go to:

http://localhost:8080/trackmystuff

or

http://localhost:8080/trackmystuff/message


## Running the tests

Right now there are Integration Tests to verify each configuration environment and a Simple default

Because This particular project is just to show how to use a simple configuration class and property files, there are no Unit tests (future examples will have unit tests)

You can run the tests either inside an IDE, of via the command line using

gradle test

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
