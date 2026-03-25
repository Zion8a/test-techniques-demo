package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BmiCategoryClassifierTest {

    private final BmiCategoryClassifier classifier = new BmiCategoryClassifier();

    @ParameterizedTest
    @CsvSource({
            "18.4, Underweight",
            "18.5, Normal weight",
            "22.0, Normal weight",
            "24.9, Normal weight",
            "25.0, Overweight",
            "27.5, Overweight",
            "29.9, Overweight",
            "30.0, Obesity",
            "35.0, Obesity"
    })
    void shouldClassifyValidBmiValuesCorrectly(double bmi, String expectedCategory) {
        assertEquals(expectedCategory, classifier.classify(bmi));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -1.0, -5.5})
    void shouldThrowExceptionForInvalidBmiValues(double bmi) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> classifier.classify(bmi)
        );

        assertEquals("BMI must be greater than 0", exception.getMessage());
    }

    @Test
    void shouldReturnNormalWeightForTypicalMiddleValue() {
        assertEquals("Normal weight", classifier.classify(21.5));
    }
}