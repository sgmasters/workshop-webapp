package by.itacademy.operation;

import by.itacademy.domain.Task;
import by.itacademy.operation.exception.OperationException;

import java.util.List;

public interface Operation {
    List<Task> execute(String key) throws OperationException;
}