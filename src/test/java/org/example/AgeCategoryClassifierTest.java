package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AgeCategoryClassifierTest {

    private final AgeCategoryClassifier classifier = new AgeCategoryClassifier();

    @ParameterizedTest
    @CsvSource({
            "0, Barn",
            "6, Barn",
            "7, Skolungdom",
            "19, Skolungdom",
            "20, Ungdom",
            "25, Ungdom",
            "26, Vuxen",
            "64, Vuxen",
            "65, Senior",
            "100, Senior"
    })
    void shouldClassifyValidAgesCorrectly(int age, String expectedCategory) {
        assertEquals(expectedCategory, classifier.classify(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -100})
    void shouldThrowExceptionForNegativeAge(int age) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> classifier.classify(age)
        );

        assertEquals("Age cannot be negative", exception.getMessage());
    }

    @Test
    void shouldReturnBarnForTypicalMiddleValue() {
        assertEquals("Barn", classifier.classify(3));
    }
}