import java.util.List;

public class FuelCalculation {

    public static int calculateFuelWithoutMass(int inputMass) {
        int calculatedMass;
        calculatedMass = (inputMass / 3) - 2;
        return calculatedMass;
    }

    public static int calculateFuelWithoutMass(List<Integer> FuelValues) {
        int sum = 0;
        try {
            for (Integer value : FuelValues) {
                sum += FuelCalculation.calculateFuelWithoutMass(value);
            }
            return sum;
        }catch (NullPointerException e){
            System.out.println("Array list is empty");
            return 0;
        }
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

    public static int calculateFuelWithMass(List<Integer> FuelValues) {
        int sum = 0;
        try {
            for (Integer value : FuelValues) {
                sum += FuelCalculation.calculateFuelWithMass(value);
            }
            return sum;
        }catch (NullPointerException e){
            System.out.println("Array list is empty");
            return 0;
        }
    }

}
