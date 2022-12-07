package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    This to do list program will allow a user to keep track of tasks, their due dates,
    description of the task, and task completion status. There are options to update the task
    status to complete, remove a task completely, edit a task that is already entered and display
    the entire to-do list in an organized tabular format.
    Parallel ArrayLists are defined in the class titled 'Task.java' to store the data of
    task name, due date, description and status, so that the index of each ArrayList element corresponds
    with each other.
     */
    public static void main(String[] args) {
        try {
            //Calling on classes with objects for the required functionality of the to do list program.
            Scanner input = new Scanner(System.in);
            Task task = new Task();
            action1 addToDo = new action1();
            action2 taskDone = new action2();
            action3 removeOne = new action3();
            action4 editTask = new action4();
            action5 displayAll = new action5();

            //Declaring the ArrayList which holds the options of the to do list program functionality to iterate through.
            ArrayList<String> actions = new ArrayList<>();
            actions.add("1. Add item to your to do list");
            actions.add("2. Mark a task as done");
            actions.add("3. Remove a task");
            actions.add("4. Edit a task");
            actions.add("5. Display all tasks");
            actions.add("6. Exit");

            //Declaring variables for retrieving user input within main.
            String status;
            Scanner choiceScanner = new Scanner(System.in);

        /*
        PROGRAM START: user is asked to start by adding an item to their to do list.
        A do while loop is used to  run the addToDo object from the action1 class continuously while the user
        indicates 'yes' at the prompt: "Type yes to add another item to your to do list".
        Once the user indicates anything other than yes, the program will stop the do while loops and
        the displayAll object from action5 will run, displaying all the tasks they have added to their to do list.
         */
            System.out.println("WELCOME TO YOUR TO DO LIST! \nTo start... ");
            do {
                addToDo.addToDo(task);
                System.out.println("Type yes to add another item to your to do list:");
                status = input.nextLine();
            }
            while ("yes".equalsIgnoreCase(status));
            displayAll.displayAll(task);
            /*
            Using a while loop to continuously prompt the user for input, the actions arraylist is iterated
            through and the user is prompted for a numerical selection. A switch statement is used to run
            the code of the specified object that is called up on. If the user selects input 6 (exit), the program
            will be finished.
             */
            while (true) {
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("What would you like to do?");
                for (String action : actions) {
                    System.out.println(action);
                }
                System.out.println("Type your choice here as a number here: ");
                switch (choiceScanner.nextInt()) {
                    case 1:
                        /*Using a do while loop, user will be prompted to type yes to continuously add
                        items to their to do list until otherwise indicated.
                         */
                        do {
                            addToDo.addToDo(task);
                            System.out.println("Type yes to add another item to your to do list:");
                            status = input.nextLine();
                        }
                        while ("yes".equalsIgnoreCase(status));
                        break;
                    case 2:
                        taskDone.taskDone(task);
                        break;
                    case 3:
                        removeOne.removeOne(task);
                        break;
                    case 4:
                        editTask.editTask(task);
                        break;
                    case 5:
                        displayAll.displayAll(task);
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Not an option, try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Thank you for using the to do list program!");
        }
    }
}