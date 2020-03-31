# Upcoming Movies Web App

## Server - Spring Boot
The server side of the app was built based on the CQRS Architecture. Since it is a "GET only" API with no data to persist.

#### Application setup:

##### Install Lombok (Eclipse)
* Download lombok version 1.18.4 in [https://projectlombok.org/download](https://projectlombok.org/download)
* Execute Installer 'java -jar lombok.jar'
* Search eclipse directory and install
* Reboot eclipse


## Client - Angular 9

#### Assumptions 
* Will assume movie filtering option will return all movies and not just the upcoming ones.

#### Observations
* For the movie card listing I had to make it as simple as possible with the time I had, so it was used basic bootstrap templates.

#### TODO
* GET genres from API
* Fix CORS issue