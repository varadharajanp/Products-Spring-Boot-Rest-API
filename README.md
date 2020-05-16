# Products-Spring-Boot-Rest-API

1)  Prerequisites:
      Java JDK 11 
      Maven compatibile with JDK 11  or 3.6
      STS IDE
      Postman tool (optional, will be used for testing web service)
  
  
2)  Steps to Setup

      1.	Clone/Download the application
      2.	UnZip the folder
      3.	Open the  Commmand Prompt 
      4.	Go to the Project Folder  ex : cd Products-Spring-Boot-Rest-API-master
      5.	Set Class Path Variable JAVA_HOME and MAVEN_HOME in PATH 


3)  Run the application 
        Run the following commands in the  Commmand Prompt 
          mvn clean install
          mvn spring-boot:run
	
4)  Samples of requests to the API: 

      1.	http://localhost:8080/api/getproductdetails

        User : user
        Password : password

      2.	http://localhost:8080/api/getconfigdetails

        User : admin
        Password : password

        
