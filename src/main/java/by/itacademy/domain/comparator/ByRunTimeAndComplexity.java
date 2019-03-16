package by.itacademy.domain.comparator;

import by.itacademy.domain.Task;

import java.util.Comparator;

public class ByRunTimeAndComplexity implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        int result = Double.compare(o1.getRunTime(), o2.getRunTime());
        return (result != 0) ? result : o2.getComplexity().name().compareTo((o1.getComplexity().name()));
    }
}