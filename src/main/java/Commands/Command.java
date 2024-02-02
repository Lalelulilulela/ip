package Commands;

import Exceptions.LeluException;
import Tasks.Task;
import TasksStorage.Storage;
import UI.Ui;

import java.util.ArrayList;

public abstract class Command {
    public abstract void execute(ArrayList<Task> tasks, Ui ui, Storage storage, String message) throws LeluException;
}
