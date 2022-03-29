# docker-spring-boot
containerizing a simple book service application
### Steps to Run:
1. Download the project from the github
2. Open the terminal to the appropriate path and apply ```mvn clean install``` command
3. Now build the docker image of the application using ```docker build -t surveyimg .```
4. Then, run the image with command ```docker run surveycontainer --td -p 8080:8080 surveyimg```
5. Open the browser and hit the link http://localhost:8080/book