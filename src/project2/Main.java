package project2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) throws FileNotFoundException {
	        Stimulation stimulation = new Stimulation();
	        ArrayList<Item> items = stimulation.loadItems("Phase-1.txt");

	        ArrayList<Rocket> fleetR1 = stimulation.loadU1(items);
	        int totalBudgetR1 = stimulation.runSimulation(fleetR1);
	        System.out.println("Total cost for R1 fleet: $" + totalBudgetR1 + " million");

	        ArrayList<Rocket> fleetR2 = stimulation.loadU2(items);
	        int totalBudgetR2 = stimulation.runSimulation(fleetR2);
	        System.out.println("Total cost for R2 fleet: $" + totalBudgetR2 + " million");
	    }
	}
	


