package Commands;

import Exceptions.LeluException;
import TasksStorage.Storage;
import TasksStorage.TaskList;
import Ui.Ui;

/**
 * This abstract class serves as the base for implementing various commands
 * that the chatbot can understand and execute. Each concrete command should
 * extend this class and implement the execute() method to define its specific
 * functionality.
 */
public abstract class Command {

    /**
     * Command to be executed based on the user input.
     *
     * @param tasks Recorded list of tasks.
     * @param ui Format of output shown.
     * @param storage To save and load tasks recorded.
     * @param message Input of user.
     * @throws LeluException If the input is invalid or with the wrong format.
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage, String message) throws LeluException;
}
