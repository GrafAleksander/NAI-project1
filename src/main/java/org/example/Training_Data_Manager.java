package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Training_Data_Manager {
    List<Training_Entry> trainingData = new ArrayList<>();

    void inputTrainingData() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\s28693\\IdeaProjects\\NAI-project1\\src\\main\\java\\org\\example\\train.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            String[] parts = line.split(",");
            List<Float> points = new ArrayList<>();
            for (int i = 0; i < parts.length - 2; i++) {
                points.add(Float.parseFloat(parts[i]));
            }
            trainingData.add(new Training_Entry(
                    parts[parts.length - 1],
                    points));
        }
        System.out.println("Finished reading training Data");

    }
}
