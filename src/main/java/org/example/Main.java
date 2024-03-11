package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Training_Data_Manager trainingDataManager = new Training_Data_Manager();
        trainingDataManager.inputTrainingData();

        Algorithm algorithm = new Algorithm();
        algorithm.trainingData = trainingDataManager.trainingData;

        algorithm.inputTestEntry(1, 1 ,1 , 1);
        algorithm.fillLengthLabelList();
    }
}

