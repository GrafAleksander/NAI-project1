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

    void inputTestEntry(List<Float> testPoints){
        this.testEntry = new Test_Entry(testPoints);
    }

    void fillLengthLabelList(){
        for (Training_Entry training: trainingData) {
            float lengthInit = 0;
            for (int i = 0; i < training.points.size(); i++) {
                lengthInit= lengthInit + training.points.get(i)*training.points.get(i);
            }
            float lengthFin = (float) Math.sqrt(lengthInit);
            lengthLabelList.add(new LengthLabelObject(lengthFin, training.label));
        }
        Collections.sort(lengthLabelList);
    }

    String labelReturn(){
        List<LengthLabelObject> kList = lengthLabelList.subList(0, Math.min(lengthLabelList.size(), k));
        Map<String, Integer> labelCountMap = new HashMap<>();
        for (LengthLabelObject str : kList) {
            String label = str.label;
            int count = labelCountMap.getOrDefault(label, 0);
            labelCountMap.put(label, count + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;

        for (Map.Entry<String, Integer> entry : labelCountMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}