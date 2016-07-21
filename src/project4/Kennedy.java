package project4;
/**
 * An active Critter
 * Prefers to run, occassionally walks, and rarely rests
 * Prefers going in forward directions (N, NW, NE)
 * Extremely aggressive - will fight anyone as long as energy >= 20
 * @author danny
 *
 */
public class Kennedy extends Critter{
	private int[] directionalPref = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 0, 7, 6, 0, 1, 7};
	private int[] behavioralPref = new int[]{0,1,2, 2, 1, 2};
	@Override 
	public String toString(){
		return("K");
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
			Critter child = new Kennedy();
			reproduce(child, 0);
		}
	}

	public boolean fight(String oponent) {
		if (oponent.equals("@")) {
			return true;
		} else if (oponent.equals("C")) {
			return this.getEnergy() >= 20;
		} else if (oponent.equals("M")) {
			return this.getEnergy() >= 20;
		} else if (oponent.equals("L")) {
			return this.getEnergy() >= 20;
		} else if (oponent.equals("A")) {
			return this.getEnergy() >= 20;
		} else if (oponent.equals("K")) {
			return this.getEnergy() >= 20;
		} 
		return false;
	}

}
