package by.itacademy.web.command;

import by.itacademy.web.command.exception.IllegalCommandException;

public enum CommandForRequest {
    GET_TASKS_LIST(new ListCommand(), "GET", "/tasks"),
    POST_SORT(new SortCommand(), "POST", "/tasks");

    private Command command;
    private String method;
    private String uri;

    CommandForRequest(Command command, String method, String uri) {
        this.command = command;
        this.method = method;
        this.uri = uri;
    }

    public static Command valueOf(String method, String uri) throws IllegalCommandException {
        for (CommandForRequest command : values()) {
            if (command.method.equals(method) && command.uri.equals(uri)) {
                return command.command;
            }
        }
        throw new IllegalCommandException("No such command");
    }
}