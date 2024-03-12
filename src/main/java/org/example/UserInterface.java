package org.example;

import java.util.Scanner;

public class UserInterface {
    Algorithm algorithm = new Algorithm();

    void start(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Program started ");
        while (true){
            System.out.println("Choose 1 for inputting test data file");
            System.out.println("Choose 2 for inputting test data manually");
            System.out.println("Choose 3 for changing k");
            System.out.println("Choose 4 to exit from program");
            int des = reader.nextInt();
        }
    }
}
