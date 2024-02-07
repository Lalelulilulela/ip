package lelu;

import commands.AddDeadlineCommand;
import commands.AddEventCommand;
import commands.AddToDoCommand;
import commands.ByeCommand;
import commands.Command;
import commands.DeleteCommand;
import commands.ListCommand;
import commands.MarkCommand;
import commands.UnmarkCommand;
import exceptions.InvalidInputException;
import exceptions.LeluException;
import ui.Ui;

public class Parser {
    public static Command parse(String message, Ui ui) throws LeluException {
        if (message.equals("bye")) {
            return new ByeCommand();
        } else if (message.equals("list")) {
            return new ListCommand();
        }
        switch (message.split(" ")[0]) {
        case "mark":
            return new MarkCommand();
        case "unmark":
            return new UnmarkCommand();
        case "delete":
            return new DeleteCommand();
        case "todo":
            return new AddToDoCommand();
        case "deadline":
            return new AddDeadlineCommand();
        case "event":
            return new AddEventCommand();
        default:
            throw new InvalidInputException(ui.showInstructions());
        }
    }
}
