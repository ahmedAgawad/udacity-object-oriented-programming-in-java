import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation s = new Simulation();


        ArrayList<Item> items1 = s.loadItems("phase-1.txt");
        ArrayList<Item> items2 = s.loadItems("phase-2.txt");

        ArrayList<Rocket> rocketsU1 = s.loadU1(items1);
        ArrayList<Rocket> rocketsU2 = s.loadU2(items2);

        int total1 =  s.runSimulation(rocketsU1);
        int total2 =   s.runSimulation(rocketsU2);

        System.out.println(total1);
        System.out.println(total2);
    }
}