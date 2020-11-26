### countryserviceExercise_backend

Spring Boot 2.3.5 Based Backend Service
Application: Country Service

Port: 8081

# Installation
 Checkout the repository country-service using GIT command or IDE.

Download the JDK from oracle site and you can add that to IDE. (minimun Java 8 version)

Make sure Java version in pom and the downloaded version are same

As this is a maven based spring boot application, we can simply use maven clean install to download all the spring dependencies

Now launch the application class com.rcmcode.countryservice.CountryServiceApplication.

Please ignore the "conuntryServiceBack-0.0.1-SNAPSHOT.jar" file to run this in your IDE at the begining. 


## Application can be accessed using below URL's


http://localhost:8081/country-app/countries

http://localhost:8081/country-app/countries/<name>
  
  
  ## To rub directly in your system with executable jar file
  
  Download the "conuntryServiceBack-0.0.1-SNAPSHOT.jar" file from the repo directory.
  
  Open notepad and write "java -jar conuntryServiceBack-0.0.1-SNAPSHOT.jar" and save it with ".bat" extention in the same directory. 
  
  Run the jar file.
  
  Go to to http://localhost:8081/country-app/countries to check the functionalities
