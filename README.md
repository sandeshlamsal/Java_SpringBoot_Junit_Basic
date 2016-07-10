# SpringBootJunitBasic

STS is used
use the default new project->spring starter project

just change the pom.xml  don't need any configuration

add the controller to do your function.

Application is the main startup points...



Create a Maven project
Add the two dependencies ** spring-boot-starter-web ** spring-boot-starter-test
Create a class with the annotation @SpringBootApplication which is equivalent to three annotations ** @Configuration -- indicate this class is a configuration class ** @EnableAutoConfiguration -- tries to automatically configure best on classpath and its best guess ** @ComponentScan -- provides component scanning directive
File has a main method
Spring boot scans all package below its main application class. Otherwise you will have to add the @ComponentScan annotation and provide the packages to scan.
How to run

From the command line mvn spring-boot:run
Eclips -> Run As -> Maven Build -> Goal -> spring-boot:run
Right click the Application.java class, run as java application  or run with java boot appliation.

Ref: https://github.com/rajanpupa/SpringBootWorkspace/tree/master/01_Start


Junit is a sample for the unit testing.
for this just get the junit package and check the condition with assert. run the file with junit
