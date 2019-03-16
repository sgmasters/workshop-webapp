package by.itacademy.operation.sort;

import by.itacademy.domain.Task;
import by.itacademy.operation.Operation;
import by.itacademy.operation.exception.OperationException;
import by.itacademy.service.InMemoryTasksService;
import by.itacademy.service.TasksService;

import java.util.List;

public class SortOperation implements Operation {
    private TasksService tasksService = InMemoryTasksService.INSTANCE;

    public List<Task> execute(String key) throws OperationException {
        List<Task> sorted = tasksService.get();
        try {
            sorted.sort(OrderKey.getComparatorBy(key));
        } catch (IllegalArgumentException e) {
            throw new OperationException("Wrong argument");
        }
        return sorted;
    }
}