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
        UserInterface userInterface = new UserInterface(algorithm);
        userInterface.start();
    }
}

