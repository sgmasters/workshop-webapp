package by.itacademy.domain.comparator;

import by.itacademy.domain.Task;

import java.util.Comparator;

public class ById implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getId() - o2.getId();
    }
}