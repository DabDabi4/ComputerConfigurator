package com.Elements;

public class VideoCard extends ComputerName {

    private final String componentName = "Відеокарта";

    public VideoCard(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
