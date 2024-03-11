package org.example;

public class LengthLabelObject implements  Comparable<LengthLabelObject>{
    float length;
    String label;

    public LengthLabelObject(float length, String label) {
        this.length = length;
        this.label = label;
    }

    @Override
    public int compareTo(LengthLabelObject other) {
        return Float.compare(this.length, other.length);
    }
}
