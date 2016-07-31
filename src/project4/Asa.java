/* CRITTERS Asa.java
 * EE422C Project 4 submission by
 * Replace <...> with your actual data.
 * Danny Vo
 * dpv292
 * 76550
 * Zain Modi
 * zam374
 * 76550
 * Slip days used: 1
 * Summer 2016
 */

package project4;

/**
 * A balanced behaviored Critter
 * Has no preference between walking/running/resting
 * Prefers to move in diagonal directions
 * Will fight when odds are sllightly in their favor (energy >= 60)
 * @author danny
 *
 */
public class Asa extends Critter{
	private int[] directionalPref = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 1, 3, 5, 7, 1, 3, 5, 7};
	private int[] behavioralPref = new int[]{0,1,2, 0, 1, 2};
	@Override 
	public String toString(){
		return("A");
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
			Critter child = new Asa();
			reproduce(child, 0);
		}
		
	}

	public boolean fight(String oponent) {
		if (oponent.equals("@")) {
			return true;
		} else if (oponent.equals("C")) {
			return this.getEnergy() >= 60;
		} else if (oponent.equals("M")) {
			return this.getEnergy() >= 60;
		} else if (oponent.equals("L")) {
			return this.getEnergy() >= 60;
		} else if (oponent.equals("A")) {
			return this.getEnergy() >= 60;
		} else if (oponent.equals("K")) {
			return this.getEnergy() >= 60;
		} 
		return false;
	}

}
