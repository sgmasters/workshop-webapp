package by.itacademy.operation.sort;

import by.itacademy.domain.comparator.ById;
import by.itacademy.domain.comparator.ByRunTimeAndComplexity;

import java.util.Comparator;

public enum OrderKey {
    BY_ID("ById", new ById()),
    BY_RUNTIME_AND_COMPLEXITY("ByRunTimeAndComplexity", new ByRunTimeAndComplexity());

    private String value;
    private Comparator comparator;

    OrderKey(String value, Comparator comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    public static Comparator getComparatorBy(String value) throws IllegalArgumentException {
        for (OrderKey key : values()) {
            if (key.value.equals(value)) {
                return key.comparator;
            }
        }
        throw new IllegalArgumentException("No such order key");
    }

    public String getValue() {
        return value;
    }
}