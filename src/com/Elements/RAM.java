package com.Elements;

public class RAM extends ComputerName {

    private final String componentName = "RAM";

    public RAM(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
