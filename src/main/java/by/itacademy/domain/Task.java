package by.itacademy.domain;

import java.util.Objects;

public class Task {
    private String name;
    private double runTime;
    private int price;
    private Complexity complexity;
    private MaterialCosts materialCosts;
    private int id;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public MaterialCosts getMaterialCosts() {
        return materialCosts;
    }

    public double getRunTime() {
        return runTime;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task service = (Task) o;
        return Double.compare(service.runTime, runTime) == 0 &&
                price == service.price &&
                Objects.equals(name, service.name) &&
                complexity == service.complexity &&
                materialCosts == service.materialCosts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runTime, price, complexity, materialCosts);
    }

    public static class Builder {
        private Task service = new Task();

        public Builder name(String name) {
            service.name = name;
            return this;
        }

        public Builder runTime(String runTime) {
            service.runTime = Double.valueOf(runTime);
            return this;
        }

        public Builder price(String price) {
            service.price = Integer.valueOf(price);
            return this;
        }

        public Builder complexity(String complexity) {
            service.complexity = Complexity.valueOf(complexity);
            return this;
        }

        public Builder materialCosts(String materialCosts) {
            service.materialCosts = MaterialCosts.valueOf(materialCosts);
            return this;
        }

        public Builder id(String id) {
            service.id = Integer.valueOf(id);
            return this;
        }

        public Task build() {
            return service;
        }

    }
}