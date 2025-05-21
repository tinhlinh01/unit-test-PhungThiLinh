package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_NormalCase() {
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.5, 7.5, 6.0, 10.0)));
    }

    @Test
    public void testCountExcellentStudents_WithInvalidScores() {
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(-1.0, 12.0, 8.5)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_NullList() {
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCountExcellentStudents_AllInvalidScores() {
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-3.0, 11.0, 20.0)));
    }

    @Test
    public void testCountExcellentStudents_SomeNulls() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(8.5, null, 9.0, null, 6.0)));
    }


    @Test
    public void testValidAverage_NormalCase() {
        assertEquals(7.0, analyzer.calculateValidAverage(Arrays.asList(8.0, 6.0, 7.0)), 0.0001);
    }

    @Test
    public void testValidAverage_WithInvalidScores() {
        assertEquals(8.5, analyzer.calculateValidAverage(Arrays.asList(-2.0, 8.0, 9.0, 15.0)), 0.0001);
    }

    @Test
    public void testValidAverage_AllInvalidScores() {
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 12.0, 100.0)), 0.0001);
    }

    @Test
    public void testValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.0001);
    }

    @Test
    public void testValidAverage_NullList() {
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.0001);
    }

    @Test
    public void testValidAverage_WithNullElements() {
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(8.0, null, 7.0, null)), 0.0001);
    }


}
