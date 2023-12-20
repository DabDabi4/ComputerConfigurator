package com.Elements;

public class Mouse extends ComputerName {

    private final String componentName = "Мишка";

    public Mouse(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
