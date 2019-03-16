package by.itacademy.service;

import by.itacademy.domain.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTasksService implements TasksService {
    public static final InMemoryTasksService INSTANCE = new InMemoryTasksService();
    private List<Task> tasks = new ArrayList<>();

    {
        tasks.add(new Task.Builder()
                .name("first")
                .price("42")
                .runTime("12")
                .complexity("HARD")
                .materialCosts("NOTHING")
                .id("1")
                .build());
        tasks.add(new Task.Builder()
                .name("second")
                .price("23")
                .runTime("1")
                .complexity("MEDIUM")
                .materialCosts("LOW")
                .id("2")
                .build());
    }

    private InMemoryTasksService() {
    }

    @Override
    public List<Task> get() {
        return tasks;
    }
}