package ToDoList;

public class action2 extends Task {
    public void taskDone(Task task) {
        System.out.println("Type the name of the task you have completed: ");
        String completedTask = input.nextLine();
        for (int j = 0; j < task.taskName.size(); j++) {
            if (completedTask.equalsIgnoreCase(task.taskName.get(j))) {
                task.taskStatus.set(j, "Completed");
            }
        }
    }
}
