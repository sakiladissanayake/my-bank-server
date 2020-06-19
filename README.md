# my-bank-server

## Instructions

To install, clone or download the repository.

Open the project using code editor like Eclipse.

Right click on the project -> Maven -> Update Project, Select the project and click Ok button.

Right click on the project -> Run As -> Maven build, Set Goal as "clean install" and click Run button.

Then Right click on the "MybankserverApplication.java" file and click Run As -> Java Apllication


Server started on port 8080


## endpoints

Request Token: http://localhost:8080/authenticate
This endpoint check the user credintials and send the token.

All Employees: http://localhost:8080/getEmployees
This endpoint return the all employees.

