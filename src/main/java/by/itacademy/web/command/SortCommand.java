package by.itacademy.web.command;

import by.itacademy.domain.Task;
import by.itacademy.operation.exception.OperationException;
import by.itacademy.operation.sort.SortOperation;
import by.itacademy.service.InMemoryTasksService;
import by.itacademy.web.command.exception.IllegalCommandException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SortCommand implements Command {
    private List<Task> tasks = InMemoryTasksService.INSTANCE.get();

    @Override
    public void execute(HttpServletRequest request) throws IllegalCommandException {
        String key = request.getParameter("orderKey");
        if (key != null) {
            try {
                tasks = new SortOperation().execute(key);
            } catch (OperationException | IllegalArgumentException e) {
                throw new IllegalCommandException(e.getMessage());
            }
        }
        request.setAttribute("tasks", tasks);
        request.setAttribute("page", "/WEB-INF/domain/list.jsp");
    }
}