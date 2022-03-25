
public class FuelCalculation {
    public static void main(String[] args) {
        readTextFile myFile = readTextFile.getFuelValuesInstance();
        myFile.setInputfile("src/test/resources/fuelInput");
        myFile.readFuelValues();
    }

}
