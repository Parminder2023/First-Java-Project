package project2;

import java.util.ArrayList;

public class Stimulation {
	ArrayList<Item> loadItems(String filename) throws java.io.FileNotFoundException {
        ArrayList<Item> items = new ArrayList<>();
        java.io.File file = new java.io.File(filename);
		java.util.Scanner input = new java.util.Scanner("Phase-1.txt");
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    String[] parts = line.split("=");
		    String itemName = parts[0];
		    int itemWeight = Integer.parseInt(parts[1]);
		    Item item = new Item(itemName, itemWeight);
		    items.add(item);
		}
		input.close();
        return items;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new R1();
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new R1();
                rocket.carry(item);
            }
        }
        rockets.add(rocket);
        return rockets;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new R2();
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new R2();
                rocket.carry(item);
            }
        }
        rockets.add(rocket);
        return rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        for (Rocket rocket : rockets) {
            totalBudget += rocket.getRocketCost();
            while (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getRocketCost();
            }
        }
        return totalBudget;
    }
}


