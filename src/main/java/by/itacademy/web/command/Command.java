package by.itacademy.web.command;

import by.itacademy.web.command.exception.IllegalCommandException;

import javax.servlet.http.HttpServletRequest;

public interface Command {
    void execute(HttpServletRequest request) throws IllegalCommandException;
}