package org.example;

import java.util.*;

public class Algorithm {
    int k = 2;
    List<Training_Entry> trainingData = new ArrayList<>();
    Test_Entry testEntry;
    List<LengthLabelObject> lengthLabelList = new ArrayList<>();

    void changeK(int k){
        this.k = k;
        System.out.println("Changed k to " + k);
    }

    void inputTestEntry(List<Double> testPoints){
        this.testEntry = new Test_Entry(testPoints);
    }

    void fillLengthLabelList(){
        int count = 1;
        for (Training_Entry training: trainingData) {
            double lengthInit = 0;
            for (int i = 0; i < training.points.size(); i++) {
                lengthInit= lengthInit + (testEntry.points.get(i)- training.points.get(i))*(testEntry.points.get(i)- training.points.get(i));
            }
            float lengthFin = (float) Math.sqrt(lengthInit);
            //System.out.println(training.label + " " + count);
            count++;
            lengthLabelList.add(new LengthLabelObject(lengthFin, training.label));
        }
        Collections.sort(lengthLabelList);
    }

    String labelReturn(){
        List<LengthLabelObject> kList = lengthLabelList.subList(0, Math.min(lengthLabelList.size(), k));
        /*for (LengthLabelObject klista: kList) {
            System.out.println(klista.length*klista.length + " " + klista.label);
        }*/
        Map<String, Integer> labelCountMap = new HashMap<>();
        for (LengthLabelObject str : kList) {
            String label = str.label;
            int count = labelCountMap.getOrDefault(label, 0);
            labelCountMap.put(label, count + 1);
        }
        /*
        System.out.println("HashMap contents:");
        for (Map.Entry<String, Integer> entry : labelCountMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        */
        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;

        for (Map.Entry<String, Integer> entry : labelCountMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        kList = null;
        this.lengthLabelList = new ArrayList<>();
        this.testEntry = null;
        return maxKey;
    }
}