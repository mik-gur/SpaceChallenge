import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(Scanner scanner) {
        //Adding all items to one Array
        ArrayList<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // line = building tools=2000
            Integer indexOf = line.indexOf("=");
            String name = line.substring(0, indexOf);
            String weight = line.substring(indexOf + 1);
            Item newItem = new Item(name, Integer.parseInt(weight));
            items.add(newItem);

        }
        return items;
    }

    //Adding items for Rocket Phase 1
    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        U1 rocket = new U1();
        ArrayList<Rocket> listU1 = new ArrayList<>();
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                listU1.add(rocket);
                rocket = new U1();
            }
        }
        return listU1;
    }

    //Adding items for Rocket Phase 2
    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        U2 rocket = new U2();
        ArrayList<Rocket> listU2 = new ArrayList<>();
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                listU2.add(rocket);
                rocket = new U2();
            }
        }
        return listU2;
    }

    //Starting simulation of landing and launching
    public int runSimulation(ArrayList<Rocket> listU1) {
        int cost = 0;
        for (Rocket rocket : listU1) {
            boolean launch;
            boolean land;
            do {
                launch = rocket.launch();
                land = rocket.land();
                cost += rocket.cost;

            }
            //Simulation will end, when launch and land will be succeeded
            while (launch == false || land == false);
        }
            return cost;
    }
}
