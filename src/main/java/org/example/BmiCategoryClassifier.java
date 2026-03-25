package org.example;

public class BmiCategoryClassifier {

    public String classify(double bmi) {
        if (bmi <= 0) {
            throw new IllegalArgumentException("BMI must be greater than 0");
        }

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
