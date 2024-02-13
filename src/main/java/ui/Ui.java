package ui;

public class Ui {

    public String showInstructions() {
        return "Please type in:\n"
                + "------------------------\n"
                + "[to record your task(s)/ events]\n"
                + "- todo <task>\n"
                + "- deadline <task> /by <date>\n"
                + "- event <event> /from <date and time> /to <date and time>\n\n"
                + "[to view your task(s)]\n"
                + "- list\n\n"
                + "[to search for tasks containing a keyword]\n"
                + "- find <keyword>\n"
                + "[to mark or unmark your task as done]\n"
                + "- mark <task number in list>\n"
                + "- unmark <task number in list>\n"
                + "[to delete a task]\n"
                + "- delete <task number in list>\n"
                + "-------------------------------------\n";
    }

    public String greet() {
        return "    Hi! I am your favourite friend, Lelu :)\n    What can I do for you?\n";
    }

    public String exit() {
        return "    Ok bye, you shall be missed :(";
    }


    public String dateFormatInstructions() {
        return String.format("    Your date should be in this format:\n    "
                + "<YYYY-MM-DD HH:mm> e.g. 2024-02-03 15:25\n\n");
    }


}
