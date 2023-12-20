package com.Elements;

public class HDD extends ComputerName {

    private final String componentName = "HDD";

    public HDD(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
