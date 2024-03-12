package org.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Training_Data_Manager trainingDataManager = new Training_Data_Manager();
        trainingDataManager.inputTrainingData();

        Algorithm algorithm = new Algorithm();
        algorithm.trainingData = trainingDataManager.trainingData;
        List<Float> test = new ArrayList<>();
        test.add(1.0F);
        test.add(1.0F);
        test.add(1.0F);
        test.add(1.0F);
        algorithm.inputTestEntry(test);
        algorithm.fillLengthLabelList();
        System.out.println("Label is " + algorithm.labelReturn());
    }
}

