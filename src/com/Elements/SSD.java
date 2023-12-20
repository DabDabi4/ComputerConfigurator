package com.Elements;

public class SSD extends ComputerName {

    private final String componentName = "SSD";

    public SSD(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
