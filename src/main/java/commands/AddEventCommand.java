package commands;

import exceptions.LeluException;
import tasks.Event;
import tasks.Task;
import tasksstorage.Storage;
import tasksstorage.TaskList;
import ui.Ui;

/**
 * This class represents a command for adding an event task to the task list
 * managed by the chatbot. When executed, this command parses user input to extract
 * the event task details and adds it to the task list, along with the specified
 * start and end timings of the event.
 */
public class AddEventCommand extends Command {

    /**
     * Executes the command to add an event to the list of recorded tasks.
     *
     * @param tasks Recorded list of tasks.
     * @param ui Format of output shown.
     * @param storage To save and load tasks recorded.
     * @param message Input of user.
     * @throws LeluException If the input is invalid or with the wrong format.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage, String message) throws LeluException {
        Task t = Event.EventOf(message);
        tasks.addTask(t);
    }
}
