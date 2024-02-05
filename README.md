# BDDTestAutomationFrameWork
 BDD framework without page objects.

 OS- Windows OS

Sturcture:
Framework : Cucumber Framework.
ProjectType : Maven Poject with POM.xlm (To add required dependencies).
TestRunner : We can use both TestNG / JUnit to run the project by importing required type.(After importing the type(TestNG/JUnit) we just have to extend the class in testRunner file).
             Then we can just right click in testRunner file and choose the TestNG/JUnit accordingly.

Working:
This Framework contains Feature file and associated to that one step file.
All the feature steps are to be defined in step definition file.
And in step definition file we will just initialize the web browser Driver and we can add the UI Automatio code.
Each cod ewill be inside of the step def of a particualr feature step so that it will only executes that pasrticular step.

Run:
To Run the project we have created TestRunner.java file.
But Before that we can run it form feature file it self by right click > Run As > Cucumber Feature.

Result:
Here in this project we are using htmlreport.html declaring in TestRunner file.
Fter running the test runner file it will start web browser and after finishing all the feature steps it will create a htmlreport.htlm file under Target Folder.
It will be accessible with browser and it will alsi showcase the screeshot of every step completion.
