package org.example;

public class AgeCategoryClassifier {

    public String classify(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (age <= 6) {
            return "Barn";
        } else if (age <= 19) {
            return "Skolungdom";
        } else if (age <= 25) {
            return "Ungdom";
        } else if (age <= 64) {
            return "Vuxen";
        } else {
            return "Senior";
        }
    }
}