/*
GIT Repo: https://github.com/fpanek/prog2-ss21-exercise1
 */

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FuelCalculationTest {
    /* Examples
    For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
    For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
    For a mass of 1969, the fuel required is 654.
    For a mass of 100756, the fuel required is 33583.
     */
    @Test
    void FuelCalculation_Example1(){
        int inputValue = 12;
        int expectedValue = 2;
        int actualResult = FuelCalculation.calculateFuelWithoutMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void FuelCalculation_Example2(){
        int inputValue = 14;
        int expectedValue = 2;
        int actualResult = FuelCalculation.calculateFuelWithoutMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void FuelCalculation_Example3(){
        int inputValue = 1969;
        int expectedValue = 654;
        int actualResult = FuelCalculation.calculateFuelWithoutMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void FuelCalculation_Example4(){
        int inputValue = 100756;
        int expectedValue = 33583;
        int actualResult = FuelCalculation.calculateFuelWithoutMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    //TCs for part 2
    @Test
    void FuelCalculation_Example5(){
        int inputValue = 14;
        int expectedValue = 2;
        int actualResult = FuelCalculation.calculateFuelWithMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void FuelCalculation_Example6(){
        int inputValue = 1969;
        int expectedValue = 966;
        int actualResult = FuelCalculation.calculateFuelWithMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void FuelCalculation_Example7(){
        int inputValue = 100756;
        int expectedValue = 50346;
        int actualResult = FuelCalculation.calculateFuelWithMass(inputValue);
        assertEquals(expectedValue,actualResult);
    }

    @Test
    void goForGoldPart1(){
        int actual = FuelCalculation.calculateFuelWithoutMass(getFileValues());
        int expected = 3178783;
        assertEquals(expected, actual);
    }

    @Test
    void goForGoldPart1_Scenario2_Null(){
        int actual = FuelCalculation.calculateFuelWithoutMass(null);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void goForGoldPart2(){
        int actual = FuelCalculation.calculateFuelWithMass(getFileValues());
        int expected = 4765294;
        assertEquals(expected, actual);
    }

    @Test
    void goForGoldPart2_Scenario2_Null(){
        int actual = FuelCalculation.calculateFuelWithMass(null);
        int expected = 0;
        assertEquals(expected, actual);
    }

    private List<Integer> getFileValues() {
        readTextFile myFile = readTextFile.getFuelValuesInstance();
        myFile.setInputfile("src/test/resources/fuelInput");
        myFile.readFuelValues();

        List<Integer> FuelValues = myFile.getFuelValuesAsArray();
        return FuelValues;
    }


}
