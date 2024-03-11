package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training_Data_Manager {
    List<Training_Entry> trainingData = new ArrayList<>();

    void inputTrainingData() throws IOException {
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Input path to the training data: ");
        //String filePath = reader.next();

        BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\Aleks\\UTP\\NAI-project1\\src\\main\\java\\org\\example\\train.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            String[] parts = line.split(",");
            trainingData.add(new Training_Entry(
                    parts[4],
                    Float.parseFloat(parts[0]),
                    Float.parseFloat(parts[1]),
                    Float.parseFloat(parts[2]),
                    Float.parseFloat(parts[3])));
        }
        System.out.println("Finished reading training Data");

    }
}
