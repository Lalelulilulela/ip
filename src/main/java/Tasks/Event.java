package Tasks;

import Exceptions.InvalidFormatException;
import Exceptions.LeluException;

public class Event extends Task {
    protected String from;
    protected String to;

    public Event(String taskName, String from, String to) {
        super(taskName);
        this.from = from;
        this.to = to;
    }

    public static Event EventOf(String input) throws InvalidFormatException {
        if (input.replaceAll(" ", "").equals("event")) {
            InvalidFormatException.callInvalidFormatException(LeluException.ErrorType.EVENT);
        }
        String[] t = input.replaceFirst("event ", "").split("/from ");
        if (t.length < 2) {
            InvalidFormatException.callInvalidFormatException(LeluException.ErrorType.EVENT);
        }
        String[] frTo = t[1].split("/to ");
        if (frTo.length < 2) {
            InvalidFormatException.callInvalidFormatException(LeluException.ErrorType.EVENT);
        }
        return new Event(t[0], frTo[0], frTo[1]);
    }
    @Override
    public String saveFormat() {
        int check = this.completed ? 1 : 0;
        return String.format("E | %d | %s | %s | %s\n", check, this.taskName, this.from, this.to);
    }
    @Override
    public String toString () {
        return String.format("[E]%s (From: %s To: %s)", super.toString(), this.from, this.to);
    }
}
