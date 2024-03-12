package org.example;

import java.util.ArrayList;
import java.util.List;

public class Training_Entry {
    String label;
    List<Float> points;

    public Training_Entry(String label, List<Float> points) {
        this.label = label;
        this.points = points;
    }
}
