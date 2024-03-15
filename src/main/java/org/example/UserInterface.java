package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Algorithm algorithm;
    AlgorithmApl algorithmApl;

    public UserInterface(Algorithm algorithm) {
        this.algorithm = algorithm;
        this.algorithmApl = new AlgorithmApl(this.algorithm);
    }

    void start() throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Program started ");
        while (true){
            System.out.println("Choose 1 for inputting test data file");
            System.out.println("Choose 2 for inputting test data manually");
            System.out.println("Choose 3 for changing k");
            System.out.println("Choose 4 to exit from program");
            int des = reader.nextInt();
            if(des == 1){
                System.out.println("Input absolute path for a file");
                String src = reader.next();
                algorithmApl.inputFile(src);
            } else if (des == 2) {
                List<Double> entry = new ArrayList<>();
                while (true){
                    System.out.println("Input numbers , to exit write -1000");
                    double number = reader.nextDouble();
                    if(number != -1000){
                        entry.add(number);
                    }else{
                        break;
                    }
                }
                algorithm.inputTestEntry(entry);
                algorithm.fillLengthLabelList();
                System.out.println(algorithm.labelReturn());
            } else if (des == 3) {
                System.out.println("Input k to change it");
                int k = reader.nextInt();
                algorithm.changeK(k);
                System.out.println("K is changed and now equal to " + k);
            } else if (des == 4) {
                System.exit(0);
            }

        }
    }
}
