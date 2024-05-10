package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaUtilScannerTest {

    @Test
    @DisplayName("Test för att se att scannern fungerar som den ska")
    public void testScannerReturnsExpectedText() {
        String expectedText = "test data";
        Scanner scanner = new Scanner(expectedText);
        String actualText = scanner.nextLine();
        assertEquals(expectedText, actualText);
    }
}