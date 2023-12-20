package com.Elements;

abstract class ComputerName {

    protected final String model;

    protected ComputerName(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
