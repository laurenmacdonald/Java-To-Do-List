package ToDoList;

public class action4 extends Task {
    public void editTask(Task task) {
        System.out.println("Type the name of the task you want to change: ");
        String taskToEdit = input.nextLine();
        for (int l = 0; l < task.taskName.size(); l++) {
            if (taskToEdit.equalsIgnoreCase(task.taskName.get(l))) {
                System.out.println("New name of task: ");
                task.taskName.set(l, input.nextLine());
                System.out.println("Due date: ");
                task.dueDate.set(l, input.nextLine());
                System.out.println("Description: ");
                task.taskDescription.set(l, input.nextLine());
                System.out.println("Status (Not started, in progress, completed): ");
                task.taskStatus.set(l, input.nextLine());
            }
        }
    }
}
