package com.Elements;

public class Monitor extends ComputerName {

    private final String componentName = "Монітор";

    public Monitor(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
