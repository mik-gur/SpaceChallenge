import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static File Phase1 = new File("Phase-1.txt");
    static File Phase2 = new File("Phase-2.txt");

    public static void main(String[] args) throws Exception {
        Scanner phase1Scanner = new Scanner(Phase1);
        Scanner phase2Scanner = new Scanner(Phase2);

        Simulation simulation = new Simulation();
        //Loading Items from File
        ArrayList<Item> itemsFromPhase1 = simulation.loadItems(phase1Scanner);
        ArrayList<Item> itemsFromPhase2 = simulation.loadItems(phase2Scanner);
        //Simulation of adding Items to Rockets
        ArrayList<Rocket> u1items = simulation.loadU1(itemsFromPhase1);
        ArrayList<Rocket> u2items = simulation.loadU2(itemsFromPhase2);
        //Process of simulation
        simulation.runSimulation(u1items);
        simulation.runSimulation(u2items);

        System.out.println("U1 total budget: " + simulation.runSimulation(u1items));
        System.out.println("U2 total budget: " + simulation.runSimulation(u2items));
    }
}
