package com.classifiers;

import com.classifiers.bayesnaive.BayesNaive;
import com.classifiers.bayesnaive.TestData;
import com.classifiers.bayesnaive.TrainingData;

public class Main {

    public static void main(String[] args) {
        int n=3,m=3;
        String presumptions[]=new String[]{"male","female","transgender"};
        BayesNaive bayesNaive=new BayesNaive(n,presumptions);

        bayesNaive.setPresumption_name("Sex");

        String attr_names[]= new String[]{"Height", "Weight","FootSize"};

        bayesNaive.setAttributes_names(attr_names);

        bayesNaive.addTrainData(new TrainingData("male",new double[]{6, 180, 12}));
        bayesNaive.addTrainData(new TrainingData("male",new double[]{5.92, 190, 11}));
        bayesNaive.addTrainData(new TrainingData("male",new double[]{5.58, 170, 12}));
        bayesNaive.addTrainData(new TrainingData("male",new double[]{5.92, 165, 10}));
        bayesNaive.addTrainData(new TrainingData("female",new double[]{5, 100, 6}));
        bayesNaive.addTrainData(new TrainingData("female",new double[]{5.5, 150, 8}));
        bayesNaive.addTrainData(new TrainingData("female",new double[]{5.42, 130, 7}));
        bayesNaive.addTrainData(new TrainingData("female",new double[]{5.75, 150, 9}));
        bayesNaive.addTrainData(new TrainingData("transgender",new double[]{4, 200, 5}));
        bayesNaive.addTrainData(new TrainingData("transgender",new double[]{4.10, 150, 8}));
        bayesNaive.addTrainData(new TrainingData("transgender",new double[]{5.42, 190, 7}));
        bayesNaive.addTrainData(new TrainingData("transgender",new double[]{5.50, 150, 9}));

        bayesNaive.addTestData(new TestData(new double[]{4, 150, 12}));

        bayesNaive.trainClassifier();
        bayesNaive.testClassifier(new TestData(new double[]{4, 150, 12}));
    }
}