package Tasks;

/**
 * This is an abstract class representing a task by encapsulating information, such as the description
 * of the task, and performing basic functions involving the task.
 */
public abstract class Task {
    protected String taskName;
    protected boolean completed;

    public Task(String task) {
        this.taskName = task;
    }

    public void markTask() {
        this.completed = true;
    }
    public void unmarkTask() {
        this.completed = false;
    }
    public abstract String saveFormat();
    @Override
    public String toString() {
        String check = completed ? "[X]" : "[ ]";
        return check + " " + this.taskName;
    }
}
