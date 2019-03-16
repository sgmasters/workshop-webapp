package by.itacademy.operation;

import by.itacademy.domain.Task;
import by.itacademy.operation.exception.OperationException;
import by.itacademy.operation.sort.SortOperation;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortOperationTest {
    @Test(expected = OperationException.class)
    public void executeShouldEqualsObjectsSortedById() throws OperationException {
        List<Task> sorted = new SortOperation().execute("by.id");
        List<Task> expected = new ArrayList<>();
        expected.add(new Task.Builder().name("Creation 2D layout by template")
                .runTime("50")
                .price("20")
                .complexity("SIMPLE")
                .materialCosts("NOTHING")
                .build());
        expected.add(new Task.Builder().name("Workshop rent")
                .runTime("8")
                .price("1000")
                .complexity("SIMPLE")
                .materialCosts("AVERAGE")
                .build());
        expected.add(new Task.Builder().name("Repair light box")
                .runTime("15")
                .price("1200")
                .complexity("HARD")
                .materialCosts("AVERAGE")
                .build());
        Assert.assertEquals(expected, sorted);
    }

    @Test(expected = OperationException.class)
    public void executeShouldEqualsObjectsSortedByRunTimeAndComplexity() throws OperationException {
        List<Task> sorted = new SortOperation().execute("ByRunTimeAndComplexity");
        List<Task> expected = new ArrayList<>();
        expected.add(new Task.Builder().name("Workshop rent")
                .runTime("8")
                .price("1000")
                .complexity("SIMPLE")
                .materialCosts("AVERAGE")
                .build());
        expected.add(new Task.Builder().name("Repair light box")
                .runTime("15")
                .price("1200")
                .complexity("HARD")
                .materialCosts("AVERAGE")
                .build());
        expected.add(new Task.Builder().name("Creation 2D layout by template")
                .runTime("50")
                .price("20")
                .complexity("SIMPLE")
                .materialCosts("NOTHING")
                .build());
        Assert.assertEquals(expected, sorted);
    }
}