package ToDoList;

public class action5 extends Task {
    public void displayAll(Task task) {
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("You have " + task.taskName.size() + " item(s) on your to do list.");
        System.out.println("Here are all the items on your to do list: ");
        System.out.printf("%-18s %-15s %-50s %-20s%n", "TASK", "DUE DATE", "DESCRIPTION", "STATUS");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 0; i < task.taskName.size(); i++) {
            System.out.printf("%-18s %-15s %-50s %-20s%n", task.taskName.get(i), task.dueDate.get(i), task.taskDescription.get(i), task.taskStatus.get(i));
        }
    }
}
