package by.itacademy.web.command;

import by.itacademy.web.command.exceptions.IllegalCommandException;

public enum Commands {
    GET_TASKS_LIST(new ListCommand(), "GET", "/tasks");

    private Command command;
    private String method;
    private String uri;

    Commands(Command command, String method, String uri) {
        this.command = command;
        this.method = method;
        this.uri = uri;
    }

    public static Command valueOf(String method, String uri) throws IllegalCommandException {
        for (Commands command : values()) {
            if (command.method.equals(method) && command.uri.equals(uri)) {
                return command.command;
            }
        }
        throw new IllegalCommandException("No such command");
    }
}