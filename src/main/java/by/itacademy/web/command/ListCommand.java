package by.itacademy.web.command;

import by.itacademy.service.InMemoryTasksService;
import by.itacademy.service.TasksService;

import javax.servlet.http.HttpServletRequest;

public class ListCommand implements Command {
    private TasksService tasksService = InMemoryTasksService.INSTANCE;

    @Override
    public void execute(HttpServletRequest request) {
        request.setAttribute("tasks", tasksService.get());
        request.setAttribute("page", "/WEB-INF/domain/list.jsp");
    }
}