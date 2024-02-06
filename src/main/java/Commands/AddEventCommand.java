package Commands;

import Exceptions.LeluException;
import Tasks.Event;
import Tasks.Task;
import TasksStorage.Storage;
import TasksStorage.TaskList;
import Ui.Ui;

public class AddEventCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage, String message) throws LeluException {
        Task t = Event.EventOf(message);
        tasks.addTask(t);
    }
}
