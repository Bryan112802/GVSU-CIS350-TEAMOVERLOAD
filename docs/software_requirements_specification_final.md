# Overview

This document is to log and create objectives that we wish to accomplish through the Overload application project.
These requirements help envision and express the type of project we wish to create and give us the programmers organization and logging of our features. <br>
<br>
# Software Requirements 
* Windows or Mac OS device
* IntelliJ
<br>

## Functional Requirements

### Exercise Logging
| ID | Requirement |
| :-------------: | :----------: |
| R1 | The program shall allow the user to select their exercise.|
| R2 | The program shall allow the user to input the date of their excersise.|
| R3 | The program shall allow the user to input the amount of sets they are doing for that exercise.|
| R4 | The program shall allow the user to input the amount of weight they are doing for each set of that exercise.|
| R5 | The program shall allow the user to input the amount of reps they are doing for each set of that exercise.|
  
### Display Workout Log History
| ID | Requirement |
| :-------------: | :----------: |
| R1 | The program shall allow the user to view previous workout logs.|
| R2 | The program shall allow the user initiate this function from the main menu.|
| R3 | The program shall format the display to be spaced and easily interpreted by the user.|
| R4 | The program shall get all log history from an array that holds and collects all logs recorded.|
| R5 | The program shall display no log exists if no logs have been created.|
  
### Search Workout Log History
| ID | Requirement |
| :-------------: | :----------: |
| R1 | The program shall allow the user to input a date that the user wants to search for.|
| R2 | The program shall display the log history for the date inputted.|
| R3 | The program shall allow the user to select the search option from the menu.|
| R4 | The program shall not allow invalid user inputs for dates.|
| R5 | The program shall display no log found when the user inputs a date that no log exists for.|
<br>

## Non-Functional Requirements

### Workout Log Display
| ID | Requirement |
| :-------------: | :----------: |
| NFR1 | The application shall get all log data being displayed from the loghistory.txt file.|
| NFR2 | The application shall display the log history within milliseconds of being prompted.|
| NFR3 | The application shall handle as many logs as the user's computer storage permits.|
| NFR4 | The application shall format a user-friendly digestable view for all logs and log creation.|
| NFR5 | The application shall continue to display the log history in a reasonable amount of time as the size of the file increases.|
  
### Menu
| ID | Requirement |
| :-------------: | :----------: |
| NFR1 | The application shall display a user-friendly main menu upon being launched.|
| NFR2 | The application shall provide users with inputs to initiate application functions.|
| NFR3 | The application shall display the main menu once again upon a successful creation of a workout log.|
| NFR4 | The application shall exit the program when the user requests from any menu with a key input.|
| NFR5 | The application shall display new menus upon key inputs and function initiation.|
  
### Application Launch
| ID | Requirement |
| :-------------: | :----------: |
| NFR1 | The application shall launch and operate appropriately on Windows and MacOS devices.|
| NFR2 | The application shall handle a single user locally on their device.|
| NFR3 | The application shall launch quickly and start up within a few seconds.|
| NFR4 | The application shall check for loghistory.txt and create it if it does not exist upon launch.|
| NFR5 | The application shall remain active until the user initiates an exit or force shuts down the program.|
<br>

# Software Artifacts
|[Use Case Diagrams](https://github.com/Bryan112802/GVSU-CIS350-TEAMOVERLOAD/tree/master/artifacts/use_case_diagrams)|

|[Gantt Chart](https://github.com/Bryan112802/GVSU-CIS350-TEAMOVERLOAD/blob/master/docs/gantt-chart.pdf)|

|[Proposal](https://github.com/Bryan112802/GVSU-CIS350-TEAMOVERLOAD/blob/master/docs/proposal-template.md)|

