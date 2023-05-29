package project2;

import java.util.Random;

public class Rocket implements SpaceShip{
	  private int rocketCost;
	    private int rocketWeight;
	    private int maxWeight;
	    private double chanceOfLaunchExplosion;
	    private double chanceOfLandingCrash;
	    private int currentWeight;
	    
	    public Rocket(int rocketCost, int rocketWeight, int maxWeight, double chanceOfLaunchExplosion, double chanceOfLandingCrash) {
	        this.rocketCost = rocketCost;
	        this.rocketWeight = rocketWeight;
	        this.maxWeight = maxWeight;
	        this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
	        this.chanceOfLandingCrash = chanceOfLandingCrash;
	        this.currentWeight = rocketWeight;
	    }

	@Override
	public boolean launch() {
		 double random = Math.random();
	        double explosionProbability = chanceOfLaunchExplosion * (double)currentWeight / (double)maxWeight;
	        return random > explosionProbability;
	 
	}

	@Override
	public boolean land() {
		double random = Math.random();
        double crashProbability = chanceOfLandingCrash * (double)currentWeight / (double)maxWeight;
        return random > crashProbability;
		
	}

	@Override
	public boolean canCarry(Item item) {
		  return currentWeight + item.getWeight() <= maxWeight;
		
	}

	@Override
	public void carry(Item item) {
		 currentWeight += item.getWeight();
		// TODO Auto-generated method stub
		
	}
	

	
}
