package org.example;


import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Training_Data_Manager trainingDataManager = new Training_Data_Manager();
        trainingDataManager.inputTrainingData();
        Algorithm algorithm = new Algorithm();
        algorithm.trainingData = trainingDataManager.trainingData;
        /*List<Double> test = new ArrayList<>();
        test.add(5.5);
        test.add(4.2);
        test.add(1.4);
        test.add(0.2);
        algorithm.inputTestEntry(test);
        algorithm.fillLengthLabelList();
        System.out.println("Label is " + algorithm.labelReturn());*/
        AlgorithmApl algorithmApl = new AlgorithmApl(algorithm);
        algorithmApl.inputFile();

        /*for (int i = 0; i < trainingDataManager.trainingData.size(); i++) {
            System.out.println(trainingDataManager.trainingData.get(i).label);
        }*/
    }
}

