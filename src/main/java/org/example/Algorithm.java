package org.example;

import java.util.*;

public class Algorithm {
    int k = 1;
    List<Training_Entry> trainingData = new ArrayList<>();
    Test_Entry testEntry;
    List<LengthLabelObject> lengthLabelList = new ArrayList<>();

    void changeK(int k){
        this.k = k;
        System.out.println("Changed k to " + k);
    }

    void inputTestEntry(float firstNumber, float secondNumber, float thirdNumber, float fourthNumber){
        this.testEntry = new Test_Entry(firstNumber, secondNumber, thirdNumber, fourthNumber );
    }

    void fillLengthLabelList(){
        for (Training_Entry training: trainingData) {
            float length;
            length = (float) Math.sqrt((testEntry.firstNumber - training.firstNumber)*(testEntry.firstNumber - training.firstNumber) +
                                       (testEntry.secondNumber - training.secondNumber)*(testEntry.secondNumber - training.secondNumber) +
                                       (testEntry.thirdNumber - training.thirdNumber)*(testEntry.thirdNumber - training.thirdNumber) +
                                       (testEntry.fourthNumber - training.fourthNumber)*(testEntry.fourthNumber - training.fourthNumber));
            lengthLabelList.add(new LengthLabelObject(length, training.label));
        }
        Collections.sort(lengthLabelList);
        for (LengthLabelObject obj: lengthLabelList) {
            System.out.println("Length is " + obj.length +" Label is " + obj.label);
        }
    }



}
