package com.Elements;

public class Processor extends ComputerName {

    private final String componentName = "Процесор";

    public Processor(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
