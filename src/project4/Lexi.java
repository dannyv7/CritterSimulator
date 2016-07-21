package project4;

/**
 * A sedentary Critter
 * Prefers to stay still and rarely walks
 * Prefers to move in NSWE directions
 * Very conservative - only fights when it has a high chance of winning i.e. energy >= 80
 * Does not fight one another
 * @author danny
 *
 */
public class Lexi extends Critter{
	private int[] directionalPref = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 2, 4, 6, 0, 2, 4, 6};
	private int[] behavioralPref = new int[]{0, 1, 0, 1, 0, 1};
	@Override 
	public String toString(){
		return("L");
	}

	@Override
	public void doTimeStep() {
		this.setMoved(false);
		int dir = directionalPref[getRandomInt(15)];
		int behavior = getRandomInt(5);
		if(behavioralPref[behavior] == 0){}
		else if(behavioralPref[behavior] == 1){walk(dir);}
		else if(behavioralPref[behavior] == 2){run(dir);}
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Lexi();
			reproduce(child, 0);
		}
		
	}

	public boolean fight(String oponent) {
		if (oponent.equals("@")) {
			return true;
		} else if (oponent.equals("C")) {
			return this.getEnergy() >= 80;
		} else if (oponent.equals("M")) {
			return this.getEnergy() >= 80;
		} else if (oponent.equals("L")) {
			return false;
		} else if (oponent.equals("A")) {
			return this.getEnergy() >= 80;
		} else if (oponent.equals("K")) {
			return this.getEnergy() >= 80;
		} 
		return false;
	}

}
