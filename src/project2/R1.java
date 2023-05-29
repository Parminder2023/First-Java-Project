package project2;

public class R1 extends Rocket{

	public R1(int rocketCost, int rocketWeight, int maxWeight, double chanceOfLaunchExplosion,
			double chanceOfLandingCrash) {
		super(rocketCost, rocketWeight, maxWeight, chanceOfLaunchExplosion, chanceOfLandingCrash);
		// TODO Auto-generated constructor stub
	}
	 public R1() {
	        super(100_000_000, 10_000, 18_000, 0.05, 0.01);
	    }
	    
	    @Override
	    public boolean launch() {
			return false;
	       
	    }
	    
	    @Override
	    public boolean land() {
			return false;
	        
	    }
	}
	


	
