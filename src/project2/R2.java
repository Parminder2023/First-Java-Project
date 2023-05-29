package project2;

public class R2 extends Rocket{

	public R2(int rocketCost, int rocketWeight, int maxWeight, double chanceOfLaunchExplosion,
			double chanceOfLandingCrash) {
		super(rocketCost, rocketWeight, maxWeight, chanceOfLaunchExplosion, chanceOfLandingCrash);
		// TODO Auto-generated constructor stub
	}
	
	public R2() {
        super(120_000_000, 18_000, 29_000, 0.04, 0.08);
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

	