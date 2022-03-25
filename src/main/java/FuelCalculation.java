import java.util.List;

public class FuelCalculation {

    public static int calculateFuelWithoutMass(int inputMass) {
        int calculatedMass;
        calculatedMass = (inputMass / 3) - 2;
        return calculatedMass;
    }

    public static int calculateFuelWithoutMass(List<Integer> fuelValues) {
        if (fuelValues == null)
            throw new IllegalArgumentException("Paramter is null");
        int sum = 0;
        for (Integer value : fuelValues) {
            sum += FuelCalculation.calculateFuelWithoutMass(value);
        }
        return sum;
    }

    public static int calculateFuelWithMass(int inputMass) {
        inputMass = calculateFuelWithoutMass(inputMass);
        int calculatedFuel = inputMass;
        while (inputMass > 0) {
            inputMass = calculateFuelWithoutMass(inputMass);
            if (inputMass > 0) {
                calculatedFuel += inputMass;
            }
        }
        return calculatedFuel;
    }

    public static int calculateFuelWithMass(List<Integer> fuelValues) {
        if (fuelValues == null)
            throw new IllegalArgumentException("Paramter is null");
        int sum = 0;
        for (Integer value : fuelValues) {
            sum += FuelCalculation.calculateFuelWithMass(value);
        }
        return sum;

    }

}
