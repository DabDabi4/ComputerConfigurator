package com.Elements;

public class Keyboard extends ComputerName {

    private final String componentName = "Клавіатура";

    public Keyboard(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
