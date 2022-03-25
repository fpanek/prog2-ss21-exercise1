import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readTextFile {
    String inputfile;
    List<Integer> fuelValues = new ArrayList<Integer>();
    private static final readTextFile readTextFileObject = new readTextFile();

     private readTextFile() {
        //only one instance allowd
    }

    public void setInputfile(String inputfile) {
        this.inputfile = inputfile;
    }

    public static readTextFile getFuelValuesInstance() {
        return readTextFileObject;
    }

    public List<Integer> getFuelValuesAsArray(){
         return fuelValues;
    }

    public  void readFuelValues(){
         fuelValues.clear();
         try{
             BufferedReader bf = new BufferedReader(new FileReader(inputfile));
         String line =  bf.readLine();
         while (line != null) {
            fuelValues.add(Integer.parseInt(line));
            //System.out.println(line);
            line = bf.readLine();
         }
         bf.close();
         }catch (FileNotFoundException e){
             System.out.println("File " + inputfile + "not found");
         }catch (IOException e){
             e.printStackTrace();
         }
    }
}
