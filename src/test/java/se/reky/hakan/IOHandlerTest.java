package se.reky.hakan;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class IOHandlerTest {


    private IOHandler testingIOHandler (String data){
        return new IOHandler(new Scanner(data));
    }


    @Test
    @DisplayName("TEST: Testing that the scanner takes in and returns an INT")
    public void testingIOHandler() {

        boolean hasNextInt = testingIOHandler("13").hasNextInt();

        Assertions.assertTrue(hasNextInt);


    }


}
