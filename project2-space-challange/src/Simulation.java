import java.util.*;
import java.io.*;

public class Simulation {
    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        ArrayList<Item> items = new ArrayList<Item>();

        while(scanner.hasNextLine()) {
            Item newItem = new Item();

            String [] itemData = scanner.nextLine().split("=");
            newItem.name = itemData[0];
            newItem.weight = Integer.parseInt(itemData[1]) / 1000;
            items.add(newItem);
        }

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();
        Rocket currentRocket = new U1();
        for (Item i : items) {
            if(currentRocket.canCarry(i)) {
                currentRocket.carry(i);
            } else {
                u1Rockets.add(currentRocket);
                currentRocket = new U1();
                if(currentRocket.canCarry(i)) {
                    currentRocket.carry(i);
                } else {
                    System.out.println("Current Item weight cannot be carried at all");
                }
            }
        }

        u1Rockets.add(currentRocket);

        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();

        Rocket currentRocket = new U2();
        for (Item i : items) {
            if(currentRocket.canCarry(i)) {
                currentRocket.carry(i);
            } else {
                u2Rockets.add(currentRocket);
                currentRocket = new U2();
                if(currentRocket.canCarry(i)) {
                    currentRocket.carry(i);
                } else {
                    System.out.println("Current Item weight cannot be carried at all");
                }
            }
        }

        u2Rockets.add(currentRocket);
        return u2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;

        for (Rocket rocket : rockets) {
            if(!rocket.land() || !rocket.launch()) {
                totalBudget += (rocket.cost * 2);
            } else  {
                totalBudget += rocket.cost;
            }
        }

        return totalBudget;
    }
}
