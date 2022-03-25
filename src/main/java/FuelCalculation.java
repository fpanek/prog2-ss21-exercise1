import java.util.List;

public class FuelCalculation {
    public static void main(String[] args) {
        int sum = 0 ;
        readTextFile myFile = readTextFile.getFuelValuesInstance();
        myFile.setInputfile("src/test/resources/fuelInput");
        myFile.readFuelValues();

        List<Integer> FuelValues = myFile.getFuelValuesAsArray();
        //System.out.println(FuelValues);
        int i =0;
        while( i < FuelValues.size()) {
            int result = FuelValues.get(i);
            result = calculateMass(result);
            //System.out.println(result);
            sum += result;
            i++;
        }
        System.out.println(sum);

    }

    public static int calculateMass(int inputMass){
        int calculatedMass;
        calculatedMass = (inputMass / 3 ) -2;
        return calculatedMass;
    }

}
