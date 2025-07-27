package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvParamsDemo2 {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testingFile.csv", numLinesToSkip = 1) // This reads data from a CSV file
    void add(int a, int b) {
        int expected = 40;
        int actual = a + b;
        assertEquals(expected, actual);
    }
}
