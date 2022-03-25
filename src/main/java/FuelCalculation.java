import java.util.List;

public class FuelCalculation {
    public static void main(String[] args) {
        int sum = 0 ;
        readTextFile myFile = readTextFile.getFuelValuesInstance();
        myFile.setInputfile("src/test/resources/fuelInput");
        myFile.readFuelValues();

        List<Integer> FuelValues = myFile.getFuelValuesAsArray();
        int i =0;

        //Part1:
        while( i < FuelValues.size()) {
            int result = FuelValues.get(i);
            result = calculateFuelWithoutMass(result);
            sum += result;
            i++;
        }
        System.out.println("Calculated Fuel Part1: " + sum);

        //Part2:
        i =0;
        sum = 0;
        while( i < FuelValues.size()) {
            int result = FuelValues.get(i);
            sum += calculateFuelWithMass(result);
            //System.out.println(sum);
            i++;
        }
        System.out.println("Calculated Fuel Part2: " + sum);

    }

    public static int calculateFuelWithoutMass(List<Integer> FuelValues) {
        int sum = 0;
        for (Integer value : FuelValues) {
            sum += FuelCalculation.calculateFuelWithoutMass(value);
        }
        return sum;
    }


    public static int calculateFuelWithoutMass(int inputMass){
        int calculatedMass;
        calculatedMass = (inputMass / 3 ) - 2;
        return calculatedMass;
    }

    public static int calculateFuelWithMass(List<Integer> FuelValues) {
        int sum = 0;
        for (Integer value : FuelValues) {
            sum += FuelCalculation.calculateFuelWithMass(value);
        }
        return sum;
    }

    public static int calculateFuelWithMass(int inputMass){
        inputMass = calculateFuelWithoutMass(inputMass);
        int calculatedFuel = inputMass;
        //System.out.println ("calculatedFule :" + calculatedFuel);
        while(inputMass > 0) {
            inputMass = calculateFuelWithoutMass(inputMass);
            if (inputMass > 0){
                //System.out.println(inputMass);
                calculatedFuel += inputMass;

            }
            //System.out.println(inputMass);
            //System.out.println("Calculated Fuel" + calculatedFuel);
        }
        return calculatedFuel;
    }

}
