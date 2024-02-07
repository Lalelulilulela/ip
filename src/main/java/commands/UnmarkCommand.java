package commands;

import exceptions.LeluException;
import tasksstorage.Storage;
import tasksstorage.TaskList;
import ui.Ui;

/**
 * This class represents a command for marking a task as not completed in the task list
 * managed by the chatbot. When executed, this command updates the status of the
 * specified task to indicate that it has not been completed.
 */
public class UnmarkCommand extends Command {

    /**
     * Executes the command to mark a task in the list of recorded tasks as not done.
     *
     * @param tasks Recorded list of tasks.
     * @param ui Format of output shown.
     * @param storage To save and load tasks recorded.
     * @param message Input of user.
     * @throws LeluException If the input is invalid or with the wrong format.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage, String message) throws LeluException {
        int i = Integer.parseInt(message.split(" ")[1]) - 1;
        tasks.unmarkTask(i);
    }
}
