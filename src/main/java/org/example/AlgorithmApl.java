package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmApl {
    Algorithm algorithm;

    public AlgorithmApl(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    void inputFile(String src) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(src));
        String line;
        int countT=0, count =0;
        while ((line = fileReader.readLine()) != null){
            String[] parts = line.split(",");
            List<Double> points = new ArrayList<>();
            for (int i = 0; i < parts.length - 2; i++) {
                points.add(Double.parseDouble(parts[i]));
            }
            /*for (int i = 0; i < points.size(); i++) {
                System.out.println(points.get(i));
            }*/
            algorithm.inputTestEntry(points);
            algorithm.fillLengthLabelList();
            String res = algorithm.labelReturn();
            System.out.println("Label in test data " + parts[parts.length - 1] + " vs our " + res);
             count++;
             if(parts[parts.length - 1].equals(res)){
                 countT++;
             }
        }
        System.out.println("Count total " + count + " Correct count " + countT);
        double correctness = ((double)countT/ (double)count)*100;
        System.out.println("Correctness is " + correctness);
    }
}
