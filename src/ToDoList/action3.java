package ToDoList;

public class action3 extends Task {
    public void removeOne(Task task) {
        System.out.println("Type the name of the task you want to remove: ");
        String taskToRemove = input.nextLine();
        for (int k = 0; k < task.taskName.size(); k++) {
            if (taskToRemove.equalsIgnoreCase(task.taskName.get(k))) {
                task.taskName.remove(k);
                task.dueDate.remove(k);
                task.taskDescription.remove(k);
                task.taskStatus.remove(k);
            }
        }

    }
}
