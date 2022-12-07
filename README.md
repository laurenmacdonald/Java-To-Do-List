# Project-Java-To-Do-List
This Java application fulfills the requirements for the *Logic and Programming I* project. The course was taught at Nova Scotia Community College as part of the IT Programming program during the fall 2022 semester.

## Assigned Project Instructions:
Design and write a program that achieves the following requirements:
- Model a task with a task title, due date, status, and description.
- Display a collection of tasks
- Support the ability to add, edit, mark as done, and remove tasks.
- Support a text-based user interface.
The solution must contain examples demonstrating your understanding of the appropriate use of core Java concepts such as: user input, formatted output, exception handling, data collections like ArrayLists, inheritance, classes, objects, method usage including the use of parameters, polymorphism, and encapsulation.

## Program Walk-Through
This to do list program will allow a user to keep track of tasks, their due dates, description of the task, and task completion status. There are options to update the task status to complete, remove a task completely, edit a task that is already entered and display the entire to-do list in an organized tabular format. Parallel ArrayLists are defined in the class titled 'Task.java' to store the data of task name, due date, description and status, so that the index of each ArrayList element corresponds with each other.

### Program Start:

#### 1. Add an item to your to-do list.
The user is asked to start by adding an item to their to-do list.

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist1.png)

A do-while loop is used to run the addToDo object from the action1 class continuously while the user indicates 'yes' at the prompt: "Type yes to add another item to your to-do list". Once the user indicates anything other than yes, the program will stop the do-while loop and the displayAll object will be called from class action5, displaying all the tasks the user has added to their to-do list.

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist2.png)


#### 2. Mark a task as done.
Upon entering choice '2' as user-input, the taskDone object is called from class action2 and the user is prompted to enter the name of the task they have completed. This will change the data stored in the status ArrayList to say "Completed". In the example below, the task 'get groceries' was changed from 'not started' to 'Completed', as shown in the 'STATUS' column of their to-do list.

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist3.png)


#### 3. Remove a task.
User-input '3' will call the removeTask object from the action3 class. This object takes the user input and iterates through the taskName ArrayList to find a match and uses this location to remove the data in the other ArrayLists using the remove ArrayList method. In the example below the user has removed the task 'rake leaves'.

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist4.png)


#### 4. Edit a task.
User-input '4' will call the editTask object from the action4 class. The user is prompted for the name of the task they would like to change. If the name of the task matches a task name in the taskName ArrayList, the program will iterate through the parallel ArrayLists and use the 'set' ArrayList method to insert new values into the indices of the task name specified.

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist5.png)


#### 5. Display all tasks.
User-input '5' will call the displayAll object from the action 5 class. This object includes formatting of output so that the to-do list data is displayed in a tabular-looking format. The object also iterates through the parallel ArrayLists storing to-do list data and prints the to-do list information. 

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist6.png)


#### 6. Exit.
User-input '6' will indicate to the switch statement to run the 'return' code which will cause the program to finish. As the entire code is within try... catch block, the finally block will run and output "Thank you for using the to do list program!"

![Screenshot of example](https://github.com/laurenmacdonald/Java-To-Do-List/blob/0dd54fc597aaf798af6d81cf7029b957cc951c9d/Images/todolist7.png)
