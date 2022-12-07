package ToDoList;

public class action1 extends Task {
    public void addToDo(Task task) {

        System.out.println("Add a task to your to do list: ");
        task.taskName.add(input.nextLine());
        System.out.println("When is the due date? (dd-MMM-yyyy): ");
        task.dueDate.add(input.nextLine());
        System.out.println("Give a description of the task: ");
        task.taskDescription.add(input.nextLine());
        System.out.println("What is the status of the task? Not started, in progress or completed?: ");
        task.taskStatus.add(input.nextLine());
    }
}
